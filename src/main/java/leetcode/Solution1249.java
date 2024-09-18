package leetcode;

public class Solution1249 {

    public static void main(String[] args) {
        minRemoveToMakeValid("())()(((");
    }

    public static String minRemoveToMakeValid(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
            }
            if (s.charAt(i) == ')') {
                if (count == 0) {
                    s = s.substring(0, i) + s.substring(i + 1);
                    --i;
                } else {
                    count--;
                }
            }
        }

        for (int i = s.length() - 1; count > 0; i--) {
            if (s.charAt(i) == '(') {
                s = s.substring(0, i) + s.substring(i + 1);
                --count;
            }
        }

        return s;
    }
}
