package calculator;

/**
 * @author Dilshodbek Akhmedov, Sat 7:28 AM. 1/14/23
 */
public class CreditCalculator {
    public static void main(String[] args) {
        calculator(10, 36_000, 13.0, 26.0);
    }

    public static void calculator(int year, double price, double interest, double firstInterest) {
        double sum = 0;
        for (int i = 1; i < year; i++) {
            double firstPrice = Math.round(price * firstInterest / 100);
            price = price - firstPrice;
            System.out.println(i + " year price = " + firstPrice);
            System.out.println("rest price = " + price);
            price = Math.round(price * (1 + interest / 100));
            sum += firstPrice;
        }
        sum += price;
        System.out.println("sum = " + sum);
    }
}
