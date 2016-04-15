/**
 * Created by JJBOOM on 2016/4/9.
 */
//: operators/E02/Aliasing

import static net.mindview.util.Print.*;

class Integral {
    float f;
}

public class E02_Aliasing {
    public static void main(String[] args) {
        Integral f1 = new Integral();
        Integral f2 = new Integral();

        f1.f = 1.0f;
        f2.f = 10.0f;
        print("1: f1.f: " + f1.f + ", f2.f: " + f2.f);

        f1 = f2;
        print("2: f1.f: " + f1.f + ", f2.f: " + f2.f);

        f1.f = 12.4f;
        print("3: f1.f: " + f1.f + ", f2.f: " + f2.f);

    }
} /* Output:
1: f1.f: 1.0, f2.f: 10.0
2: f1.f: 10.0, f2.f: 10.0
3: f1.f: 12.4, f2.f: 12.4
*///:~
