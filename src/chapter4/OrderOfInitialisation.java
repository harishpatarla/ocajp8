package chapter4;

/**
 * Created by harish on 8/19/2016.
 */

// checks OrderOfInitialisation
public class OrderOfInitialisation {

    private String name = "torchie";
    {
        System.out.println(name);
    }
    private static int COUNT = 0;
    static {
        System.out.println(COUNT);
    }
    {COUNT++;
        System.out.println(COUNT);}
    public OrderOfInitialisation() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        System.out.println("read constructor");
        new OrderOfInitialisation();
    }
    // 0
    // read constructor
    // torchie
    // 1
    // constructor
}

// Order Of initialisation
// 1. If there is a superclass initialise it first.
// 2. Static variable declarations and static initializers in the order they appear.
// 3. Instance variable declarations and instance initializers in the order they appear.
// 4. Constructor
// 3 and 4 are only applied when new is used i.e when initialised.
