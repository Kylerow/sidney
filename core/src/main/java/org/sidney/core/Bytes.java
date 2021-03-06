package org.sidney.core;

import java.io.ByteArrayInputStream;

public class Bytes {
    public static int sizeInBytes(int num, int bitwidth) {
        return num * (int) (Math.ceil(bitwidth / 8D));
    }

    public static void writeIntOn4Bytes(int value, byte[] bytes, int offset) {
        bytes[offset + 3] = (byte) (value >>> 24);
        bytes[offset + 2] = (byte) (value >>> 16);
        bytes[offset + 1] = (byte) (value >>> 8);
        bytes[offset] = (byte) value;
    }

    public static void writeLongOn8Bytes(long value, byte[] bytes, int offset) {
        bytes[offset + 7] = (byte) (value >>> 56);
        bytes[offset + 6] = (byte) (value >>> 48);
        bytes[offset + 5] = (byte) (value >>> 40);
        bytes[offset + 4] = (byte) (value >>> 32);
        bytes[offset + 3] = (byte) (value >>> 24);
        bytes[offset + 2] = (byte) (value >>> 16);
        bytes[offset + 1] = (byte) (value >>> 8);
        bytes[offset] = (byte) value;
    }

    public static int bytesToInt(byte[] bytes, int offset) {
        return ((bytes[offset + 3] & 255) << 24) +
                ((bytes[offset + 2] & 255) << 16) +
                ((bytes[offset + 1] & 255) << 8) +
                ((bytes[offset] & 255));
    }

    public static byte[] intToByteArray(int value) {
        return new byte[]{
                (byte) (value >>> 24),
                (byte) (value >>> 16),
                (byte) (value >>> 8),
                (byte) value};
    }

    public static long bytesToLong(byte[] bytes, int offset) {
        return (((long) bytes[offset + 7] << 56) +
                ((long) (bytes[offset + 6] & 255) << 48) +
                ((long) (bytes[offset + 5] & 255) << 40) +
                ((long) (bytes[offset + 4] & 255) << 32) +
                ((long) (bytes[offset + 3] & 255) << 24) +
                ((long) (bytes[offset + 2] & 255) << 16) +
                ((long) (bytes[offset + 1] & 255) << 8) +
                ((long) (bytes[offset] & 255)));
    }

    public static byte bitAt(byte b, int position) {
        return (byte) (b >> position & 1);
    }

    public static ByteArrayInputStream wrapInStream(byte[] bytes) {
        return new ByteArrayInputStream(bytes);
    }
}
