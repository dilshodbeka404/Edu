package number;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class DecimalFormatTest {
    public static void main(String[] args) {
        // Long tipidagi raqam
        long amount = 1000000000000126L;

        // Milliy sozlamalar yordamida DecimalFormatSymbols yarating
        // ENGLISH FRENCH GERMAN ITALIAN JAPANESE KOREAN CHINESE SIMPLIFIED_CHINESE TRADITIONAL_CHINESE
        // FRANCE GERMANY ITALY JAPAN KOREA UK US CANADA CANADA_FRENCH ROOT
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        symbols.setGroupingSeparator(' '); // Bo'sh joy yordamida raqamlarni guruhlash

        // Maxsus format
        DecimalFormat decimalFormatter = new DecimalFormat("#,##0.00", symbols);
        String formattedAmount = decimalFormatter.format(amount / 100.0);

        System.out.println(formattedAmount); // 10 000 000 000 001.26
    }

}

