package chapter5.hidingAndOverridding;

/**
 * Created by harish on 8/14/2016.
 */
public class Bear {

    protected static Integer sneeze() {
        System.out.println("Bear is sneezing");
        return 1;
    }

    public void hibernate() {
        System.out.println("Bear is hibernating");
    }
}
