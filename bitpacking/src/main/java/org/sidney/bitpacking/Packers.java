package org.sidney.bitpacking;

public enum Packers {
    LITTLE_ENDIAN {
        @Override
        public Int32BytePacker packer32(int bitwidth) {
            return ByteBitPacking32BitLE.factory.newBytePacker(bitwidth);
        }
    },
    BIG_ENDIAN {
        @Override
        public Int32BytePacker packer32(int bitwidth) {
            return ByteBitPacking32BitBE.factory.newBytePacker(bitwidth);
        }
    };

    public abstract Int32BytePacker packer32(int bitwidth);
}
