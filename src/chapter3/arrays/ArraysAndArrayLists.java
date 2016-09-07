package chapter3.arrays;

import java.util.*;

/**
 * Created by harish on 8/15/2016.
 */
public class ArraysAndArrayLists {

    public static void main(String[] args) {

        //arrayDeclarations();
        //wrapperClasses();
        //arrayChecksForReferenceEqualityButArrayListCheckForContentEquality();
        //setAndRemoveInArrayList();
        //important();
        //binarySearch();
        //arrayToCollectionAndViceVersa();

        //question24();
        //question25();
        //autoBoxingAndAutoUnBoxing();

        //listFromArrayGivesFixedSizeList();
    }

    private static void listFromArrayGivesFixedSizeList() {
        String[] array = {"hawk", "robin"};

        List<String> list = Arrays.asList(array); // array and list point to the same data store, returns fixed size list
        System.out.println(list.size()); // 2
        list.set(1, "test"); // [hawk, test]
        array[0] = "new";   //  [new, test]
        for (String b : array) System.out.print(b + " ");  // new test
        //list.remove(1); //  since it is fixed size list we are not allowed to change the size of the list.
        //list.add("value3"); // These remove and add throw UnsupportedOperationException
    }

    private static void autoBoxingAndAutoUnBoxing() {
        List<Integer> ages = new ArrayList<>();
        ages.add(Integer.parseInt("5")); // this gives int, then autoboxes to Integer.
        ages.add(Integer.valueOf("6")); // this gives Integer. No auto_unboxing
        ages.add(7); // this is int and auto_unboxing happens
        ages.add(null); // null is not an int,  no auto-boxing
        for (int age : ages)    // here unboxing happens for all Integer elements and ages.get(3) throws a NPE
            System.out.println(age);
        // int age = ages.get(index) // this is what unboxing does under the hood.
    }

    private static void question25() {
        List<String> hex = Arrays.asList("30", "8", "3A", "FF");
        Collections.sort(hex);
        int x = Collections.binarySearch(hex, "8");
        int y = Collections.binarySearch(hex, "3A");
        int z = Collections.binarySearch(hex, "3F");
        System.out.println(x + " " + y + " " + z);
    }

    private static void question24() {
        String[] names = {"Tom", "Dick", "Harry"};
        //List<String> list = names.asList(); // this does not compile. It should be Arrays.asList
        //list.set(0,"sue");                // since the size of list is 0, this throws ArrayIndexOutOfBoundsException
        //System.out.println(list.get(0));
    }

    private static void arrayToCollectionAndViceVersa() {
        //ArrayList<Integer> integers = Arrays.asList(1,2,3,4); // compile error. return type of asList is List<T>.

        // asList converts from array-based list to collection-based list
        List<Integer> integers1 = Arrays.asList(10, 4, -1, 5);
        Collections.sort(integers1);
        // toArray on List<T> converts from ArrayList to Integer[].
        Integer[] array = integers1.toArray(new Integer[4]);
        System.out.println(array[0]);
    }

    private static void binarySearch() {
        int[] random = {6, -4, 12, 0, -10};
        //Arrays.sort(random);
        int x = 12;
        int y = Arrays.binarySearch(random, x);

        System.out.println(y); // result is unpredictable. The list needs to be sorted to do binary search and give correct result.

        int[] numbers = {2, 4, 6, 8};
        System.out.println(Arrays.binarySearch(numbers, 2));
        System.out.println(Arrays.binarySearch(numbers, 3)); // -2 (-1-1 = -2)
        System.out.println(Arrays.binarySearch(numbers, 9)); // -5 (-4-1 = -5)
    }

    private static void important() {
        String[] strings = {"stringValue"};        //        Object
        Object[] objects = strings;  // upcast - safe            |
        String[] againString = (String[]) objects; // downcast   String
        //againString[0] = new StringBuilder("Hello");  // does not compile becase StringBuilder cannot be stored in string.
        objects[0] = new StringBuilder(); // compiles throws runtime ArrayStoreException
    }

    private static void setAndRemoveInArrayList() {
        //ArrayList<Integer> integers = Arrays.asList(1,2,3,4); // This does not compile
        //ArrayList<String> strings = Arrays.asList("1","2","3"); // This does not compile
        List<Integer> integers1 = Arrays.asList(1, 2, 3, 4); // This compiles

        // Arrays.asList() and Collection.toArray() bridge between array-based and collection-based APIs.
        System.out.println(integers1.toArray());
        ArrayList<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.remove(1); // remove can take index or Object. Here auto_unboxing does not work and int index is considered. This removes 2.
        values.set(0, 3); // this will replace 1 with 3.
        values.remove(0);
        for (Integer value : values)
            System.out.println(value);
    }

    private static void arrayChecksForReferenceEqualityButArrayListCheckForContentEquality() {
        String[] bugs = {"cricket", "bettle"};
        String[] alias = bugs;
        System.out.println(bugs.equals(alias));


        String[] bugsArray = {"cricket", "bettle"};
        System.out.println(bugs.equals(bugsArray));


        ArrayList<String> bugsList = new ArrayList<>();
        bugsList.add("cricket");
        bugsList.add("bettle");

        ArrayList<String> again = new ArrayList<>();
        again.add("cricket");
        again.add("bettle");

        System.out.println(bugsList.equals(again));
    }

    private static void wrapperClasses() {
        //int bad1 = Integer.parseInt(""); // throws Number format exception
        //int bad2 = Integer.valueOf("123.45"); throws Number format exception
        double good1 = Double.valueOf("123.45");

        // wrapper classes for boolean, int, double, float, byte, short, long
        // valueOf() to convert to primitive
        // parseInt() to convert to Wrapper type
        // Character class does not participate in converting String to primitive or wrapper class( valueof()).
    }

    private static void arrayDeclarations() {
        int[][] scores = new int[5][];
        Object[][][] cubes = new Object[3][][];

        Date[] dates[] = new Date[2][];
        //int[][] types = new int[][]; //array initializer expected. does not compile
        //int[][] java = new int[];    //array initializer expected. does not compile
        int[] numbers = new int[]{1, 2, 3};
        int[] numbers1 = {1, 2, 3};
        //int[3] numbers2 = {1, 2, 3}; // In case of anonymous arrays size must not be specified
        int[] numAnimals;
        //int [] num1;
        int num2[];
        //int num3 [];

        //if(numAnimals == null) {} numAnimals is local and might not have been initialized.
    }
}
