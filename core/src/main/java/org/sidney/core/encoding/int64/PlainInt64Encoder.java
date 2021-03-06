package org.sidney.core.encoding.int64;

import org.sidney.core.encoding.AbstractEncoder;
import org.sidney.core.encoding.Encoding;

public class PlainInt64Encoder extends AbstractEncoder implements Int64Encoder {
    @Override
    public void writeLong(long value) {
        writeLongInternal(value);
        numValues++;
    }

    @Override
    public void writeLongs(long[] values) {
        for (long l : values) {
            writeLong(l);
        }
    }

    @Override
    public String supportedEncoding() {
        return Encoding.PLAIN.name();
    }
}