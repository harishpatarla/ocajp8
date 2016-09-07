package chapter1.staticimports;
import static java.lang.Integer.*;
//import static java.lang.Integer; if static import then can't specify well defined class without wild card.
import static java.lang.Integer.MAX_VALUE;
// without any of these below code will compile because java.lang is imported by default.
/**
 * Created by harish on 8/26/2016.
 */
public class StatTest {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
    }
}
