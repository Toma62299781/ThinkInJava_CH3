/**
 * Created by JJBOOM on 2016/4/11.
 */
import static net.mindview.util.Print.*;

public class Literals {
    public static void main(String[] args) {
        int i1 = 0x2f; // Hexadecimal (lowercase)
        print("i1: " + Integer.toBinaryString(i1));
        int i2 = 0x2F; // Hexadecimal (uppercase)
        print("i2: " + Integer.toBinaryString(i2));
        int i3 = 0277;  // Octal (leading zero)
        print("i3: " + Integer.toBinaryString(i3));
        char c = 0xffff; // Max char hex value
        print("c: " + Integer.toBinaryString(c));
        byte b = 0x7f; // Max byte hex value
        print("b: " + Integer.toBinaryString(b));
        short s = 0x7fff; // Max short hex value
        print("s: " + Integer.toBinaryString(s));

        long n1 = 200L; // Long suffix
        long n2 = 200l; // long suffix (but can be confusing)
        long n3 = 200;
        float f1 = 1;
        float f2 = 1F;
        float f3 = 1f;
        double d1 = 1d;
        double d2 = 1D;
        // Hex and Octal also work with long

        // The part below shows the result of Exercise 06
        print("n1: " + Long.toBinaryString(n1));
        print("n2: " + Long.toBinaryString(n2));
        print("n3: " + Long.toBinaryString(n3));

    }
} /* Output:
i1: 101111
i2: 101111
i3: 10111111
c: 1111111111111111
b: 1111111
s: 111111111111111
n1: 11001000
n2: 11001000
n3: 11001000
*///:~

