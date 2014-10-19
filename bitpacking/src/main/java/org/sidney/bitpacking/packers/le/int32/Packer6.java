package org.sidney.bitpacking.packers.le.int32;

import org.sidney.bitpacking.Int32BytePacker;
public final class Packer6 extends Int32BytePacker {

    public Packer6() {
      super(6);
    }

    public final void pack8Values(final int[] in, final int inPos, final byte[] out, final int outPos) {
      out[ 0 + outPos] = (byte)((
          //                [__543210]
          //                  [543210]
           ((in[ 0 + inPos] & 63))
        | //                [76______]
          //            [____10]
           ((in[ 1 + inPos] & 63) <<  6)) & 255);
      out[ 1 + outPos] = (byte)((
          //                [____3210]
          //                    [5432__]
           ((in[ 1 + inPos] & 63) >>> 2)
        | //                [7654____]
          //              [__3210]
           ((in[ 2 + inPos] & 63) <<  4)) & 255);
      out[ 2 + outPos] = (byte)((
          //                [______10]
          //                      [54____]
           ((in[ 2 + inPos] & 63) >>> 4)
        | //                [765432__]
          //                [543210]
           ((in[ 3 + inPos] & 63) <<  2)) & 255);
      out[ 3 + outPos] = (byte)((
          //                [__543210]
          //                  [543210]
           ((in[ 4 + inPos] & 63))
        | //                [76______]
          //            [____10]
           ((in[ 5 + inPos] & 63) <<  6)) & 255);
      out[ 4 + outPos] = (byte)((
          //                [____3210]
          //                    [5432__]
           ((in[ 5 + inPos] & 63) >>> 2)
        | //                [7654____]
          //              [__3210]
           ((in[ 6 + inPos] & 63) <<  4)) & 255);
      out[ 5 + outPos] = (byte)((
          //                [______10]
          //                      [54____]
           ((in[ 6 + inPos] & 63) >>> 4)
        | //                [765432__]
          //                [543210]
           ((in[ 7 + inPos] & 63) <<  2)) & 255);
    }
    public final void pack32Values(final int[] in, final int inPos, final byte[] out, final int outPos) {
      out[ 0 + outPos] = (byte)((
          //                [__543210]
          //                  [543210]
           ((in[ 0 + inPos] & 63))
        | //                [76______]
          //            [____10]
           ((in[ 1 + inPos] & 63) <<  6)) & 255);
      out[ 1 + outPos] = (byte)((
          //                [____3210]
          //                    [5432__]
           ((in[ 1 + inPos] & 63) >>> 2)
        | //                [7654____]
          //              [__3210]
           ((in[ 2 + inPos] & 63) <<  4)) & 255);
      out[ 2 + outPos] = (byte)((
          //                [______10]
          //                      [54____]
           ((in[ 2 + inPos] & 63) >>> 4)
        | //                [765432__]
          //                [543210]
           ((in[ 3 + inPos] & 63) <<  2)) & 255);
      out[ 3 + outPos] = (byte)((
          //                [__543210]
          //                  [543210]
           ((in[ 4 + inPos] & 63))
        | //                [76______]
          //            [____10]
           ((in[ 5 + inPos] & 63) <<  6)) & 255);
      out[ 4 + outPos] = (byte)((
          //                [____3210]
          //                    [5432__]
           ((in[ 5 + inPos] & 63) >>> 2)
        | //                [7654____]
          //              [__3210]
           ((in[ 6 + inPos] & 63) <<  4)) & 255);
      out[ 5 + outPos] = (byte)((
          //                [______10]
          //                      [54____]
           ((in[ 6 + inPos] & 63) >>> 4)
        | //                [765432__]
          //                [543210]
           ((in[ 7 + inPos] & 63) <<  2)) & 255);
      out[ 6 + outPos] = (byte)((
          //                [__543210]
          //                  [543210]
           ((in[ 8 + inPos] & 63))
        | //                [76______]
          //            [____10]
           ((in[ 9 + inPos] & 63) <<  6)) & 255);
      out[ 7 + outPos] = (byte)((
          //                [____3210]
          //                    [5432__]
           ((in[ 9 + inPos] & 63) >>> 2)
        | //                [7654____]
          //              [__3210]
           ((in[10 + inPos] & 63) <<  4)) & 255);
      out[ 8 + outPos] = (byte)((
          //                [______10]
          //                      [54____]
           ((in[10 + inPos] & 63) >>> 4)
        | //                [765432__]
          //                [543210]
           ((in[11 + inPos] & 63) <<  2)) & 255);
      out[ 9 + outPos] = (byte)((
          //                [__543210]
          //                  [543210]
           ((in[12 + inPos] & 63))
        | //                [76______]
          //            [____10]
           ((in[13 + inPos] & 63) <<  6)) & 255);
      out[10 + outPos] = (byte)((
          //                [____3210]
          //                    [5432__]
           ((in[13 + inPos] & 63) >>> 2)
        | //                [7654____]
          //              [__3210]
           ((in[14 + inPos] & 63) <<  4)) & 255);
      out[11 + outPos] = (byte)((
          //                [______10]
          //                      [54____]
           ((in[14 + inPos] & 63) >>> 4)
        | //                [765432__]
          //                [543210]
           ((in[15 + inPos] & 63) <<  2)) & 255);
      out[12 + outPos] = (byte)((
          //                [__543210]
          //                  [543210]
           ((in[16 + inPos] & 63))
        | //                [76______]
          //            [____10]
           ((in[17 + inPos] & 63) <<  6)) & 255);
      out[13 + outPos] = (byte)((
          //                [____3210]
          //                    [5432__]
           ((in[17 + inPos] & 63) >>> 2)
        | //                [7654____]
          //              [__3210]
           ((in[18 + inPos] & 63) <<  4)) & 255);
      out[14 + outPos] = (byte)((
          //                [______10]
          //                      [54____]
           ((in[18 + inPos] & 63) >>> 4)
        | //                [765432__]
          //                [543210]
           ((in[19 + inPos] & 63) <<  2)) & 255);
      out[15 + outPos] = (byte)((
          //                [__543210]
          //                  [543210]
           ((in[20 + inPos] & 63))
        | //                [76______]
          //            [____10]
           ((in[21 + inPos] & 63) <<  6)) & 255);
      out[16 + outPos] = (byte)((
          //                [____3210]
          //                    [5432__]
           ((in[21 + inPos] & 63) >>> 2)
        | //                [7654____]
          //              [__3210]
           ((in[22 + inPos] & 63) <<  4)) & 255);
      out[17 + outPos] = (byte)((
          //                [______10]
          //                      [54____]
           ((in[22 + inPos] & 63) >>> 4)
        | //                [765432__]
          //                [543210]
           ((in[23 + inPos] & 63) <<  2)) & 255);
      out[18 + outPos] = (byte)((
          //                [__543210]
          //                  [543210]
           ((in[24 + inPos] & 63))
        | //                [76______]
          //            [____10]
           ((in[25 + inPos] & 63) <<  6)) & 255);
      out[19 + outPos] = (byte)((
          //                [____3210]
          //                    [5432__]
           ((in[25 + inPos] & 63) >>> 2)
        | //                [7654____]
          //              [__3210]
           ((in[26 + inPos] & 63) <<  4)) & 255);
      out[20 + outPos] = (byte)((
          //                [______10]
          //                      [54____]
           ((in[26 + inPos] & 63) >>> 4)
        | //                [765432__]
          //                [543210]
           ((in[27 + inPos] & 63) <<  2)) & 255);
      out[21 + outPos] = (byte)((
          //                [__543210]
          //                  [543210]
           ((in[28 + inPos] & 63))
        | //                [76______]
          //            [____10]
           ((in[29 + inPos] & 63) <<  6)) & 255);
      out[22 + outPos] = (byte)((
          //                [____3210]
          //                    [5432__]
           ((in[29 + inPos] & 63) >>> 2)
        | //                [7654____]
          //              [__3210]
           ((in[30 + inPos] & 63) <<  4)) & 255);
      out[23 + outPos] = (byte)((
          //                [______10]
          //                      [54____]
           ((in[30 + inPos] & 63) >>> 4)
        | //                [765432__]
          //                [543210]
           ((in[31 + inPos] & 63) <<  2)) & 255);
    }
    public final void unpack8Values(final byte[] in, final int inPos, final int[] out, final int outPos) {
      out[ 0 + outPos] =
          //                [__543210]
          //                  [543210]
            (((((int)in[ 0 + inPos]) & 255) ) & 63);
      out[ 1 + outPos] =
          //                [76______]
          //            [____10]
            (((((int)in[ 0 + inPos]) & 255) >>>  6) & 63)
        | //                [____3210]
          //                    [5432__]
            (((((int)in[ 1 + inPos]) & 255) <<  2) & 63);
      out[ 2 + outPos] =
          //                [7654____]
          //              [__3210]
            (((((int)in[ 1 + inPos]) & 255) >>>  4) & 63)
        | //                [______10]
          //                      [54____]
            (((((int)in[ 2 + inPos]) & 255) <<  4) & 63);
      out[ 3 + outPos] =
          //                [765432__]
          //                [543210]
            (((((int)in[ 2 + inPos]) & 255) >>>  2) & 63);
      out[ 4 + outPos] =
          //                [__543210]
          //                  [543210]
            (((((int)in[ 3 + inPos]) & 255) ) & 63);
      out[ 5 + outPos] =
          //                [76______]
          //            [____10]
            (((((int)in[ 3 + inPos]) & 255) >>>  6) & 63)
        | //                [____3210]
          //                    [5432__]
            (((((int)in[ 4 + inPos]) & 255) <<  2) & 63);
      out[ 6 + outPos] =
          //                [7654____]
          //              [__3210]
            (((((int)in[ 4 + inPos]) & 255) >>>  4) & 63)
        | //                [______10]
          //                      [54____]
            (((((int)in[ 5 + inPos]) & 255) <<  4) & 63);
      out[ 7 + outPos] =
          //                [765432__]
          //                [543210]
            (((((int)in[ 5 + inPos]) & 255) >>>  2) & 63);
    }
    public final void unpack32Values(final byte[] in, final int inPos, final int[] out, final int outPos) {
      out[ 0 + outPos] =
          //                [__543210]
          //                  [543210]
            (((((int)in[ 0 + inPos]) & 255) ) & 63);
      out[ 1 + outPos] =
          //                [76______]
          //            [____10]
            (((((int)in[ 0 + inPos]) & 255) >>>  6) & 63)
        | //                [____3210]
          //                    [5432__]
            (((((int)in[ 1 + inPos]) & 255) <<  2) & 63);
      out[ 2 + outPos] =
          //                [7654____]
          //              [__3210]
            (((((int)in[ 1 + inPos]) & 255) >>>  4) & 63)
        | //                [______10]
          //                      [54____]
            (((((int)in[ 2 + inPos]) & 255) <<  4) & 63);
      out[ 3 + outPos] =
          //                [765432__]
          //                [543210]
            (((((int)in[ 2 + inPos]) & 255) >>>  2) & 63);
      out[ 4 + outPos] =
          //                [__543210]
          //                  [543210]
            (((((int)in[ 3 + inPos]) & 255) ) & 63);
      out[ 5 + outPos] =
          //                [76______]
          //            [____10]
            (((((int)in[ 3 + inPos]) & 255) >>>  6) & 63)
        | //                [____3210]
          //                    [5432__]
            (((((int)in[ 4 + inPos]) & 255) <<  2) & 63);
      out[ 6 + outPos] =
          //                [7654____]
          //              [__3210]
            (((((int)in[ 4 + inPos]) & 255) >>>  4) & 63)
        | //                [______10]
          //                      [54____]
            (((((int)in[ 5 + inPos]) & 255) <<  4) & 63);
      out[ 7 + outPos] =
          //                [765432__]
          //                [543210]
            (((((int)in[ 5 + inPos]) & 255) >>>  2) & 63);
      out[ 8 + outPos] =
          //                [__543210]
          //                  [543210]
            (((((int)in[ 6 + inPos]) & 255) ) & 63);
      out[ 9 + outPos] =
          //                [76______]
          //            [____10]
            (((((int)in[ 6 + inPos]) & 255) >>>  6) & 63)
        | //                [____3210]
          //                    [5432__]
            (((((int)in[ 7 + inPos]) & 255) <<  2) & 63);
      out[10 + outPos] =
          //                [7654____]
          //              [__3210]
            (((((int)in[ 7 + inPos]) & 255) >>>  4) & 63)
        | //                [______10]
          //                      [54____]
            (((((int)in[ 8 + inPos]) & 255) <<  4) & 63);
      out[11 + outPos] =
          //                [765432__]
          //                [543210]
            (((((int)in[ 8 + inPos]) & 255) >>>  2) & 63);
      out[12 + outPos] =
          //                [__543210]
          //                  [543210]
            (((((int)in[ 9 + inPos]) & 255) ) & 63);
      out[13 + outPos] =
          //                [76______]
          //            [____10]
            (((((int)in[ 9 + inPos]) & 255) >>>  6) & 63)
        | //                [____3210]
          //                    [5432__]
            (((((int)in[10 + inPos]) & 255) <<  2) & 63);
      out[14 + outPos] =
          //                [7654____]
          //              [__3210]
            (((((int)in[10 + inPos]) & 255) >>>  4) & 63)
        | //                [______10]
          //                      [54____]
            (((((int)in[11 + inPos]) & 255) <<  4) & 63);
      out[15 + outPos] =
          //                [765432__]
          //                [543210]
            (((((int)in[11 + inPos]) & 255) >>>  2) & 63);
      out[16 + outPos] =
          //                [__543210]
          //                  [543210]
            (((((int)in[12 + inPos]) & 255) ) & 63);
      out[17 + outPos] =
          //                [76______]
          //            [____10]
            (((((int)in[12 + inPos]) & 255) >>>  6) & 63)
        | //                [____3210]
          //                    [5432__]
            (((((int)in[13 + inPos]) & 255) <<  2) & 63);
      out[18 + outPos] =
          //                [7654____]
          //              [__3210]
            (((((int)in[13 + inPos]) & 255) >>>  4) & 63)
        | //                [______10]
          //                      [54____]
            (((((int)in[14 + inPos]) & 255) <<  4) & 63);
      out[19 + outPos] =
          //                [765432__]
          //                [543210]
            (((((int)in[14 + inPos]) & 255) >>>  2) & 63);
      out[20 + outPos] =
          //                [__543210]
          //                  [543210]
            (((((int)in[15 + inPos]) & 255) ) & 63);
      out[21 + outPos] =
          //                [76______]
          //            [____10]
            (((((int)in[15 + inPos]) & 255) >>>  6) & 63)
        | //                [____3210]
          //                    [5432__]
            (((((int)in[16 + inPos]) & 255) <<  2) & 63);
      out[22 + outPos] =
          //                [7654____]
          //              [__3210]
            (((((int)in[16 + inPos]) & 255) >>>  4) & 63)
        | //                [______10]
          //                      [54____]
            (((((int)in[17 + inPos]) & 255) <<  4) & 63);
      out[23 + outPos] =
          //                [765432__]
          //                [543210]
            (((((int)in[17 + inPos]) & 255) >>>  2) & 63);
      out[24 + outPos] =
          //                [__543210]
          //                  [543210]
            (((((int)in[18 + inPos]) & 255) ) & 63);
      out[25 + outPos] =
          //                [76______]
          //            [____10]
            (((((int)in[18 + inPos]) & 255) >>>  6) & 63)
        | //                [____3210]
          //                    [5432__]
            (((((int)in[19 + inPos]) & 255) <<  2) & 63);
      out[26 + outPos] =
          //                [7654____]
          //              [__3210]
            (((((int)in[19 + inPos]) & 255) >>>  4) & 63)
        | //                [______10]
          //                      [54____]
            (((((int)in[20 + inPos]) & 255) <<  4) & 63);
      out[27 + outPos] =
          //                [765432__]
          //                [543210]
            (((((int)in[20 + inPos]) & 255) >>>  2) & 63);
      out[28 + outPos] =
          //                [__543210]
          //                  [543210]
            (((((int)in[21 + inPos]) & 255) ) & 63);
      out[29 + outPos] =
          //                [76______]
          //            [____10]
            (((((int)in[21 + inPos]) & 255) >>>  6) & 63)
        | //                [____3210]
          //                    [5432__]
            (((((int)in[22 + inPos]) & 255) <<  2) & 63);
      out[30 + outPos] =
          //                [7654____]
          //              [__3210]
            (((((int)in[22 + inPos]) & 255) >>>  4) & 63)
        | //                [______10]
          //                      [54____]
            (((((int)in[23 + inPos]) & 255) <<  4) & 63);
      out[31 + outPos] =
          //                [765432__]
          //                [543210]
            (((((int)in[23 + inPos]) & 255) >>>  2) & 63);
    }
  }
