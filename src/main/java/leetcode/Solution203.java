package leetcode;

import leetcode.models.ListNode;

/**
 * @author Dilshodbek Akhmedov, Jum 16:02. 18/11/22
 */
public class Solution203 {
    public static void main(String[] args) {

    }

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;

        ListNode next = removeElements(head.next, val);

        if (head.val == val) return next;
        head.next = next;

        return head;
    }

//    public ListNode removeElements(ListNode head, int val) {
//        if (head == null) {
//            return null;
//        }
//
//        ListNode dummy = new ListNode();
//        dummy.next = head;
//
//        ListNode prev = dummy;
//
//        while (head != null) {
//            if (head.val == val) {
//                prev.next = head.next;
//            } else {
//                prev = head;
//            }
//            head = head.next;
//        }
//
//        return dummy.next;
//    }
}
