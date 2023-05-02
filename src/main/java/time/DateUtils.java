package time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public final class DateUtils {

    public static final DateTimeFormatter longDateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    public static final DateTimeFormatter cardExpiryDateFormat = DateTimeFormatter.ofPattern("MMyy");
    public static final DateTimeFormatter longDateFormatWithoutSecond = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    public static final DateFormat monthYearFormat = new SimpleDateFormat("MMyy");

    public static String getLocalDateTimeAsStringWithoutSecond(LocalDateTime localDateTime) {
        if (localDateTime == null) {
            return null;
        }
        return longDateFormatWithoutSecond.format(localDateTime);
    }

    public static LocalDateTime getStartOfMonth(LocalDateTime dateTime) {
        dateTime = dateTime.withDayOfMonth(1);
        dateTime = dateTime.withHour(0);
        dateTime = dateTime.withMinute(0);
        dateTime = dateTime.withSecond(0);
        dateTime = dateTime.withNano(0);
        return dateTime;
    }

    public static Date setBeginningOfTheDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    public static Date setEndOfTheDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        return calendar.getTime();
    }

    public static LocalDateTime setLastDayOfMonth(LocalDateTime dateTime) {
        if (dateTime == null) {
            return null;
        }
        return LocalDateTime.of(YearMonth.from(dateTime).atEndOfMonth(), LocalTime.MAX);
    }

    public static LocalDateTime setFirstDayOfMonth(LocalDateTime dateTime) {
        if (dateTime == null) {
            return null;
        }
        return LocalDateTime.of(YearMonth.from(dateTime).atDay(1), LocalTime.MIN);
    }

    public static LocalDateTime setDefaultGMTTimeZone(LocalDateTime dateTime) {
        if (dateTime == null) {
            return null;
        }
        return dateTime.atZone(ZoneId.of("Asia/Tashkent")).withZoneSameInstant(ZoneId.of("GMT")).toLocalDateTime();
    }
}
