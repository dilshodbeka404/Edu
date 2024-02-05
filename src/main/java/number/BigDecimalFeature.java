package number;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author Dilshodbek Akhmedov, Pay 12:52. 10/11/22
 */
public class BigDecimalFeature {
    public static void main(String[] args) {
//        double val = 13.12491234;
//        BigDecimal bigDecimal = BigDecimal.valueOf(val);
//
//        bigDecimal = bigDecimal.setScale(4, RoundingMode.UP);
//
//        System.out.println("bigDecimal = " + bigDecimal.doubleValue());
//        calculateCashback();
//        System.out.printf("--> " + subtractAndRemainder(BigDecimal.valueOf(35983194L)));

        BigDecimal value = BigDecimal.valueOf(340000.00);

        System.out.println("value = " + value.longValue());
    }


    public static void calculateCashback() {
        long amount = 50000;
        double commission = 12.5;

        BigDecimal newApayCashback = calcCommissionPercentOfTotalAmount(
                BigDecimal.valueOf(amount / 100),
                BigDecimal.valueOf(commission)
        );


        BigDecimal multiply = newApayCashback.multiply(new BigDecimal(90)).divide(new BigDecimal(100), RoundingMode.HALF_DOWN);

        System.out.println("newApayCashback = " + newApayCashback + "\nmultiply = " + multiply);
    }

    public static BigDecimal calcCommissionPercentOfTotalAmount(BigDecimal totalAmount, BigDecimal commission) {
        if (commission == null) {
            return BigDecimal.ZERO;
        }
        return commission.divide(totalAmount.divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP), 2, RoundingMode.HALF_UP);
    }

    public static BigDecimal subtractAndRemainder(BigDecimal withdrawAmount) {
        return withdrawAmount.subtract(withdrawAmount.remainder(BigDecimal.valueOf(10000000L)));
    }

}
