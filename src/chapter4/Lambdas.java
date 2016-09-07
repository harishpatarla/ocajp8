package chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by harish on 8/19/2016.
 */
// tests lambda and predicate
public class Lambdas {

    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("fish", false, true));
        animalList.add(new Animal("rabbit", true, true));
        print(animalList, animal -> animal.canHop());
        print(animalList, Animal::canSwim); // just like we pass object reference, we pass here method reference
        print(animalList, animal -> ! animal.canSwim()); // since the interface's method takes an Animal, our lambda parameter
        // has to be an Animal.

        // when we pass method reference to a functional interface, we pass the implementation for the abstract method in the
        // functional interface. That's why we can have only one abstract method in functional interface(FI) so the lambda that we pass
        // can be mapped to that FI.
    }
    private static void print(List<Animal> animalList, Predicate<Animal> checker) {

        for (Animal animal : animalList) {
            if (checker.test(animal))
                System.out.println(animal + " ");
        }
    }
}

class Animal {
    private String species;
    private boolean canHop;
    private boolean canSwim;


    public Animal(String species, boolean canHop, boolean canSwim) {
        this.species = species;
        this.canHop = canHop;
        this.canSwim = canSwim;
    }

    public boolean canHop() {
        return canHop;
    }

    public boolean canSwim() {
        return canSwim;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                '}';
    }
}
