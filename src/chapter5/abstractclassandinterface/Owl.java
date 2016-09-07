package chapter5.abstractclassandinterface;

interface Nocturnal {
    default boolean isBlind() {
        return true;
    }
}

/**
 * Created by harish on 8/15/2016.
 */
public class Owl implements Nocturnal {

    public static void main(String[] args) {
        Nocturnal nocturnal = (Nocturnal) new Owl(); // this is up cast, safe since it restricts the methods accessible.
        System.out.println(nocturnal.isBlind()); // even though the object is of type Nocturnal, it uses overridden method at runtime.
    }

    // default method is overridden
    public boolean isBlind() {
        return false;
    }
}
