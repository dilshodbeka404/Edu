package calculator;

/**
 * @author Dilshodbek Akhmedov, Sat 7:28 AM. 1/14/23
 */
public class CreditCalculator {
    public static void main(String[] args) {
        calculator(20, 694_000_000, 294_000_000, 18);
    }

    public static void calculator(int year, double price, double firstPrice, double interest) {
        int part = year * 12;
        double remainingAmount = price - firstPrice;
        System.out.println("remainingAmount = " + (String.format("%,.2f", remainingAmount)));
        double payment = remainingAmount / part;
        System.out.println("payment = " + (String.format("%,.2f", payment)));
        double sum = 0;
        double interestAmount = interest * remainingAmount / 100 / 12;
        for (int i = 1; i <= part; i++) {
            double value = payment + remainingAmount + interestAmount;
            System.out.println(i + " month: " + (String.format("%,.2f", value)));
            remainingAmount -= payment;
            sum += value;
            if (part / 12 == 0) interestAmount = interest * remainingAmount / 100 / 12;
        }
        System.out.println("sum = " + (String.format("%,.2f", sum)));
    }
}
