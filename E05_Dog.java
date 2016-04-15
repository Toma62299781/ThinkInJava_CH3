/**
 * Created by JJBOOM on 2016/4/10.
 */
// This java file contains exercise 05 and exercise 06.
class Dog {
    String name;
    String says;
}

public class E05_Dog {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.name = "spot";
        dog1.says = "Ruff!";
        dog2.name = "scruffy";
        dog2.says = "Wurf!";

        System.out.println("dog 1 name: " + dog1.name + ", dog1 says: " + dog1.says);
        System.out.println("dog 2 name: " + dog2.name + ", dog2 says: " + dog2.says);

        System.out.println("Here test the == and equals(): ");
        System.out.println("dog1 == dog2: " + (dog1 == dog2));
        System.out.println("dog1.equals(dog2): " + (dog1.equals(dog2)));

        System.out.println("Here test the object that has been assigned to spot.");
        Dog dog3 = new Dog();
        dog3 = dog1;
        System.out.println("dog3 == dog1: " + (dog3 == dog1));
        System.out.println("dog3.equals(dog1): " + dog3.equals(dog1));

    }
} /* Output:
dog 1 name: spot dog1 says: Ruff!
dog 2 name: scruffy dog2 says: Wurf!
Here test the == and equals():
dog1 == dog2: false
dog1.equals(dog2): false
Here test the object that has been assigned to the same:
dog3 == dog1: true
dog3.equals(dog1): true
*///:~
