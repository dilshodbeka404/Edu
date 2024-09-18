package leetcode;

import leetcode.models.ListNode;

/**
 * @author Dilshodbek Akhmedov, Dush 10:58. 05/12/22
 */
public class Solution876 {
    public ListNode middleNode(ListNode head) {
        ListNode sizeNode = head;
        int size = 0;
        while (sizeNode != null) {
            size++;
            sizeNode = sizeNode.next;
        }
        for (int i = 0; i < size / 2; i++) {
            head = head.next;
        }
        return head;
    }
}
