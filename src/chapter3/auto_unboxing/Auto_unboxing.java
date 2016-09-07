package chapter3.auto_unboxing;

/**
 * Created by harish on 8/25/2016.
 */
public class Auto_unboxing {

    public static void main(String[] args) {
        int a = 5, b = 7, k = 0;
        Integer m = null;
// a and b will be un-boxed in all the cases.
        k = new Integer(a) + new Integer(b);
        System.out.println(k);
        k = a + new Integer(b);
        System.out.println(k);
        k = new Integer(a) + b;
        System.out.println(k);
        m = new Integer(a) + new Integer(b); // here a and b will be un-boxed, then added and then boxed to m.
        System.out.println(m);

        Number i = new Integer("100"); // default constructors are not available i.e. Integer(), Long() are invalid.
        Number i1 = (Number)new Integer("100"); // up-cast
        System.out.println("Number i : " +i);

        //Long aLong = Long.valueOf("123L"); //It can take a string or a long. This gives number format exception
        Long anotherLong = Long.valueOf(123L);
        //System.out.println(aLong);
        System.out.println(anotherLong);

    }
}
