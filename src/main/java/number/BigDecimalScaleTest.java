package number;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.MessageFormat;

public class BigDecimalScaleTest {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(1000);
        BigDecimal b = new BigDecimal(40);

        //  operator ->  ( + )
        System.out.println("a.add(b) = " + a.add(b));

        //  operator ->  ( - )
        System.out.println("a.subtract(b) = " + a.subtract(b));

        //  operator ->  ( * )
        System.out.println("a.multiply(b) = " + a.multiply(b));

        //  operator ->  ( / )
        System.out.println("a.divide(b) = " + a.divide(b, 2, RoundingMode.HALF_UP));

        System.out.printf(MessageFormat.format("compareTo : {0}", a.compareTo(b)));
    }
}
