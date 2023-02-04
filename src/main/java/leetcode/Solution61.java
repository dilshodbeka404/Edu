package leetcode;

import leetcode.models.ListNode;

/**
 * @author Dilshodbek Akhmedov, Wed 9:05 AM. 1/18/23
 */
public class Solution61 {

    public ListNode rotateRight(ListNode head, int k) {
        ListNode node = head;
        if (head == null || head.next == null) return head;

        int n = 1;
        while (node.next != null) {
            node = node.next;
            n++;
        }

        node.next = head;
        node = head;

        k = k % n;
        for (int i = 0; i < n - k - 1; i++) {
            node = node.next;
        }

        head = node.next;
        node.next = null;
        return head;
    }
}
