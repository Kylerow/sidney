package org.sidney.bitpacking.packers.le.int32;

import org.sidney.bitpacking.Int32BytePacker;

public final class Packer10 extends Int32BytePacker {

    public Packer10() {
        super(10);
    }

    public final void pack8Values(final int[] in, final int inPos, final byte[] out, final int outPos) {
        out[0 + outPos] = (byte) ((
                //                    [76543210]
                //                  [__76543210]
                ((in[0 + inPos] & 1023))) & 255);
        out[1 + outPos] = (byte) ((
                //                    [______10]
                //                          [98________]
                ((in[0 + inPos] & 1023) >>> 8)
                        | //                    [765432__]
                        //                [____543210]
                        ((in[1 + inPos] & 1023) << 2)) & 255);
        out[2 + outPos] = (byte) ((
                //                    [____3210]
                //                        [9876______]
                ((in[1 + inPos] & 1023) >>> 6)
                        | //                    [7654____]
                        //              [______3210]
                        ((in[2 + inPos] & 1023) << 4)) & 255);
        out[3 + outPos] = (byte) ((
                //                    [__543210]
                //                      [987654____]
                ((in[2 + inPos] & 1023) >>> 4)
                        | //                    [76______]
                        //            [________10]
                        ((in[3 + inPos] & 1023) << 6)) & 255);
        out[4 + outPos] = (byte) ((
                //                    [76543210]
                //                    [98765432__]
                ((in[3 + inPos] & 1023) >>> 2)) & 255);
        out[5 + outPos] = (byte) ((
                //                    [76543210]
                //                  [__76543210]
                ((in[4 + inPos] & 1023))) & 255);
        out[6 + outPos] = (byte) ((
                //                    [______10]
                //                          [98________]
                ((in[4 + inPos] & 1023) >>> 8)
                        | //                    [765432__]
                        //                [____543210]
                        ((in[5 + inPos] & 1023) << 2)) & 255);
        out[7 + outPos] = (byte) ((
                //                    [____3210]
                //                        [9876______]
                ((in[5 + inPos] & 1023) >>> 6)
                        | //                    [7654____]
                        //              [______3210]
                        ((in[6 + inPos] & 1023) << 4)) & 255);
        out[8 + outPos] = (byte) ((
                //                    [__543210]
                //                      [987654____]
                ((in[6 + inPos] & 1023) >>> 4)
                        | //                    [76______]
                        //            [________10]
                        ((in[7 + inPos] & 1023) << 6)) & 255);
        out[9 + outPos] = (byte) ((
                //                    [76543210]
                //                    [98765432__]
                ((in[7 + inPos] & 1023) >>> 2)) & 255);
    }

