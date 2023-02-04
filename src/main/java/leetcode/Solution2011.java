package leetcode;

/**
 * @author Dilshodbek Akhmedov, Tue 10:44 AM. 1/10/23
 */
public class Solution2011 {
    public int finalValueAfterOperations(String[] operations) {
        int sum = 0;
        for (String operation : operations) {
            if (operation.charAt(1) == '-') sum--;
            else sum++;
        }
        return sum;
    }
}
