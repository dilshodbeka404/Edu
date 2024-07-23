package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution402 {
    public static void main(String[] args) {

    }

    public static String removeKdigitsFor(String num, int k) {
        if (num.length() <= k) return "0";

        List<Integer> digits = new ArrayList<>();
        for (int i = 0; i < num.length() - k; i++) {
            digits.add(Integer.parseInt(num.substring(0, i) + num.substring(i + k)));
        }

        int min = Integer.MAX_VALUE;
        for (Integer digit : digits) {
            if (digit < min) min = digit;
        }

        return String.valueOf(min);
    }

    public static String removeKdigits(String num, int k) {
        if (k == num.length()) {
            return "0";
        }

        char[] digits = num.toCharArray();
        char[] stack = new char[digits.length];
        int stackTop = -1;
        int removalCount = k;

        for (char digit : digits) {
            while (removalCount > 0 && stackTop >= 0 && stack[stackTop] > digit) {
                stackTop--;
                removalCount--;
            }
            stackTop++;
            stack[stackTop] = digit;
        }

        int nonZeroStart = 0;

        while (stack[nonZeroStart] == '0' && nonZeroStart < digits.length - k - 1) {
            nonZeroStart++;
        }

        return String.valueOf(stack, nonZeroStart, digits.length - k - nonZeroStart);
    }

}
