package leetcode;

import java.util.Arrays;

public class Solution2389 {

    public static void main(String[] args) {
        int[] queries = new int[]{624082};
        int[] nums = new int[]{972985, 564269, 607119, 693641, 787608, 46517, 500857, 140097};
        answerQueries(nums, queries);
    }

    public static int[] answerQueries(int[] nums, int[] queries) {
        int[] result = new int[queries.length];
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < queries.length; i++) {
            int tmp = 0;
            for (int num : nums) {
                tmp += num;
                if (tmp <= queries[i])
                    count++;
                else
                    break;
                result[i] = count;
            }
            count = 0;
        }
        return result;
    }
}
