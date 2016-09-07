package chapter4;

/**
 * Created by harish on 8/21/2016.
 */
// tests RecognizeCorrectOverloadedMethod
public class RecognizeCorrectOverloadedMethod {
    RecognizeCorrectOverloadedMethod() {
        System.out.println("1 ");
    }
    RecognizeCorrectOverloadedMethod(int num) {
        System.out.println("2 ");
    }
    RecognizeCorrectOverloadedMethod(Integer num) {
        System.out.println("3 ");
    }
    RecognizeCorrectOverloadedMethod(Object num) {
        System.out.println("4 ");
    }
    RecognizeCorrectOverloadedMethod(int... num) {
        System.out.println("5 ");
    }

    public static void main(String[] args) {
        new RecognizeCorrectOverloadedMethod(100);
        new RecognizeCorrectOverloadedMethod(1000L);
    }
}
// looks for exact match, then wider type, then auto_unboxing, then varargs
