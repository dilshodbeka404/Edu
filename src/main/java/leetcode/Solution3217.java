package leetcode;

import leetcode.models.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Solution3217 {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> values = new HashSet<>();
        for (int i : nums) {
            values.add(i);
        }

        ListNode temp = new ListNode(0, head);
        ListNode p = temp;
        while (temp.next != null) {
            if (values.contains(temp.next.val)) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return p.next;
    }

    public ListNode modifiedList2(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode ptr = head;


        while (ptr != null) {
            if (set.contains(ptr.val)) {
                prev.next = ptr.next;
            } else {
                prev = ptr;
            }
            ptr = ptr.next;
        }

        return dummy.next;
    }
}
