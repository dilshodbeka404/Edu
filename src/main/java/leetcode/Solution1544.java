package leetcode;

/**
 * @author Dilshodbek Akhmedov, Sesh 15:15. 08/11/22
 */
public class Solution1544 {
    public static void main(String[] args) {
        String leEeetcode = makeGood("abBAcC");
        System.out.println("leEeetcode = " + leEeetcode);
    }

    public static String makeGood(String s) {
        if (s == null || s.isEmpty() || s.length() == 1) {
            return s;
        }
        StringBuilder sb = new StringBuilder(s);
        int len = sb.length();
        int i = 0;
        while (i < len - 1) {
            if (Math.abs(sb.charAt(i) - sb.charAt(i + 1)) == 32) {
                sb.delete(i, i + 2);
                i = 0;
                len = sb.length();
            } else {
                i++;
            }
        }
        return sb.toString();
    }

    public String makeGood2(String s) {
        char[] stack = new char[s.length()];
        int top = -1;
        for (int i = 0; i < s.length(); i++) {
            if (top >= 0 && Math.abs(s.charAt(i) - stack[top]) == 32) {
                top--;
            } else {
                stack[++top] = s.charAt(i);
            }
        }

        char[] ans = new char[top + 1];
        while (top != -1) {
            ans[top] = stack[top];
            top--;
        }
        return new String(ans);
    }
}

