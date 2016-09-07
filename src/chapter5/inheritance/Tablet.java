package chapter5.inheritance;

/**
 * Created by harish on 8/26/2016.
 */
public class Tablet implements Gadget{
    //void doStuff() {} // doStuff() is public by default in Gadget. Making it package private makes it weaker and it is not allowed
    // doStuff in Tablet can be more generous but promise no less.
    public void doStuff() {}
}

interface Gadget { void doStuff();}