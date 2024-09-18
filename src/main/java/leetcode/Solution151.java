package leetcode;

/**
 * @author Dilshodbek Akhmedov, Dush 10:44. 14/11/22
 */
public class Solution151 {
    public static void main(String[] args) {
        String hello_dilshod = reverseWords("hello dilshod ");
        System.out.println(hello_dilshod);
    }

//    public static String reverseWords(String s) {
//        s = s.trim();
//        StringTokenizer stringTokenizer = new StringTokenizer(s, " ");
//        StringBuilder stringBuilder = new StringBuilder();
//        while (stringTokenizer.hasMoreTokens()) {
//            stringBuilder.insert(0, stringTokenizer.nextToken() + " ");
//        }
//
//        return stringBuilder.toString().trim();
//    }

    private static String reverseWords(String s) {
        s.trim();
        String[] words = s.trim().split(" ");
        String s1 = "";
        for (int i = words.length - 1; 0 <= i; i--) {
            s1 = s1 + words[i] + "";
        }
        return s1.trim();
    }

    public String reverseWords2(String s) {
        StringBuilder sb = new StringBuilder();
        int end = s.length();
        for (int i = s.length() - 1; i >= -1; i--) {
            char c = i == -1 ? ' ' : s.charAt(i);
            if (c == ' ') {
                String ss = s.substring(i + 1, end);
                if (!ss.isBlank()) {
                    if (sb.length() > 0) sb.append(" ");
                    sb.append(ss);
                }
                end = i;
            }
        }
        return sb.toString();
    }

    public String reverseWords3(String s) {
        if (s.length() == 1)
            return s;

        String[] words = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].trim().isEmpty()) {
                sb.append(words[i]);
                if (i > 0)
                    sb.append(" ");
            }
        }
        return sb.toString();
    }
}
