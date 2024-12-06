package leetcode;

import java.util.Stack;

public class Solution921 {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.isEmpty() || !(stack.peek() == '(' && c == ')')) {
                stack.push(c);
            } else {
                stack.pop();
            }
        }
        return stack.size();
    }

    public int minAddToMakeValid2(String s) {
        int open = 0; // Counts unmatched '('
        int close = 0; // Counts unmatched ')'

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                open++;
            } else if (open > 0) {
                open--; // Matched with an open parenthesis
            } else {
                close++; // Unmatched closing parenthesis
            }
        }
        return open + close;
    }
}
