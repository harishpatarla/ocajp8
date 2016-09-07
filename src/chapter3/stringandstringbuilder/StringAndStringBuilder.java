package chapter3.stringandstringbuilder;

/**
 * Created by harish on 8/14/2016.
 */
public class StringAndStringBuilder {


    public static void main(String[] args) {
        checkEquals();

        //addingIntToString();

        //equalsOperatorCannotBeappliedToCompareStringAndStringBuilder();

        //subString();

        //addingPrimitiveBooleanToStringGivesString();

        //referenceEqualityOfStringBuilder();

        //stringAndSBMethods();



    }

    private static void stringAndSBMethods() {
        String s = "Nick Jonas sang close";
        //StringBuilder sb = "Katy Perry sang rise"; // watch out for statement like this - cannot assign String to StringBuilder
        StringBuilder sb = new StringBuilder("Katy Perry sang rise");

        // String               // StringBuilder
        s.substring(1, 2);
        sb.substring(1, 2); // substring() does not change sb value.

        s.charAt(2);
        sb.charAt(2);

        s.toString();
        sb.toString();

        s.indexOf('a');
        sb.indexOf("ri", 2); // (string, from index)

        s.replace('a', 'A');
        sb.replace(1, 2, "ab");

        s.trim();
        sb.trimToSize();

        s.concat("");
        sb.append(true); // char[], CharSequence,char, float, int , double, boolean, StringBuffer,String

        //
        sb.delete(0, 2);
        sb.deleteCharAt(3);
        sb.reverse();
        //sb.insert(8); // compiler error
        sb.insert(8,'a');

        //
        s.startsWith("Ni");
        s.endsWith("close");
        s.toLowerCase();
        s.toUpperCase();

    }

    private static void referenceEqualityOfStringBuilder() {
        StringBuilder s1 = new StringBuilder("java");
        StringBuilder s2 = new StringBuilder("java");
        System.out.println(s1 == s2);   // Both of these check for reference equality and unlike String, StringBuilder did not implement
        // equals().
        System.out.println(s1.equals(s2));
    }

    private static void addingPrimitiveBooleanToStringGivesString() {
        String a = "2";
        a += 'c'; // String + char = String
        a += false; // String + boolean = String

        if (a == "2cfalse") System.out.println("==");
        if (a.equals("2cfalse")) System.out.println("equals");
        System.out.println((int) 'c');
    }

    private static void subString() {
        StringBuilder numbers = new StringBuilder("012345678"); // String numbers = "012345678" also gives same result

        System.out.println(numbers.substring(1, 3));
        System.out.println(numbers.substring(7, 7)); // Start and end index can be the same
        System.out.println(numbers.substring(7));   // starts from given index
        System.out.println(numbers.substring(1, 10));  // throws runtime exception
        System.out.println(numbers.substring(2, 1));   // throws runtime exception
    }

    private static void equalsOperatorCannotBeappliedToCompareStringAndStringBuilder() {
        String s1 = "Harris";
        StringBuilder s2 = new StringBuilder("Harris");

        //if (s1 == s2) System.out.println("1"); // == operator cannot be applied on String and StringBuilder.

        // calling == on String objects checks if both point to the same Object in the pool
        // Calling == on StringBuilder references checks if they are pointing to the same String builder objects.
        if (s1.equals(s2)) System.out.println("2"); // false - compiles but cannot compare string and string builder

        // note that StringBuilder substring() does not change the sb like append(), insert(), delete()

        System.out.println(s2.substring(0, 2));
        System.out.println(s2);

    }

    private static void addingIntToString() {
        int numFish = 4;
        String fishType = "tuna";
        String anotherFish = fishType + numFish; // String + int/char/boolean = string.
        System.out.println(anotherFish + " " + fishType);
        System.out.println(numFish + " " + 1);
    }

    private static void checkEquals() {
        String t = new String("Hello");
        String s = "Hello";

        if ("Hello".equals(s)) System.out.println("one"); //true
        if (t == s) System.out.println("two"); //false
        if (t.equals(s)) System.out.println("three"); // true
        if ("Hello" == s) System.out.println("four"); // true
        if ("Hello" == t) System.out.println("five"); // false
        if (s == t.intern()) System.out.println("six"); //true
        if (s.equals(t.intern())) System.out.println("seven"); //true
    }

}
