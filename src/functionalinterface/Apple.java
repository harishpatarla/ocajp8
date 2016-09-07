package functionalinterface;

/**
 * Created by harish on 7/6/2016.
 */
public class Apple implements Comparable<Apple> {
    private String color;
    private int weight;

    public Apple(String color) {
        this.color = color;
    }
    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "functionalinterface.Apple{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public int compareTo(Apple apple) {
        return this.getWeight() - apple.getWeight();
    }
}
