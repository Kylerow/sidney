package org.sidney.core.encoding.string;

import org.sidney.core.encoding.AbstractDecoder;
import org.sidney.core.encoding.Encoding;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public class PlainStringDecoder extends AbstractDecoder implements StringDecoder {
    private final Charset charset = Charset.forName("UTF-8");

    public String readString() {
        int length = readIntLE();
        byte[] bytes = readBytesInternal(length);
        return charset.decode(ByteBuffer.wrap(bytes)).toString();
    }

    @Override
    public String[] readStrings(int num) {
        String[] strings = new String[num];
        for (int i = 0; i < num; i++) {
            strings[i] = readString();
        }
        return strings;
    }

    @Override
    public String supportedEncoding() {
        return Encoding.PLAIN.name();
    }
}
