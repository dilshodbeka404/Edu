package leetcode;

import leetcode.models.ListNode;

import java.util.Stack;

public class Solution160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Stack<Integer> stackA = new Stack<>();
        Stack<Integer> stackB = new Stack<>();

        while (headA != null || headB != null) {
            if (headA != null) {
                stackA.push(headA.val);
                headA = headA.next;
            }
            if (headB != null) {
                stackB.push(headB.val);
                headB = headB.next;
            }
        }

        ListNode node = null;
        while (!stackA.isEmpty() && !stackB.isEmpty()) {
            int tmpA = stackA.pop();
            int tmpB = stackB.pop();

            if (tmpA == tmpB) {
                ListNode tmp = new ListNode(tmpA);
                tmp.next = node;
                node = tmp;
            }
            else break;

        }
        return node;
    }
}
