package leetcode;

import java.util.Stack;

/**
 * @author Dilshodbek Akhmedov, Yak 15:25. 18/12/22
 */
public class Solution150 {
    Stack<Integer> nums = new Stack<>();

    public int evalRPN(String[] tokens) {
        for (String s : tokens) {
            nums.push(exSwitch(s));
        }
        return nums.peek();
    }

    private int exSwitch(String token) {
        int a;
        int b;
        int result;
        switch (token) {
            case "+":
                b = nums.pop();
                a = nums.pop();
                result = a + b;
                break;
            case "-":
                b = nums.pop();
                a = nums.pop();
                result = a - b;
                break;
            case "*":
                b = nums.pop();
                a = nums.pop();
                result = a * b;
                break;
            case "/":
                b = nums.pop();
                a = nums.pop();
                result = a / b;
                break;
            default:
                result = Integer.parseInt(token);
        }
        return result;
    }
}