    public final void pack32Values(final int[] in, final int inPos, final byte[] out, final int outPos) {
        out[0 + outPos] = (byte) ((
                //                    [76543210]
                //                  [__76543210]
                ((in[0 + inPos] & 1023))) & 255);
        out[1 + outPos] = (byte) ((
                //                    [______10]
                //                          [98________]
                ((in[0 + inPos] & 1023) >>> 8)
                        | //                    [765432__]
                        //                [____543210]
                        ((in[1 + inPos] & 1023) << 2)) & 255);
        out[2 + outPos] = (byte) ((
                //                    [____3210]
                //                        [9876______]
                ((in[1 + inPos] & 1023) >>> 6)
                        | //                    [7654____]
                        //              [______3210]
                        ((in[2 + inPos] & 1023) << 4)) & 255);
        out[3 + outPos] = (byte) ((
                //                    [__543210]
                //                      [987654____]
                ((in[2 + inPos] & 1023) >>> 4)
                        | //                    [76______]
                        //            [________10]
                        ((in[3 + inPos] & 1023) << 6)) & 255);
        out[4 + outPos] = (byte) ((
                //                    [76543210]
                //                    [98765432__]
                ((in[3 + inPos] & 1023) >>> 2)) & 255);
        out[5 + outPos] = (byte) ((
                //                    [76543210]
                //                  [__76543210]
                ((in[4 + inPos] & 1023))) & 255);
        out[6 + outPos] = (byte) ((
                //                    [______10]
                //                          [98________]
                ((in[4 + inPos] & 1023) >>> 8)
                        | //                    [765432__]
                        //                [____543210]
                        ((in[5 + inPos] & 1023) << 2)) & 255);
        out[7 + outPos] = (byte) ((
                //                    [____3210]
                //                        [9876______]
                ((in[5 + inPos] & 1023) >>> 6)
                        | //                    [7654____]
                        //              [______3210]
                        ((in[6 + inPos] & 1023) << 4)) & 255);
        out[8 + outPos] = (byte) ((
                //                    [__543210]
                //                      [987654____]
                ((in[6 + inPos] & 1023) >>> 4)
                        | //                    [76______]
                        //            [________10]
                        ((in[7 + inPos] & 1023) << 6)) & 255);
        out[9 + outPos] = (byte) ((
                //                    [76543210]
                //                    [98765432__]
                ((in[7 + inPos] & 1023) >>> 2)) & 255);
        out[10 + outPos] = (byte) ((
                //                    [76543210]
                //                  [__76543210]
                ((in[8 + inPos] & 1023))) & 255);
        out[11 + outPos] = (byte) ((
                //                    [______10]
                //                          [98________]
                ((in[8 + inPos] & 1023) >>> 8)
                        | //                    [765432__]
                        //                [____543210]
                        ((in[9 + inPos] & 1023) << 2)) & 255);
        out[12 + outPos] = (byte) ((
                //                    [____3210]
                //                        [9876______]
                ((in[9 + inPos] & 1023) >>> 6)
                        | //                    [7654____]
                        //              [______3210]
                        ((in[10 + inPos] & 1023) << 4)) & 255);
        out[13 + outPos] = (byte) ((
                //                    [__543210]
                //                      [987654____]
                ((in[10 + inPos] & 1023) >>> 4)
                        | //                    [76______]
                        //            [________10]
                        ((in[11 + inPos] & 1023) << 6)) & 255);
        out[14 + outPos] = (byte) ((
                //                    [76543210]
                //                    [98765432__]
                ((in[11 + inPos] & 1023) >>> 2)) & 255);
        out[15 + outPos] = (byte) ((
                //                    [76543210]
                //                  [__76543210]
                ((in[12 + inPos] & 1023))) & 255);
        out[16 + outPos] = (byte) ((
                //                    [______10]
                //                          [98________]
                ((in[12 + inPos] & 1023) >>> 8)
                        | //                    [765432__]
                        //                [____543210]
                        ((in[13 + inPos] & 1023) << 2)) & 255);
        out[17 + outPos] = (byte) ((
                //                    [____3210]
                //                        [9876______]
                ((in[13 + inPos] & 1023) >>> 6)
                        | //                    [7654____]
                        //              [______3210]
                        ((in[14 + inPos] & 1023) << 4)) & 255);
        out[18 + outPos] = (byte) ((
                //                    [__543210]
                //                      [987654____]
                ((in[14 + inPos] & 1023) >>> 4)
                        | //                    [76______]
                        //            [________10]
                        ((in[15 + inPos] & 1023) << 6)) & 255);
        out[19 + outPos] = (byte) ((
                //                    [76543210]
                //                    [98765432__]
                ((in[15 + inPos] & 1023) >>> 2)) & 255);
        out[20 + outPos] = (byte) ((
                //                    [76543210]
                //                  [__76543210]
                ((in[16 + inPos] & 1023))) & 255);
        out[21 + outPos] = (byte) ((
                //                    [______10]
                //                          [98________]
                ((in[16 + inPos] & 1023) >>> 8)
                        | //                    [765432__]
                        //                [____543210]
                        ((in[17 + inPos] & 1023) << 2)) & 255);
        out[22 + outPos] = (byte) ((
                //                    [____3210]
                //                        [9876______]
                ((in[17 + inPos] & 1023) >>> 6)
                        | //                    [7654____]
                        //              [______3210]
                        ((in[18 + inPos] & 1023) << 4)) & 255);
        out[23 + outPos] = (byte) ((
                //                    [__543210]
                //                      [987654____]
                ((in[18 + inPos] & 1023) >>> 4)
                        | //                    [76______]
                        //            [________10]
                        ((in[19 + inPos] & 1023) << 6)) & 255);
        out[24 + outPos] = (byte) ((
                //                    [76543210]
                //                    [98765432__]
                ((in[19 + inPos] & 1023) >>> 2)) & 255);
        out[25 + outPos] = (byte) ((
                //                    [76543210]
                //                  [__76543210]
                ((in[20 + inPos] & 1023))) & 255);
        out[26 + outPos] = (byte) ((
                //                    [______10]
                //                          [98________]
                ((in[20 + inPos] & 1023) >>> 8)
                        | //                    [765432__]
                        //                [____543210]
                        ((in[21 + inPos] & 1023) << 2)) & 255);
        out[27 + outPos] = (byte) ((
                //                    [____3210]
                //                        [9876______]
                ((in[21 + inPos] & 1023) >>> 6)
                        | //                    [7654____]
                        //              [______3210]
                        ((in[22 + inPos] & 1023) << 4)) & 255);
        out[28 + outPos] = (byte) ((
                //                    [__543210]
                //                      [987654____]
                ((in[22 + inPos] & 1023) >>> 4)
                        | //                    [76______]
                        //            [________10]
                        ((in[23 + inPos] & 1023) << 6)) & 255);
        out[29 + outPos] = (byte) ((
                //                    [76543210]
                //                    [98765432__]
                ((in[23 + inPos] & 1023) >>> 2)) & 255);
        out[30 + outPos] = (byte) ((
                //                    [76543210]
                //                  [__76543210]
                ((in[24 + inPos] & 1023))) & 255);
        out[31 + outPos] = (byte) ((
                //                    [______10]
                //                          [98________]
                ((in[24 + inPos] & 1023) >>> 8)
                        | //                    [765432__]
                        //                [____543210]
                        ((in[25 + inPos] & 1023) << 2)) & 255);
        out[32 + outPos] = (byte) ((
                //                    [____3210]
                //                        [9876______]
                ((in[25 + inPos] & 1023) >>> 6)
                        | //                    [7654____]
                        //              [______3210]
                        ((in[26 + inPos] & 1023) << 4)) & 255);
        out[33 + outPos] = (byte) ((
                //                    [__543210]
                //                      [987654____]
                ((in[26 + inPos] & 1023) >>> 4)
                        | //                    [76______]
                        //            [________10]
                        ((in[27 + inPos] & 1023) << 6)) & 255);
        out[34 + outPos] = (byte) ((
                //                    [76543210]
                //                    [98765432__]
                ((in[27 + inPos] & 1023) >>> 2)) & 255);
        out[35 + outPos] = (byte) ((
                //                    [76543210]
                //                  [__76543210]
                ((in[28 + inPos] & 1023))) & 255);
        out[36 + outPos] = (byte) ((
                //                    [______10]
                //                          [98________]
                ((in[28 + inPos] & 1023) >>> 8)
                        | //                    [765432__]
                        //                [____543210]
                        ((in[29 + inPos] & 1023) << 2)) & 255);
        out[37 + outPos] = (byte) ((
                //                    [____3210]
                //                        [9876______]
                ((in[29 + inPos] & 1023) >>> 6)
                        | //                    [7654____]
                        //              [______3210]
                        ((in[30 + inPos] & 1023) << 4)) & 255);
        out[38 + outPos] = (byte) ((
                //                    [__543210]
                //                      [987654____]
                ((in[30 + inPos] & 1023) >>> 4)
                        | //                    [76______]
                        //            [________10]
                        ((in[31 + inPos] & 1023) << 6)) & 255);
        out[39 + outPos] = (byte) ((
                //                    [76543210]
                //                    [98765432__]
                ((in[31 + inPos] & 1023) >>> 2)) & 255);
    }

