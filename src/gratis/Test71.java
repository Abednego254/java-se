package gratis;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Test71 {
    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.of(2017, 7, 14, 13, 1);
        dt = dt.plusDays(7);
        dt = dt.plusMonths(1);

        System.out.print(dt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
    }
}
