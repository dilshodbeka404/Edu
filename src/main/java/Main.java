import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
//        String inputUrl = "/api/mobile/client/v1/avia/hints/lookup/р";
//
//        String encodedUrl = URLEncoder.encode(inputUrl, StandardCharsets.UTF_8);
//        System.out.println("Encoded URL: " + encodedUrl);
//
//        System.out.println(
//                "URLDecoder.decode(\"/api/mobile/client/v1/avia/hints/lookup/%D1%80\", StandardCharsets.ISO_8859_1) = "
//                        + URLDecoder.decode("/api/mobile/client/v1/categories?search=%D0%90%D0%B0", StandardCharsets.ISO_8859_1)
//        );
//
//        System.out.println(
//                "URLDecoder.decode(\"/api/mobile/client/v1/avia/hints/lookup/%D1%80\", StandardCharsets.UTF_8) = "
//                        + URLDecoder.decode("/api/mobile/client/v1/categories?search=%D0%90%D0%B0", StandardCharsets.UTF_8)
//        );
//        System.out.println(
//                "URLDecoder.decode(\"/api/mobile/client/v1/avia/hints/lookup/%D1%80\", StandardCharsets.UTF_8) = "
//                        + URLDecoder.decode("/api/mobile/client/v1/avia/hints/lookup/%D1%80", StandardCharsets.UTF_8)
//        );
//        System.out.println(
//                "URLDecoder.decode(\"/api/mobile/client/v1/avia/hints/lookup/%D1%80\", StandardCharsets.UTF_8) = "
//                        + URLDecoder.decode("/api/mobile/client/v1/avia/hints/lookup/з", StandardCharsets.UTF_8)
//        );
//        System.out.println(
//                "URLDecoder.decode(\"/api/mobile/client/v1/avia/hints/lookup/%D1%80\", StandardCharsets.UTF_8) = "
//                        + URLDecoder.decode("/api/mobile/client/v1/avia/hints/lookup/вsa", StandardCharsets.UTF_8)
//        );
//
//
//        String numbers = "  9848 464 454 4";
//        String trimmedNumbers = numbers.replaceAll("\\s+", "");
//        System.out.println(trimmedNumbers);
//        System.out.println(Boolean.TRUE.toString());

        DateTimeFormatter format = new DateTimeFormatterBuilder()
                .appendPattern("MMyy")
                .parseDefaulting(ChronoField.DAY_OF_MONTH, 1)
                .parseDefaulting(ChronoField.HOUR_OF_DAY, 0)
//                .parseDefaulting(ChronoField.MINUTE_OF_HOUR, 0)
//                .parseDefaulting(ChronoField.SECOND_OF_MINUTE, 0)
//                .parseDefaulting(ChronoField.MILLI_OF_SECOND, 0)
                .toFormatter();

        LocalDateTime ldt1 = LocalDateTime.parse(null, format);
        String ldt2 = ldt1.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        System.out.println(ldt1);
        System.out.println(ldt2);


    }
}