    public final void unpack8Values(final byte[] in, final int inPos, final int[] out, final int outPos) {
        out[0 + outPos] =
                //                    [76543210]
                //                  [__76543210]
                (((((int) in[0 + inPos]) & 255)) & 1023)
                        | //                    [______10]
                        //                          [98________]
                        (((((int) in[1 + inPos]) & 255) << 8) & 1023);
        out[1 + outPos] =
                //                    [765432__]
                //                [____543210]
                (((((int) in[1 + inPos]) & 255) >>> 2) & 1023)
                        | //                    [____3210]
                        //                        [9876______]
                        (((((int) in[2 + inPos]) & 255) << 6) & 1023);
        out[2 + outPos] =
                //                    [7654____]
                //              [______3210]
                (((((int) in[2 + inPos]) & 255) >>> 4) & 1023)
                        | //                    [__543210]
                        //                      [987654____]
                        (((((int) in[3 + inPos]) & 255) << 4) & 1023);
        out[3 + outPos] =
                //                    [76______]
                //            [________10]
                (((((int) in[3 + inPos]) & 255) >>> 6) & 1023)
                        | //                    [76543210]
                        //                    [98765432__]
                        (((((int) in[4 + inPos]) & 255) << 2) & 1023);
        out[4 + outPos] =
                //                    [76543210]
                //                  [__76543210]
                (((((int) in[5 + inPos]) & 255)) & 1023)
                        | //                    [______10]
                        //                          [98________]
                        (((((int) in[6 + inPos]) & 255) << 8) & 1023);
        out[5 + outPos] =
                //                    [765432__]
                //                [____543210]
                (((((int) in[6 + inPos]) & 255) >>> 2) & 1023)
                        | //                    [____3210]
                        //                        [9876______]
                        (((((int) in[7 + inPos]) & 255) << 6) & 1023);
        out[6 + outPos] =
                //                    [7654____]
                //              [______3210]
                (((((int) in[7 + inPos]) & 255) >>> 4) & 1023)
                        | //                    [__543210]
                        //                      [987654____]
                        (((((int) in[8 + inPos]) & 255) << 4) & 1023);
        out[7 + outPos] =
                //                    [76______]
                //            [________10]
                (((((int) in[8 + inPos]) & 255) >>> 6) & 1023)
                        | //                    [76543210]
                        //                    [98765432__]
                        (((((int) in[9 + inPos]) & 255) << 2) & 1023);
    }

