package mydata;

/**
 * Created by harish on 8/14/2016.
 */
public class MyDataImpl implements MyData {

    public static void main(String args[]) {
        MyDataImpl obj = new MyDataImpl();
        obj.print("abc");

        obj.isNull("abc");
    }

    protected boolean isNull(String str) {
        System.out.println("Impl Null Check");

        return str == null;
    }
}
