/**
 * Created by JJBOOM on 2016/4/15.
 */
import static net.mindview.util.Print.*;

public class StringOperators {
    public static void main(String[] args) {
        int x = 0, y = 1, z = 2;
        String s = "x, y, z ";
        print(s + x + y + z);
        print(x + " " + s); // Converts x to a String
        s += "(summed) = ";
        print(s + (x + y + z));
        print("" + x);

    }
}
/* Output:
x, y, z 012
0 x, y, z
x, y, z (summed) = 3
0
*///:~