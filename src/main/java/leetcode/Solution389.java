package leetcode;

/**
 * @author Dilshodbek Akhmedov, Shan 20:40. 26/11/22
 */
public class Solution389 {
    public char findTheDifference(String s, String t) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count -= s.charAt(i);
            count += t.charAt(i);
        }
        count += t.charAt(s.length());
        return (char) count;
    }

//    public char findTheDifference(String s, String t) {
//        Map<Character, Integer> box = new HashMap<>();
//        for (char c : s.toCharArray()) {
//            Integer val = box.get(c);
//            if (Objects.nonNull(val)) {
//                box.put(c, val + 1);
//            } else {
//                box.put(c, 1);
//            }
//        }
//
//        for (char c : t.toCharArray()) {
//            Integer val = box.get(c);
//            if (Objects.nonNull(val)) {
//                if (val > 1) {
//                    box.put(c, val - 1);
//                } else {
//                    box.remove(c);
//                }
//            } else return c;
//        }
//        return 'a';
//    }
}