    public final void unpack32Values(final byte[] in, final int inPos, final int[] out, final int outPos) {
        out[0 + outPos] =
                //                    [76543210]
                //                  [__76543210]
                (((((int) in[0 + inPos]) & 255)) & 1023)
                        | //                    [______10]
                        //                          [98________]
                        (((((int) in[1 + inPos]) & 255) << 8) & 1023);
        out[1 + outPos] =
                //                    [765432__]
                //                [____543210]
                (((((int) in[1 + inPos]) & 255) >>> 2) & 1023)
                        | //                    [____3210]
                        //                        [9876______]
                        (((((int) in[2 + inPos]) & 255) << 6) & 1023);
        out[2 + outPos] =
                //                    [7654____]
                //              [______3210]
                (((((int) in[2 + inPos]) & 255) >>> 4) & 1023)
                        | //                    [__543210]
                        //                      [987654____]
                        (((((int) in[3 + inPos]) & 255) << 4) & 1023);
        out[3 + outPos] =
                //                    [76______]
                //            [________10]
                (((((int) in[3 + inPos]) & 255) >>> 6) & 1023)
                        | //                    [76543210]
                        //                    [98765432__]
                        (((((int) in[4 + inPos]) & 255) << 2) & 1023);
        out[4 + outPos] =
                //                    [76543210]
                //                  [__76543210]
                (((((int) in[5 + inPos]) & 255)) & 1023)
                        | //                    [______10]
                        //                          [98________]
                        (((((int) in[6 + inPos]) & 255) << 8) & 1023);
        out[5 + outPos] =
                //                    [765432__]
                //                [____543210]
                (((((int) in[6 + inPos]) & 255) >>> 2) & 1023)
                        | //                    [____3210]
                        //                        [9876______]
                        (((((int) in[7 + inPos]) & 255) << 6) & 1023);
        out[6 + outPos] =
                //                    [7654____]
                //              [______3210]
                (((((int) in[7 + inPos]) & 255) >>> 4) & 1023)
                        | //                    [__543210]
                        //                      [987654____]
                        (((((int) in[8 + inPos]) & 255) << 4) & 1023);
        out[7 + outPos] =
                //                    [76______]
                //            [________10]
                (((((int) in[8 + inPos]) & 255) >>> 6) & 1023)
                        | //                    [76543210]
                        //                    [98765432__]
                        (((((int) in[9 + inPos]) & 255) << 2) & 1023);
        out[8 + outPos] =
                //                    [76543210]
                //                  [__76543210]
                (((((int) in[10 + inPos]) & 255)) & 1023)
                        | //                    [______10]
                        //                          [98________]
                        (((((int) in[11 + inPos]) & 255) << 8) & 1023);
        out[9 + outPos] =
                //                    [765432__]
                //                [____543210]
                (((((int) in[11 + inPos]) & 255) >>> 2) & 1023)
                        | //                    [____3210]
                        //                        [9876______]
                        (((((int) in[12 + inPos]) & 255) << 6) & 1023);
        out[10 + outPos] =
                //                    [7654____]
                //              [______3210]
                (((((int) in[12 + inPos]) & 255) >>> 4) & 1023)
                        | //                    [__543210]
                        //                      [987654____]
                        (((((int) in[13 + inPos]) & 255) << 4) & 1023);
        out[11 + outPos] =
                //                    [76______]
                //            [________10]
                (((((int) in[13 + inPos]) & 255) >>> 6) & 1023)
                        | //                    [76543210]
                        //                    [98765432__]
                        (((((int) in[14 + inPos]) & 255) << 2) & 1023);
        out[12 + outPos] =
                //                    [76543210]
                //                  [__76543210]
                (((((int) in[15 + inPos]) & 255)) & 1023)
                        | //                    [______10]
                        //                          [98________]
                        (((((int) in[16 + inPos]) & 255) << 8) & 1023);
        out[13 + outPos] =
                //                    [765432__]
                //                [____543210]
                (((((int) in[16 + inPos]) & 255) >>> 2) & 1023)
                        | //                    [____3210]
                        //                        [9876______]
                        (((((int) in[17 + inPos]) & 255) << 6) & 1023);
        out[14 + outPos] =
                //                    [7654____]
                //              [______3210]
                (((((int) in[17 + inPos]) & 255) >>> 4) & 1023)
                        | //                    [__543210]
                        //                      [987654____]
                        (((((int) in[18 + inPos]) & 255) << 4) & 1023);
        out[15 + outPos] =
                //                    [76______]
                //            [________10]
                (((((int) in[18 + inPos]) & 255) >>> 6) & 1023)
                        | //                    [76543210]
                        //                    [98765432__]
                        (((((int) in[19 + inPos]) & 255) << 2) & 1023);
        out[16 + outPos] =
                //                    [76543210]
                //                  [__76543210]
                (((((int) in[20 + inPos]) & 255)) & 1023)
                        | //                    [______10]
                        //                          [98________]
                        (((((int) in[21 + inPos]) & 255) << 8) & 1023);
        out[17 + outPos] =
                //                    [765432__]
                //                [____543210]
                (((((int) in[21 + inPos]) & 255) >>> 2) & 1023)
                        | //                    [____3210]
                        //                        [9876______]
                        (((((int) in[22 + inPos]) & 255) << 6) & 1023);
        out[18 + outPos] =
                //                    [7654____]
                //              [______3210]
                (((((int) in[22 + inPos]) & 255) >>> 4) & 1023)
                        | //                    [__543210]
                        //                      [987654____]
                        (((((int) in[23 + inPos]) & 255) << 4) & 1023);
        out[19 + outPos] =
                //                    [76______]
                //            [________10]
                (((((int) in[23 + inPos]) & 255) >>> 6) & 1023)
                        | //                    [76543210]
                        //                    [98765432__]
                        (((((int) in[24 + inPos]) & 255) << 2) & 1023);
        out[20 + outPos] =
                //                    [76543210]
                //                  [__76543210]
                (((((int) in[25 + inPos]) & 255)) & 1023)
                        | //                    [______10]
                        //                          [98________]
                        (((((int) in[26 + inPos]) & 255) << 8) & 1023);
        out[21 + outPos] =
                //                    [765432__]
                //                [____543210]
                (((((int) in[26 + inPos]) & 255) >>> 2) & 1023)
                        | //                    [____3210]
                        //                        [9876______]
                        (((((int) in[27 + inPos]) & 255) << 6) & 1023);
        out[22 + outPos] =
                //                    [7654____]
                //              [______3210]
                (((((int) in[27 + inPos]) & 255) >>> 4) & 1023)
                        | //                    [__543210]
                        //                      [987654____]
                        (((((int) in[28 + inPos]) & 255) << 4) & 1023);
        out[23 + outPos] =
                //                    [76______]
                //            [________10]
                (((((int) in[28 + inPos]) & 255) >>> 6) & 1023)
                        | //                    [76543210]
                        //                    [98765432__]
                        (((((int) in[29 + inPos]) & 255) << 2) & 1023);
        out[24 + outPos] =
                //                    [76543210]
                //                  [__76543210]
                (((((int) in[30 + inPos]) & 255)) & 1023)
                        | //                    [______10]
                        //                          [98________]
                        (((((int) in[31 + inPos]) & 255) << 8) & 1023);
        out[25 + outPos] =
                //                    [765432__]
                //                [____543210]
                (((((int) in[31 + inPos]) & 255) >>> 2) & 1023)
                        | //                    [____3210]
                        //                        [9876______]
                        (((((int) in[32 + inPos]) & 255) << 6) & 1023);
        out[26 + outPos] =
                //                    [7654____]
                //              [______3210]
                (((((int) in[32 + inPos]) & 255) >>> 4) & 1023)
                        | //                    [__543210]
                        //                      [987654____]
                        (((((int) in[33 + inPos]) & 255) << 4) & 1023);
        out[27 + outPos] =
                //                    [76______]
                //            [________10]
                (((((int) in[33 + inPos]) & 255) >>> 6) & 1023)
                        | //                    [76543210]
                        //                    [98765432__]
                        (((((int) in[34 + inPos]) & 255) << 2) & 1023);
        out[28 + outPos] =
                //                    [76543210]
                //                  [__76543210]
                (((((int) in[35 + inPos]) & 255)) & 1023)
                        | //                    [______10]
                        //                          [98________]
                        (((((int) in[36 + inPos]) & 255) << 8) & 1023);
        out[29 + outPos] =
                //                    [765432__]
                //                [____543210]
                (((((int) in[36 + inPos]) & 255) >>> 2) & 1023)
                        | //                    [____3210]
                        //                        [9876______]
                        (((((int) in[37 + inPos]) & 255) << 6) & 1023);
        out[30 + outPos] =
                //                    [7654____]
                //              [______3210]
                (((((int) in[37 + inPos]) & 255) >>> 4) & 1023)
                        | //                    [__543210]
                        //                      [987654____]
                        (((((int) in[38 + inPos]) & 255) << 4) & 1023);
        out[31 + outPos] =
                //                    [76______]
                //            [________10]
                (((((int) in[38 + inPos]) & 255) >>> 6) & 1023)
                        | //                    [76543210]
                        //                    [98765432__]
                        (((((int) in[39 + inPos]) & 255) << 2) & 1023);
    }
}
