package chapter1;

/**
 * Created by harish on 8/26/2016.
 */
public class Frodo extends Hobbit {
    public static void main(String[] args) {
        int myGold = 6;
        //System.out.println(countGold(5, myGold)); //  compilation fails. countGold() cannot be accessed from a static context.
        System.out.println(new Hobbit().countGold(5, myGold));
    }
}

class Hobbit {
    int countGold(int x, int y) {
        return x + y;
    }
}
