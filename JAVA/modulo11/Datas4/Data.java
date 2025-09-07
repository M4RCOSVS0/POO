package modulo11.Datas4;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Data {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");//iso8601
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");//iso8601  

        LocalDate pastweekLocalDate = d04.minusDays(7);
        LocalDate nextweekLocalDate = d04.plusDays(7);

        LocalDateTime pastweekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextweekLocalDateTime = d05.plusDays(7);

        Instant pastweekLocalDateT = d06.minus(7,ChronoUnit.DAYS);
        Instant nextweekLocalDateT = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("pastweekLocalDate "+ pastweekLocalDate);
        System.out.println("nextWeekLocalDate "+ nextweekLocalDate);

        System.out.println("pastweekLocalDate "+ pastweekLocalDateTime);
        System.out.println("nextWeekLocalDate "+ nextweekLocalDateTime);

        System.out.println("pastweekLocalDate "+ pastweekLocalDateT);
        System.out.println("nextWeekLocalDate "+ nextweekLocalDateT);

        Duration t1 = Duration.between(pastweekLocalDate.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(pastweekLocalDateTime, d05);
        Duration t3 = Duration.between(pastweekLocalDateT, d06);
        Duration t4 = Duration.between(d06,pastweekLocalDateT);


        System.out.println(t1.toDays());
        System.out.println(t2.toDays());
        System.out.println(t3.toDays());
        System.out.println(t4.toDays());



    }
}
