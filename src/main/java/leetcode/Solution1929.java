package leetcode;

/**
 * @author Dilshodbek Akhmedov, Wed 10:30 AM. 12/28/22
 */
public class Solution1929 {
    public int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];
        int count = nums.length;
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
            result[i + count] = nums[i];

        }
        return result;
    }
}
