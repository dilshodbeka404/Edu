package leetcode;

import leetcode.models.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dilshodbek Akhmedov, Sesh 09:48. 06/12/22
 */
public class Solution328 {
    public ListNode oddEvenList(ListNode head) {
        List<Integer> firstPart = new ArrayList<>();
        List<Integer> secondPart = new ArrayList<>();
        boolean swch = true;

        while (head != null) {
            if (swch) firstPart.add(head.val);
            else secondPart.add(head.val);

            swch = !swch;
            head = head.next;
        }
        head = new ListNode();
        for (Integer value : firstPart) {
            head.val = value;
            head.next = head;
        }
        for (Integer integer : secondPart) {
            head.val = integer;
            head.next = head;
        }

        return head.next;
    }

    public ListNode oddEvenLists(ListNode head) {
        if (head == null) return null;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    public static void main(String[] args) {
        // TODO document why this method is empty
    }
}
