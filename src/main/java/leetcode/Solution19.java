package leetcode;

import leetcode.models.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Solution19 {
    public ListNode removeNthFromEnd0(ListNode head, int n) {
        List<Integer> nodeList = new ArrayList<>();

        while (head != null) {
            nodeList.add(head.val);
            head = head.next;
        }

        ListNode node = null;
        for (int i = nodeList.size() - 1; i >= 0; i--) {
            if (i != n) {
                ListNode listNode = node;
                node = new ListNode(nodeList.get(i));
                node.next = listNode;
            }
        }

        return node;
    }

    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode temp;

        while (curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) return null;

        ListNode newHead = reverseList(head);
        ListNode prev = null;
        ListNode curr = newHead;

        while (--n > 0) {
            prev = curr;
            curr = curr.next;
        }

        if (prev == null) {
            //the problem is asking to delete the last node itself
            prev = curr;
            curr = curr.next;
            prev.next = null;
            head = reverseList(curr);
        } else {
            prev.next = curr.next;
            curr.next = null;
            head = reverseList(newHead);
        }
        return head;
    }
}
