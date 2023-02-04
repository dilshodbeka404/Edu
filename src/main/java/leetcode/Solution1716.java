package leetcode;

/**
 * @author Dilshodbek Akhmedov, Pay 18:19. 10/11/22
 */
public class Solution1716 {
    public static void main(String[] args) {
        int i = totalMoney(10);
        System.out.println("i = " + i);
    }

    public static int totalMoney(int n) {
        int sum = 0;
        int start = 1;
        int target = 1;
        for (int i = 1; i <= n; i++) {
            sum += start++;
            if (i % 7 == 0) start = ++target;
        }
        return sum;
    }


}
