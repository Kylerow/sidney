package org.sidney.encoding.float64;

import org.junit.Assert;
import org.junit.Test;
import org.sidney.core.Bytes;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Random;

public class KryoFloat64EncoderTest {
    private final double[] doubles;
    private final int num = 65536;

    public KryoFloat64EncoderTest() {
        doubles = new double[num];
        Random random = new Random(11L);
        double[] candidates = new double[] { 0.0, 0.5, 1.0, 1.5, 2.0, 2.5, 3.0 };
        for(int i = 0; i < num; i++) {
            doubles[i] = candidates[random.nextInt(candidates.length - 1)];
        }
    }

    @Test
    public void readWrite() throws IOException {
        KryoFloat64Encoder kryoEncoder = new KryoFloat64Encoder();
        kryoEncoder.writeDoubles(doubles);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        kryoEncoder.writeToStream(baos);

        KryoFloat64Decoder decoder = new KryoFloat64Decoder();
        decoder.readFromStream(Bytes.wrap(baos.toByteArray()));
        Assert.assertArrayEquals(decoder.nextDoubles(num), doubles, 0);
    }
}