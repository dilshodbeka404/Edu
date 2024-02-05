package time;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateFormat {

    public static void main(String[] args) {
        Date date = Date.valueOf("2004-12-09");
        System.out.println(date);

        LocalDateTime startDate = LocalDateTime.of(LocalDate.now().minusDays(31), LocalTime.MIN);
        LocalDateTime endDate = LocalDateTime.of(LocalDate.now().minusDays(1), LocalTime.MAX);

        System.out.println("startDate : " + startDate);
        System.out.println("endDate : " + endDate);

        long unixTimestamp = 1701864847000L;



        // Convert Unix timestamp to LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.ofInstant(
                Instant.ofEpochMilli(unixTimestamp),
                ZoneId.of("Asia/Tashkent")
        );
        System.out.println(localDateTime);
    }
}
