package chapter5.inheritance;

/**
 * Created by harish on 7/20/2016.
 */
class Noctural {

    /*public void getName() {

    }*/

    public static void main(String[] args) {


        /*int primitive = Integer.parseInt("1");
        Integer integer = Integer.valueOf("2");
        System.out.println(primitive);
        System.out.println(integer);

        LocalDate localDate = LocalDate.of(2016, Month.FEBRUARY, 29);
        LocalDateTime localDateTime = LocalDateTime.of(2015, Month.MAY, 10, 11, 22, 33);
        Period period = of(1, 2, 3);
        localDateTime = localDateTime.minus(period);
        //System.out.println(localDateTime.minus(period));

        DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter longFormat = DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG);
        DateTimeFormatter fullFormat = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
        DateTimeFormatter mediumFormat = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(localDateTime.format(shortFormat));
        //System.out.println(localDateTime.format(longFormat));
        //System.out.println(localDateTime.format(fullFormat));
        System.out.println(localDateTime.format(mediumFormat));
*/
    }


}
/*
abstract class Owl {

    public final void getName(){}
}*/

class Baap {



    public int h = 4;
    public int getH() {
        System.out.println("chapter5.inheritance.Baap " + h);
        return h;
    }
}
class Beta extends Baap {
    public int h = 44;

    public static void main(String[] args) {

        long x = 20;
        int y = 10;
        int z = (int)x * y;
        System.out.println(z);
        Baap b = new Beta();
        System.out.println(b.h + " " + b.getH());
        Beta bb = (Beta) b;
        System.out.println(bb.h + " " + bb.getH());
    }


    public int getH() {
        System.out.println("chapter5.inheritance.Beta " + h);
        return h;
    }
}

