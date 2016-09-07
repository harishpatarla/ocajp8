package chapter5.abstractclassandinterface;

/**
 * Created by harish on 8/14/2016.
 */
public abstract class Bird { // abstract class cannot be private or final. It cannot be instantiated.
    // Abstract class also has a constructor.
    // An abstract class can have a final method if you don't want the method to be overridden by the subclass.
    //A abstract class can have 0 abstract methods.
    // If there is at least one abstract method then the class must be declared abstract
    // implementing an abstract method in a subclass follows same overriding rules as methods(i.e same or more accessible, cannot throw
    // new or broader exception, method parameter should match and return type should be same or covariant(primitives are an excaption to this rule and should exactly match))
    protected abstract void eat();

    /*private abstract void swim();*/ // Illegal combination of modifiers - private and abstract

    //final void fly(); // missing method body or declare abstract

      abstract public void eat1();

    //abstract void public eat2(); // Missing method body or declare abstract, public is not allowed here.

    /*public void final layEggs() {     // final not allowed here
        System.out.println("Bird laying eggs");
    }*/

    final public void layEggs() {  // abstract class can have final methods.
        System.out.println("Bird laying eggs");
    }
}
