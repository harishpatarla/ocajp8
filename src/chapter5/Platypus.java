package chapter5;

/**
 * Created by harish on 8/15/2016.
 */
public class Platypus // extends Mammal
{
    public Platypus() { // There is no default constructor available in Mammal.
        System.out.println("Platypus");
    }

    public static void main(String[] args) {
        new Mammal(5);
    }
}

class Mammal {
    public Mammal(int age) {
        System.out.println("Mammal");
    }
}
