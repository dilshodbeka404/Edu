package leetcode;

import leetcode.models.ListNode;

public class Solution1721 {
    public ListNode swapNodes(ListNode head, int k) {
        int firstK;
        int count = 0;
        ListNode firstNode = head;
        for (int i = 1; i <= k; i++) {
            if (i == k)
                firstK = firstNode.val;
            else
                firstNode = firstNode.next;
        }
        return null;
    }
}
