package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;

/**
 * @author Dilshodbek Akhmedov, Wed 9:52 AM. 12/28/22
 */
public class Solution20 {
    Stack<Character> stack = new Stack<>();
    Stack<Character> parenthesesQueue = new Stack<>();

    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        for (int i = 0; i < s.length(); i++) {
            if (parenthesesQueue.isEmpty()) {
                parenthesesQueue.push(s.charAt(i));
            } else {
                if (Objects.equals(map.get(s.charAt(i)), parenthesesQueue.peek()))
                    parenthesesQueue.pop();
                else
                    parenthesesQueue.push(s.charAt(i));
            }
        }
        return parenthesesQueue.isEmpty();
    }

    public boolean isValid1(String s) {
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[')
                stack.push(c);
            else {
                if (stack.isEmpty())
                    return false;
                else {
                    char top = stack.peek();
                    if (top == '(' && c != ')' || top == '{' && c != '}' || top == '[' && c != ']')
                        return false;
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
