/**
 * Created by JJBOOM on 2016/4/9.
 */

import static net.mindview.util.Print.*;

class Integralf {
    float f;
}

public class E03_PassObject {
    static void f(Integralf y) {
        y.f = 100.0f;
    }

    public static void main(String[] args) {
        Integralf n1 = new Integralf();

        n1.f = 0.7f;
        print("1: n1.f: " + n1.f);
        f(n1);
        print("2: n1.f: " + n1.f);
    }
} /* Output:
1: n1.f: 0.7
2: n2.f: 100.0
*///:~
