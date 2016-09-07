package chapter3.datatimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static java.time.Period.of;

/**
 * Created by harish on 8/14/2016.
 */
public class ExperimentLocalDateTime {

    public static void main(String[] args) {
        int primitive = Integer.parseInt("1");
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
    }
}
