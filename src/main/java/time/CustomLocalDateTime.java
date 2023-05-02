package time;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.YearMonth;

public class CustomLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime lastDay = LocalDateTime.now().minusDays(3);

        LocalDateTime start = DateUtils.setFirstDayOfMonth(lastDay);
        LocalDateTime end = DateUtils.setLastDayOfMonth(lastDay);

        System.out.println("Start = " + start + "\nEnd = " + end + "\n");

        System.out.println("Start: " + LocalDateTime.of(YearMonth.from(lastDay).atDay(1), LocalTime.MIN) +
                "\nEnd: " + LocalDateTime.of(YearMonth.from(lastDay).atEndOfMonth(), LocalTime.MAX));
    }
}
