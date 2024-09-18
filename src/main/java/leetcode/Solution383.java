package leetcode;

/**
 * @author Dilshodbek Akhmedov, Shan 20:28. 26/11/22
 */
public class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;
        int[] alphabets_counter = new int[26];

        for (char c : magazine.toCharArray())
            alphabets_counter[c - 'a']++;

        for (char c : ransomNote.toCharArray()) {
            if (alphabets_counter[c - 'a'] == 0) return false;
            alphabets_counter[c - 'a']--;
        }
        return true;
    }

//    public boolean canConstruct(String ransomNoteStr, String magazineStr) {
//        Map<Character, Integer> magazine = new HashMap<>();
//        for (char c : magazineStr.toCharArray()) {
//            Integer val = magazine.get(c);
//            if (Objects.nonNull(val)) {
//                magazine.put(c, val + 1);
//            } else {
//                magazine.put(c, 1);
//            }
//        }
//
//        for (char c : ransomNoteStr.toCharArray()) {
//            Integer val = magazine.get(c);
//            if (Objects.nonNull(val)) {
//                if (val > 1) {
//                    magazine.put(c, val - 1);
//                } else {
//                    magazine.remove(c);
//                }
//            } else return false;
//        }
//        return true;
//    }
}
