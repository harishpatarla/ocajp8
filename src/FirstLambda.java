/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import functionalinterface.Apple;
import functionalinterface.ApplePredicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstLambda {
    public static void main(String[] args) {
        /*List<functionalinterface.Apple> greenApples = filterApplesByColor(Arrays.asList(new functionalinterface.Apple("green", 150), new functionalinterface.Apple("red", 150)), new functionalinterface.AppleGreenColorPredicate());
        List<functionalinterface.Apple> heavyApples = filterApplesByColor(Arrays.asList(new functionalinterface.Apple("green", 150), new functionalinterface.Apple("red", 150)), new functionalinterface.AppleGreenColorPredicate.AppleHeavyWeightPredicate() );
        System.out.println(greenApples);
        System.out.println(heavyApples);*/
        /*System.out.println(Arrays.asList(new functionalinterface.Apple("green", 150), new functionalinterface.Apple("red", 150)).sort(
                new Comparator<functionalinterface.Apple>() {
                    @Override
                    public int compare(functionalinterface.Apple o1, functionalinterface.Apple o2) {
                        return o1.compareTo(o2);
                    }
                }
        ) );*/


        System.out.println(prettyPrintApple(Arrays.asList(new Apple("green", 150), new Apple("red", 150)), (Apple apple) ->
                "A " + apple.getWeight() + "g apple of " + apple.getColor() + " color"));
    }

    public static List<Apple> filterApplesByColor(List<Apple> appleList, ApplePredicate predicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : appleList) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }

        return result;
    }

    public static String prettyPrintApple(List<Apple> appleList, OutputPredicate outputPredicate) {
        String print = null;
        for (Apple apple : appleList) {
            print = outputPredicate.print(apple);
        }
        return print;
    }

}



