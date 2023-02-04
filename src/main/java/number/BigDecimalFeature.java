package number;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author Dilshodbek Akhmedov, Pay 12:52. 10/11/22
 */
public class BigDecimalFeature {
    public static void main(String[] args) {
     double val = 13.12491234;
        BigDecimal bigDecimal = new BigDecimal(val);

        bigDecimal = bigDecimal.setScale(4, RoundingMode.UP);

        System.out.println("bigDecimal = " + bigDecimal.doubleValue());
    }
}
