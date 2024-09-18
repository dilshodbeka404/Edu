package leetcode;

import java.util.Map;

public class Solution2706 {
    public static void main(String[] args) {
        buyChoco(new int[]{1, 2, 2}, 3);
    }
    public static int buyChoco(int[] prices, int money) {
        int price1 = 102;
        int price2 = 101;
        for (int price : prices) {
            if (price1 >= price) {
                price2 = price1;
                price1 = price;
            } else if (price2 > price) {
                price2 = price;
            }
        }
        return (price1 + price2 <= money)
                ? (money - (price1 + price2))
                : money;
    }
}
