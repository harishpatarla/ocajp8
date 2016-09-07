package chapter5.abstractclassandinterface;

/**
 * Created by harish on 8/14/2016.
 */
abstract interface Fly { // Every interface is abstract by default
    final static public int COUNT = 0; // In a interface all fields are public,static and final by default. can be declared in any order
    // cannot declare them private/protected
    void flySlow();
    abstract public void isThisOk(); // You cannot assume abstract is implicitly applied to all methods in an interface because they
    // can be default or static.Although here because of the ; it is clearly abstract and abstract is redundant.
    public default void print() {
        // if default method then it should have implementation.
        // if method is not declared default then it may be static or abstract and public for sure.
        // default method cannot be marked as private or protected. It is public by default.
    }
    public static int getJumpHeight() {
        return 4;
    }

    static int getHeight() {
        return 6;
    }
    // Does not compile
    /*
    public void abstract flyHigh(); // abstract keyword for abstract method not allowed after return type. Applicable for static and default methods as well.

    protected abstract void flyLow(); // protected/private not allowed for any(default, abstract, static) kind of method in interface. final not allowed.
    //methods are public or default access, abstract.Therefore protected/private, final not allowed respectively.

    private abstract void flyHello();

    protected default void doNothing() {
        System.out.println("do Nothing ...");
    }

    static int getJumpHeight(); // static methods must have body
*/

    // Notes :
    // Only public is applied by default to all interface methods
    // These may only be hidden not overridden:
    // 1. private instance methods
    // 2. static methods
    // 3. private variables
    // 4. public variables

    // If the class implementing an interface is abstract, then it does not have to override interface abstract methods.
    // Which are true about concrete subclass:
    // 1. A concrete subclass can be declared as abstract. false
    // 2. A concrete subclass must implement all inherited abstract methods. true
    // 3. A concrete subclass must implement all methods defined in an inherited interface. false, default and static methods need not be implemented.
    // 4. A concrete subclass cannot be marked as final. false, It can be marked as final.
    // 5. Abstract methods cannot be overridden by a concrete subclass. false, they can be overridden by concrete subclass.



}
