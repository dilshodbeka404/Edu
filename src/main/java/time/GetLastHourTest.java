package time;

import java.time.LocalDateTime;

public class GetLastHourTest {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();

        LocalDateTime start = time.minusHours(1).withMinute(0).withSecond(0).withNano(0);
        LocalDateTime end = time.minusHours(1).withMinute(59).withSecond(59).withNano(999_999_999);

        System.out.printf("start = " + start + "\nend = " + end);
    }
}
