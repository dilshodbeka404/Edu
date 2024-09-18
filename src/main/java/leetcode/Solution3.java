package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Dilshodbek Akhmedov, Pay 12:29. 01/12/22
 */
public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        Queue<Character> queue = new LinkedList<>();
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!queue.contains(s.charAt(i))) {
                queue.add(s.charAt(i));
                if (queue.size() > maxLength) {
                    maxLength = queue.size();
                }
            } else {
                while (queue.poll() != s.charAt(i)) {
                }
                queue.add(s.charAt(i));
            }
        }
        return maxLength;
    }
}
