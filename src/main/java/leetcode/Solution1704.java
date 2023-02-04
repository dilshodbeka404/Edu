package leetcode;

/**
 * @author Dilshodbek Akhmedov, Pay 09:11. 01/12/22
 */
public class Solution1704 {
//    public static boolean halvesAreAlike(String s) {
//        Set<Character> chars = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
//        int result = 0;
//        int half = s.length() / 2;
//        for (int i = 0; i < s.length(); i++) {
//            if (chars.contains(s.charAt(i))) {
//                if (i < half) {
//                    result += 1;
//                } else {
//                    result -= 1;
//                }
//            }
//        }
//        return result == 0;
//    }

    public static void main(String[] args) {
//        halvesAreAlike("book");
    }


    public boolean halvesAreAlike(String s) {
        char[] ch = s.toCharArray();
        int length = s.length();
        int mid = length / 2;
        int left = counting(ch, 0, mid - 1);
        int right = counting(ch, mid, length - 1);
        return left == right;
    }

    public int counting(char[] ch, int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' ||
                    ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
                count++;
            }
        }
        return count;
    }
}
