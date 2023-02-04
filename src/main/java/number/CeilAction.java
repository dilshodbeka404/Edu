package number;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * @author Dilshodbek Akhmedov, Tue 3:44 PM. 1/24/23
 */
public class CeilAction {
    public static void main(String[] args) {
        Double aDouble = ceilDecMinus(1000.0, 3.0);
    }
    private static Double ceilDecMinus(Double buyRate, Double buyCommission) {
        DecimalFormat format = new DecimalFormat("0.00");
        format.setRoundingMode(RoundingMode.CEILING);
        return Double.valueOf(format.format(buyRate * (1 - buyCommission / 100)));
    }
}
