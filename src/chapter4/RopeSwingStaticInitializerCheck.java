package chapter4;
// import static java.util.Collections; // This does not compile
import java.util.ArrayList;

import static java.util.Collections.*; // can import all static variables and methods in the class
import static java.util.Collections.sort; // can import specific static method in the class
//import static java.util.Collections.sort(ArrayList<String>);
/**
 * Created by harish on 8/20/2016.
 */
// checks where you can initialize a static final variable with value and when exactly.
// There are only 2 places your can assign value to a static final variable - at the time of declaration or in static init block.Not possible in static main() method
// checks correct use of static imports
public class RopeSwingStaticInitializerCheck {
    private static final String leftRope;
    private static final String rightRope;
    //private static final String bench; // not initialised at the time of declaration or in static init block.
    private static final String name = "name";

    static {
        leftRope = "leftRope";
        rightRope = "rightRope";
    }

    static {
      //  name = "name"; // cannot assign to final variable name
      //  rightRope = "rightRope"; // rightRope might already have been assigned
    }

    public static void main(String[] args) {
        //bench = "bench";
    }
}
class Imports {
    public void method(ArrayList<String> strings) {
        // sort(list);
    }
}
