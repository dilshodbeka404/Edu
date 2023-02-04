package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Dilshodbek Akhmedov, Wed 6:02 PM. 1/25/23
 */
public class ZoneId {
    private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        testZoneId();
    }
    public static void testZoneId(){
        String dateKZT = dateFormatter.format(LocalDateTime.now(java.time.ZoneId.of("Asia/Almaty")));
        System.out.println("dateKZT = " + dateKZT);
        String dateUZB = dateFormatter.format(LocalDateTime.now(java.time.ZoneId.of("Asia/Tashkent")));
        System.out.println("dateUZB = " + dateUZB);
    }
}
