package leetcode;

import java.util.Stack;

/**
 * @author Dilshodbek Akhmedov, Dush 14:23. 19/12/22
 */
public class Solution739 {
    public int[] dailyTemperatures(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int len = nums.length;
        int[] res = new int[len];

        for (int i = len - 1; i >= 0; --i) {

            while (!stack.empty() && nums[stack.peek()] < nums[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                res[i] = 0;
            } else {
                res[i] = stack.peek() - i;
            }

            stack.push(i);
        }
        return res;
    }
}
