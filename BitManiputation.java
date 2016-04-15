/**
 * Created by JJBOOM on 2016/4/14.
 */
import java.util.*;
import static net.mindview.util.Print.*;

public class BitManiputation {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int i = rand.nextInt();
        int j = rand.nextInt();
        print("-1: " + Integer.toBinaryString(-1));
        print("+1: " + Integer.toBinaryString(+1));
        int maxpos = 2147483647;
        print("maxpos: " + Integer.toBinaryString(maxpos));
        int maxneg = -2147483648;
        print("maxneg: " + Integer.toBinaryString(maxneg));
        print("i:" + Integer.toBinaryString(i));
        print("~i: " + Integer.toBinaryString(~i));
        print("-i: " + Integer.toBinaryString(-i));
        print("j: " + Integer.toBinaryString(j));
        print("i & j: " + Integer.toBinaryString(i & j));
        print("i | j: " + Integer.toBinaryString(i | j));
        print("i ^ j: " + Integer.toBinaryString(i ^ j));
        print("i << 5: " + Integer.toBinaryString(i << 5));
        print("i >> 5: " + Integer.toBinaryString(i >> 5));
        print("(~i) >> 5: " + Integer.toBinaryString((~i) >>> 5));
        print("i >>> 5: " + Integer.toBinaryString(i >>> 5));
        print("(~i) >>> 5" + Integer.toBinaryString((~i) >>> 5));
        long l = rand.nextLong();
        long m = rand.nextLong();
        print("-1L: " + Long.toBinaryString(-1L));
        print("+1L: " + Long.toBinaryString(+1L));
        long ll = 9223372036854775807L;
        print("maxpos: " + Long.toBinaryString(ll));
        long lln = -9223372036854775808L;
        print("maxneg: " + Long.toBinaryString(lln));
        print("l: " + Long.toBinaryString(l));
        print("~l: " + Long.toBinaryString(~l));
        print("-l: " + Long.toBinaryString(-l));
        print("m: " + Long.toBinaryString(m));
        print("l & m: " + Long.toBinaryString(l & m));
        print("l | m: " + Long.toBinaryString(l | m));
        print("l ^ m: " + Long.toBinaryString(l ^ m));
        print("l << 5: " + Long.toBinaryString(l << 5));
        print("l >> 5: " + Long.toBinaryString(l >> 5));
        print("(~l) >> 5: " + Long.toBinaryString((~l) >> 5));
        print("(~l) << 5: " + Long.toBinaryString((~l) << 5));
        print("l >>> 5: " + Long.toBinaryString(l >>> 5));
    }
} /* Output:
-1: 11111111111111111111111111111111
+1: 1
maxpos: 1111111111111111111111111111111
maxneg: 10000000000000000000000000000000
i:10111010001001000100001010010101
~i: 1000101110110111011110101101010
-i: 1000101110110111011110101101011
j: 1100110010110110000010100010110
i & j: 100010000000000000000000010100
i | j: 11111110011111110100011110010111
i ^ j: 11011100011111110100011110000011
i << 5: 1000100100010000101001010100000
i >> 5: 11111101110100010010001000010100
(~i) >> 5: 10001011101101110111101011
i >>> 5: 101110100010010001000010100
(~i) >>> 510001011101101110111101011
-1L: 1111111111111111111111111111111111111111111111111111111111111111
+1L: 1
maxpos: 111111111111111111111111111111111111111111111111111111111111111
maxneg: 1000000000000000000000000000000000000000000000000000000000000000
l: 1000011111101100000010101010101100001101101011000110110001001010
~l: 111100000010011111101010101010011110010010100111001001110110101
-l: 111100000010011111101010101010011110010010100111001001110110110
m: 10100100000011010011000000001010010011111101111010011011011011
l & m: 100000000000010000000001000000001101001000010010001001010
l | m: 1010111111101111010011101010101110011111111111111110111011011011
l ^ m: 1010111011101111010001101010100110011110010110111100101010010001
l << 5: 1111110110000001010101010110000110110101100011011000100101000000
l >> 5: 1111110000111111011000000101010101011000011011010110001101100010
(~l) >> 5: 1111000000100111111010101010100111100100101001110010011101
(~l) << 5: 1001111110101010101001111001001010011100100111011010100000
l >>> 5: 10000111111011000000101010101011000011011010110001101100010
*///:~
