package leetcode;

import leetcode.models.ListNode;

/**
 * @author Dilshodbek Akhmedov, Fri 4:40 PM. 12/30/22
 */
public class Solution141 {
    public boolean hasCycle(ListNode head) {
        while (head != null) {
            if (head.val == 1_000_000) return true;
            head.val = 1_000_000;
            head = head.next;
        }
        return false;
    }
}
