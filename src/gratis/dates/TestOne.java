package gratis.dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestOne {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2014, 6, 24);
        LocalDate date3 = LocalDate.parse("2014-06-24", DateTimeFormatter.ISO_DATE);
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
    }
}
