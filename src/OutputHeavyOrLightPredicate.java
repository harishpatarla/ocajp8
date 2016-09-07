import functionalinterface.Apple;

/**
 * Created by harish on 7/6/2016.
 */
public class OutputHeavyOrLightPredicate implements OutputPredicate {
    @Override
    public String print(Apple apple) {
        String s = apple.getWeight() >= 150 ? "heavy" : "light";
        return s;
    }
}
