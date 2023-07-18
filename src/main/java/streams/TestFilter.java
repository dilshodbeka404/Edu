package streams;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestFilter {
    public static void main(String[] args) {

        LocalDateTime hours = LocalDateTime.now().minusHours(1);
        LocalDateTime min28 = LocalDateTime.now().minusMinutes(28);
        LocalDateTime min29 = LocalDateTime.now().minusMinutes(29);
        LocalDateTime min30 = LocalDateTime.now().minusMinutes(30);
        LocalDateTime min31 = LocalDateTime.now().minusMinutes(31);

        List<LocalDateTime> localDateTimes = Arrays.asList(hours, min28, min29, min30, min31);
        System.out.println("localDateTimes = " + localDateTimes);

        List<LocalDateTime> collect = localDateTimes.stream()
                .filter(localDateTime -> localDateTime.isBefore(LocalDateTime.now().minusMinutes(30)))
                .collect(Collectors.toList());

        System.out.println("localDateTimes = " + collect);
    }
}
