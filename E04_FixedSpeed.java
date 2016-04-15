/**
 * Created by JJBOOM on 2016/4/9.
 */


public class E04_FixedSpeed {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Useage: E04 FixedSpeed.");
            System.exit(1);
        }
        float distance = Float.parseFloat(args[0]);
        float time = Float.parseFloat(args[1]);

        System.out.print("Velocity is: ");
        System.out.print(distance / time);
        System.out.print(" m/s");
    }
}
