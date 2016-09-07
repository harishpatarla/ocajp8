package functionalinterface;

/**
 * Created by harish on 7/6/2016.
 */
public class AppleGreenColorPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("green");
    }

    /**
     * Created by harish on 7/6/2016.
     */
    public static class AppleHeavyWeightPredicate implements ApplePredicate {
        @Override
        public boolean test(Apple apple) {
            return apple.getWeight() >= 150;
        }
    }
}
