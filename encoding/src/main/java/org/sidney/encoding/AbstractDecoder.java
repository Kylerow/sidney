package org.sidney.encoding;

import com.google.common.io.LittleEndianDataInputStream;

import java.io.IOException;
import java.io.InputStream;
import java.nio.BufferUnderflowException;

public abstract class AbstractDecoder implements Decoder {
    private byte[] buffer;
    private int position = 0;
    private int numValues = 0;

    public int getNumValues() {
        return numValues;
    }

    public byte[] getBuffer() {
        return buffer;
    }

    public int getPosition() {
        return position;
    }

    public void incrementPosition(int size) {
        position += size;
    }

    @Override
    public void readFromStream(InputStream inputStream) throws IOException {
        position = 0;
        LittleEndianDataInputStream dis = new LittleEndianDataInputStream(inputStream);
        numValues = dis.readInt();
        int bufferSize = dis.readInt();

        buffer = new byte[bufferSize];
        inputStream.read(buffer);
    }

    protected byte readByte() {
        require(1);
        return buffer[position++];
    }

    protected boolean readBoolean() {
        require(1);
        return buffer[position++] > 0;
    }

    protected int readIntLE() {
        require(4);

        int res = ((buffer[position + 3] & 0xff) << 24) | ((buffer[position + 2] & 0xff) << 16) |
            ((buffer[position + 1] & 0xff) << 8) | (buffer[position] & 0xff);

        position += 4;
        return res;
    }

    protected long readLongLE() {
        require(8);
        long res =
            ((long)(buffer[position + 7] & 0xff) << 56) |
            ((long)(buffer[position + 6] & 0xff) << 48) |
            ((long)(buffer[position + 5] & 0xff) << 40) |
            ((long)(buffer[position + 4] & 0xff) << 32) |
            ((long)(buffer[position + 3] & 0xff) << 24) |
            ((long)(buffer[position + 2] & 0xff) << 16) |
            ((long)(buffer[position + 1] & 0xff) << 8) |
            (long)(buffer[position] & 0xff);
        position += 8;
        return res;
    }

    protected void trashBuffer() {
        buffer = null;
    }

    private void require(int size) {
        if (position + size > buffer.length) {
            throw new BufferUnderflowException();
        }
    }
}