/**
 * Created by JJBOOM on 2016/4/9.
 */
import java.util.*;
import static net.mindview.util.Print.*;

public class MathOps {
    public static void main(String[] args) {
        // Create a seeded random number generator:
        Random rand = new Random(47);
        int i, j, k;
        // Choose value from 1 to 100:
        j = rand.nextInt(100) + 1;
        print("j: " + j);
        k = rand.nextInt(100) + 1;
        print("k: " + k);
        i = j + k;
        print("j + k: " + i);
        i = j - k;
        print("j - k: " + i);
        i = j / k;
        print("j / k:" + i);
        i = k * j;
        print("j * k:" + i);
        i = k % j;
        print("k % j:" + i);
        i = j % k;
        print("j % k:" + i);

        // Floating-point number tests:
        float u, v, w;
        v = rand.nextFloat();
        print("v: " + v);
        w = rand.nextFloat();
        print("w: " + w);
        u = v + w;
        print("v + w: " + u);
        u = v - w;
        print("v - w: " + u);
        u = v * w;
        print("v * w: " + u);
        u = v / w;
        print("v / w: " + u);
        // The following also works for char,
        // bytes, short, int, long, and double:
        u += v;
        print("u += v: " + u);
        u -= v;
        print("u -= v: " + u);
        u *= v;
        print("u *= v: " + u);
        u /= v;
        print("u /= v: " + u);
    }
} /* Output:
j: 59
k: 56
j + k: 115
j - k: 3
j / k:1
j * k:3304
k % j:56
j % k:3
v: 0.5309454
w: 0.0534122
v + w: 0.5843576
v - w: 0.47753322
v * w: 0.028358962
v / w: 9.940527
u += v: 10.471473
u -= v: 9.940527
u *= v: 5.2778773
u /= v: 9.940527
*///~
