package leetcode;

import leetcode.models.ListNode;

import java.util.Stack;

public class Solution445 {
    public ListNode addTwoNumbers1(ListNode n1, ListNode n2) {
        Stack<Integer> nums1 = new Stack<>();
        Stack<Integer> nums2 = new Stack<>();
        while (n1 != null || n2 != null) {
            if (n1 != null) {
                nums1.push(n1.val);
                n1 = n1.next;
            }
            if (n2 != null) {
                nums2.push(n2.val);
                n2 = n2.next;
            }
        }

        ListNode node = null;
        int mem = 0;
        while (!nums1.isEmpty() || !nums2.isEmpty()) {
            int sum = (!nums1.isEmpty() ? nums1.pop() : 0) + (!nums2.isEmpty() ? nums2.pop() : 0);

            ListNode tmp = new ListNode(sum % 10 + mem);
            tmp.next = node;
            node = tmp;
            mem = sum / 10;
        }
        if (mem > 0) {
            return node;
        } else {
            ListNode result = new ListNode(mem);
            result.next = node;
            return result;
        }
    }

    public ListNode addTwoNumbers(ListNode n1, ListNode n2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while (n1 != null || n2 != null) {
            int sum = carry;
            if (n1 != null) {
                sum += n1.val;
                n1 = n1.next;
            }
            if (n2 != null) {
                sum += n2.val;
                n2 = n2.next;
            }

            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }

        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return dummy.next;
    }
}
