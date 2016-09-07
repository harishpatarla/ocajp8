package chapter1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by harish on 8/21/2016.
 */
/*
A narrowing primitive conversion may be used if all of the following conditions are satisfied:
The expression is a constant expression of type int.
The type of the variable is byte, short, or char.
The value of the expression (which is known at compile time, because it is a constant expression) is representable in the type of the variable.
Note that narrowing conversion does not apply to long or double.
so, char ch = 30L; will fail although 30 is representable by a char.
 */
public class ValidIdentifiers {
    public ValidIdentifiers(int aPublic) {
        {Public = aPublic;} //  this is allowed
    }

    private int Public;
    private String A$B_;
    private byte _helloWorld;

    int valid = Public = _helloWorld = 5; // if any of Public or _helloWorld were not declared then it would not compile.

    //int amount = 9L; // required int, found long
    short a = 12;
    //byte ab = 130; // found int, required byte
    float f1 = 13;  // this compiles fine
    double d = f1;
    double d1 = 30L;
    //double d2 = 30_L; does not compile
    char validChar = 30;
    //char validChar1 = 30L;
    char validChar2 = (short)12; // this is fine since 12 short value is a compile time constant.
    //char validChar3 = a; // this does not compile even though a is short like above statement because a is variable
    // and is not compile time constant.

    //byte b = l; narrowing and explicit casting is required


    private static List objects = new ArrayList<>();
    public static void main(String[] args) {
        /*ValidIdentifiers validIdentifiers = new ValidIdentifiers();
        System.gc();*/
        String a = "java";
        char[] b = { 'j', 'a', 'v', 'a' };
        String c = new String(b);
        String d = a;
        System.out.println(a.equals(c));
    }

    protected void finalize() { // might or might not run the finalize() method
        System.out.println("calling finalize");
        objects.add(this);

    }
}
