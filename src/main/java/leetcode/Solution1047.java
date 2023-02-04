package leetcode;

/**
 * @author Dilshodbek Akhmedov, Pay 11:33. 10/11/22
 */
public class Solution1047 {
    public static void main(String[] args) {
        String s = "abbaca";
        String result = removeDuplicates(s);
        System.out.println("result = " + result);
    }

        public static String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if(sb.length() > 0 && sb.charAt(sb.length() - 1) == c){
                sb.deleteCharAt(sb.length() - 1);
            }else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

}
