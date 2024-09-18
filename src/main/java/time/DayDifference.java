package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DayDifference {
    public static void main(String[] args) {
        long between = ChronoUnit.DAYS.between(
                LocalDateTime.of(2023, 7, 9, 10, 17, 46),
                LocalDateTime.now()
        );
        System.out.println("between = " + between);
    }
}
