package leetcode;

import leetcode.models.ListNode;

public class Solution2807 {

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = head.next;

        ListNode ekubNode;

        while (p2 != null) {
            ekubNode = new ListNode(ekub(p1.val, p2.val));
            p1.next = ekubNode;
            ekubNode.next = p2;

            p1 = p2;
            p2 = p2.next;
        }

        return head;
    }

    private int ekub(int a, int b) {
//        for (int i = Math.min(a, b); i > 1; i--) {
//            if (a % i == 0 && b % i == 0) return i;
//        }
//        return 1;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 99;
        int b = 120;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println(a);
    }
}
