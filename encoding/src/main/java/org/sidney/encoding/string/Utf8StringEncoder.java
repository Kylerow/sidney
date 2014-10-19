package org.sidney.encoding.string;

import com.google.common.base.Charsets;
import org.sidney.encoding.AbstractEncoder;

import java.nio.charset.Charset;

public class Utf8StringEncoder extends AbstractEncoder implements StringEncoder {
    private final Charset charset = Charsets.UTF_8;

    public void writeString(String s) {
        numValues++;
        writeBytes(charset.encode(s).array());
    }

    @Override
    public void writeStrings(String[] strings) {
        for(String s : strings) {
            writeString(s);
        }
    }

    @Override
    public void reset() {
        super.reset();
    }

    @Override
    public String supportedEncoding() {
        return null;
    }
}
