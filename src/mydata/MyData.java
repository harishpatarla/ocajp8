package mydata;

/**
 * Created by harish on 8/14/2016.
 */
public interface MyData {

    static boolean isNull(String str) {
        System.out.println("Interface Null Check");

        return str == null || ("".equals(str));
    }

    default void print(String str) {
        if (!isNull(str))
            System.out.println("MyData Print::" + str);
    }
}
