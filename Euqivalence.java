/**
 * Created by JJBOOM on 2016/4/10.
 */
public class Euqivalence {
    public static void main(String[] args) {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.println(n1 == n2);
        System.out.println(n1 != n2);
        System.out.println();
        // Here use the equals() method to do the test:
        System.out.println(n1.equals(n2));
    }
} /* OutPut:
false
true
*///:~
