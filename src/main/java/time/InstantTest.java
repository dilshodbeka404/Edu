package time;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest {
    public static void main(String[] args) {
        Instant confirmationDate = Instant.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("confirmationDate = " + confirmationDate);
        System.out.println("localDateTime = " + localDateTime);
    }
}
