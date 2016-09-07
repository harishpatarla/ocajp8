package chapter2;

/**
 * Created by harish on 8/24/2016.
 */
public class FunCalculator implements Calculator {
    int x;
    int y = ++x + calc(x); {x=+x;}

    private int calc(int x) {
        return x * 2;
    }

    public static void main(String[] args) {
        FunCalculator a = new FunCalculator();
        System.out.println(a.x);
        System.out.println(a.y);
    }
}
