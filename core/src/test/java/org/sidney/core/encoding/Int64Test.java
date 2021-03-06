package org.sidney.core.encoding;

import org.junit.Assert;
import org.sidney.core.encoding.int64.*;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Int64Test extends AbstractEncoderTests<Int64Encoder, Int64Decoder, long[]> {
    private final List<EncoderDecoderPair<Int64Encoder, Int64Decoder>> pairs = Arrays.asList(
            new EncoderDecoderPair<Int64Encoder, Int64Decoder>(new PlainInt64Encoder(), new PlainInt64Decoder()),
            new EncoderDecoderPair<Int64Encoder, Int64Decoder>(new GroupVarInt64Encoder(), new GroupVarInt64Decoder())
    );

    @Override
    protected BiConsumer<Int64Encoder, long[]> encodingFunction() {
        return new BiConsumer<Int64Encoder, long[]>() {
            @Override
            public void accept(Int64Encoder encoder, long[] longs) {
                for (long l : longs) {
                    encoder.writeLong(l);
                }
            }
        };
    }

    //TODO: make this generate blocks of different bitwidths
    @Override
    protected IntFunction<long[]> dataSupplier() {
        return new IntFunction<long[]>() {
            @Override
            public long[] apply(int size) {
                Random random = new Random(11L);
                long[] arr = new long[size];
                for (int i = 0; i < size; i++) {
                    arr[i] = random.nextLong();
                }
                return arr;
            }
        };
    }

    @Override
    protected BiConsumer<Int64Decoder, long[]> consumeAndAssert() {
        return new BiConsumer<Int64Decoder, long[]>() {
            @Override
            public void accept(Int64Decoder decoder, long[] nums) {
                long[] ints = decoder.nextLongs(nums.length);
                Assert.assertArrayEquals(nums, ints);
            }
        };
    }

    @Override
    protected List<EncoderDecoderPair<Int64Encoder, Int64Decoder>> pairs() {
        return pairs;
    }

    @Override
    protected Class getRunningClass() {
        return this.getClass();
    }
}
