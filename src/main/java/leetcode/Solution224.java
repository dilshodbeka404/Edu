package leetcode;

public class Solution224 {
    int i = 0;

    public int calculate(String s) {
        // this is a recursive way of doing it but upon reviewing solutions you can use a STAK
        // go through each char of string one by one
        // skip spaces and plus signs (we are adding everything)
        // build up a total over time by adding numbers as they show up
        // maybe treat everything as addition and count - as a negative num
        // parenthesis should be summed and then used as their numeral result

        return process(s);
    }

    public int process(String s) {
        int sum = 0;
        int operator = 1;
        int num = 0;
        while (i < s.length()) {
            char digit = s.charAt(i++);
            if (digit == ' ') {
                continue;
            } else if (digit == '+') {
                sum += num * operator;
                num = 0;
                operator = 1;
            } else if (digit == '(') {
                sum += process(s) * operator;
                operator = 1;
            } else if (digit == ')') {
                return sum + num * operator;
            } else if (digit == '-') {
                sum += num * operator;
                operator = -1;
                num = 0;
            } else {
                // this is a number
                num = num * 10 + (digit - '0');
            }
        }
        return sum + num * operator;
    }
}
