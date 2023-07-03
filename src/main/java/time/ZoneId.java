package time;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Dilshodbek Akhmedov, Wed 6:02 PM. 1/25/23
 */
public class ZoneId {
    private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private static final DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

    public static void main(String[] args) {
        testZoneId();
        test();
    }

    public static void testZoneId() {
        String dateKZT = dateFormatter.format(LocalDateTime.now(java.time.ZoneId.of("Asia/Almaty")));
        System.out.println("dateKZT = " + dateKZT);
        String dateUZB = dateFormatter.format(LocalDateTime.now(java.time.ZoneId.of("Asia/Tashkent")));
        System.out.println("dateUZB = " + dateUZB);


        LocalDateTime dateTime = LocalDateTime.now(java.time.ZoneId.of("Asia/Tashkent"));
        System.out.println("dateTime.getDayOfWeek() = " + dateTime.getDayOfWeek().getValue());
        System.out.println("dateTime.getHour() = " + dateTime.getHour());
        System.out.println("dateTime.getMinute() = " + dateTime.getMinute());
        System.out.println("dateTime = " + dateTime);

        System.out.println("timeFormatter = " + timeFormatter.format(dateTime));
    }

    public static void test() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now(java.time.ZoneId.of("Asia/Tashkent"));
        System.out.println("zonedDateTime.getDayOfWeek() = " + zonedDateTime.getDayOfWeek().getValue());
        System.out.println("zonedDateTime.getHour() = " + zonedDateTime.getHour());
        System.out.println("zonedDateTime.getMinute() = " + zonedDateTime.getMinute());
        System.out.println("zonedDateTime = " + zonedDateTime);
        System.out.println("timeFormatter = " + timeFormatter.format(zonedDateTime));

    }
}
