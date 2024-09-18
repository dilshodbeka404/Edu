package time;

import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class WeekNumber {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        WeekFields weekFields = WeekFields.of(Locale.getDefault());
        int weekNumber = today.get(weekFields.weekOfYear());
        System.out.println("Bugun yilning " + weekNumber + "-haftasi");
    }
}
