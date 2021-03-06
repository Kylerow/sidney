package org.sidney.core.encoding.unsafe;

import sun.misc.Unsafe;

public class UnsafeInts {
    private static Unsafe unsafe = UnsafeUtil.unsafe();

    public static void copyIntsToBytes(
            int[] sourceArray, long sourcePos, byte[] destinationArray, long destinationPos, long length
    ) {
        unsafe.copyMemory(
                sourceArray, UnsafeUtil.intArrayBaseOffset + sourcePos, destinationArray,
                UnsafeUtil.byteArrayBaseOffset + destinationPos, length
        );
    }
}
