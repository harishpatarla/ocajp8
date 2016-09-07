package chapter5.hidingAndOverridding;

/**
 * Created by harish on 8/14/2016.
 */
public class Panda extends Bear {

    //public static void hibernate() {} // You're trying to hide the method which should be overridden

    /*public Number sneeze() {
        return 2;
    }*/
    // You're trying to override the method which should be hidden
    // fails to compile because of static modifier mismatch between two sneeze() methods
    // fails because of incompatible return types. return types must be co-variant. child class cannot have broader return type
    // or throw broader exception or new exception. It can throw exception which is child of exception thrown by parent method.

    // These does not compile.


}
