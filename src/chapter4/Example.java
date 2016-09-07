package chapter4;

/**
 * Created by harish on 8/19/2016.
 */
// checks pass-by-value, pass-by-reference, exact matching for overloaded methods,
// static variable change(only one copy of static variable), effectively final
public class Example {
    static int a = 1;
    int b = 4;

    public Example(int b) {
        this.b = b;
    }

    public Example() {
        //this(2);
        new Example(2);
    }

    private static int one; // not marked final, no need of initialisation
    private static final int two; //  marked final, initialised in static block
    private static final int three = 3; //
    //private static final int four; // Does not compile since four is not assigned here or in static block.
    static {
        one = 1;
        two = 2;
        //three = 3; // DNC - not allowed to assign it again, even with same value.
        //two = 4;   // DNC - second attempt to assign final variable.
    }

    public static void main(String[] args) {
        //effectivelyFinal();
        //staticVariableChange();

        //System.out.println(howMany(true, new boolean[2])); // returns 2
        //System.out.println(howMany(true, {true, true})); // does not compile, array initialization not allowed here.

        /*Example e = new Example();
        short s = 123;    // first looks for the exact matching type,
                         //then looks from wider primitives, then for auto_unboxing, followed by varargs.
        e.print(s);
        e.print(true);
        e.print(123.34);*/

        // Example of pass-by-value. look closely at what variable is printed.
        /*int value = 9;
        long result = square(value);
        System.out.println(value);*/

        //Example of pass-by-reference.
        /*StringBuilder s1 = new StringBuilder("s1");
        StringBuilder s2 = new StringBuilder("s2");
        StringBuilder s3 = work(s1,s2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);*/

        Example example = new Example();
        System.out.println(example.b);
    }

    private static StringBuilder work(StringBuilder a, StringBuilder b) {
        a = new StringBuilder("a");
        b.append("b");
        return a;
    }

    private static long square(int x) {
        long y = x * (long) x;
        x = -1;
        return y;
    }

    private void print(byte x) {
        System.out.println("byte");
    }
    private void print(int x) {
        System.out.println("int");
    }
    private void print(boolean x) {
        System.out.println("boolean");
    }
    private void print(Object x) {
        System.out.println("Object");
    }

    public static int howMany(boolean b, boolean... b2) {
        return b2.length;
    }

    private static void staticVariableChange() {
        Example example = new Example();
        System.out.println(example.a); // 1
        example = null;
        System.out.println(example.a); // 1
        Example.a = 4;
        Example example1 = new Example();
        Example example2 = new Example();

        example1.a = 6;
        example2.a = 5;
        System.out.println(Example.a);
        // There is only one static variable a. It is initialized to 1, then changed to 4, 6 then 5, doesn't matter on the instance
        // that it is called upon(even if the instance refers to null)
    }

    private static void effectivelyFinal() {
        int localVar = 13;
        Runnable x = () -> {
            System.out.println("run method executing");
            a++;
            Example example = new Example();
            example.b = example.b + 2;
            //localVar++; local variable used in lambda expression should be effectively final. Because local variables go on the stack.
            System.out.println(a);
            System.out.println(example.b);
        };
        Thread t = new Thread(x);
        t.run();
        // lambdas can access static and instance variables and change them. Method parameters and local variables can be accessed
        // as long as they are effectively final.
    }
}
// Following compile:

// print(() -> true);  // 0 parameters
// print(a -> a.startsWith("test"));    // 1 parameter
// print((String a) -> a.startsWith()); // 1 parameter
// print((a, b) -> a.startsWith("test"));               // 2 parameters
// print((String a, String b) -> a.startsWith("test")); // 2 parameters

// Following don't compile:

//print(a,b -> a.startsWith("test")); // need parentheses around parameter list
//print(a -> {a.startsWith("test"); }); // need return keyword.
// print(a -> {return a.startsWith("test") }); // missing semicolon for return statement.

// Default constructor is the one provided by the compiler.