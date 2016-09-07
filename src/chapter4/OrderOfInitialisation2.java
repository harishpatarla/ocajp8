package chapter4;

/**
 * Created by harish on 8/21/2016.
 */
// checks OrderOfInitialisation
public class OrderOfInitialisation2 {

    String value = "t";

    {
        value += "a";
    }

    {
        value += "c";
    }

    public OrderOfInitialisation2() {
        value += "b";
    }

    public OrderOfInitialisation2(String s) {
        value += s;
    }

    public static void main(String[] args) {
        OrderOfInitialisation2 orderOfInitialisation2 = new OrderOfInitialisation2("f"); // this object is ignored.
        orderOfInitialisation2 = new OrderOfInitialisation2(); //orderOfInitialisation2 reference points to this object now
        System.out.println(orderOfInitialisation2.value);
    }
}
