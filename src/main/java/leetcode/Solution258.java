package leetcode;

public class Solution258 {
    public static void main(String[] args) {
        int i = addDigits(38);
    }

    public static int addDigits(int num) {
        return calculate(num);
    }

    public static int calculate(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        if (sum < 10) return sum;
        return calculate(sum);
    }

}
