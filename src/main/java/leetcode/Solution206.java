package leetcode;

import leetcode.models.ListNode;

/**
 * @author Dilshodbek Akhmedov, Shan 16:15. 19/11/22
 */
public class Solution206 {

//    public ListNode reverseList(ListNode head) {
//        ListNode node = null;
//
//        while (Objects.nonNull(head)) {
//            ListNode next = head.next;
//            head.next = node;
//            node = head;
//            head = next;
//        }
//        return node;
//    }

    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        return reverseNode(null, head);
    }

    public ListNode reverseNode(ListNode first, ListNode second) {
        ListNode nextNode = second.next;
        second.next = first;

        if (nextNode == null) return second;

        return reverseNode(second, nextNode);
    }

}
