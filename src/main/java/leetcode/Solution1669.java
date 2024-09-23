package leetcode;

import leetcode.models.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Solution1669 {
    public ListNode mergeInBetween1(ListNode node1, int a, int b, ListNode node2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        do {
            if (node1 != null) {
                list1.add(node1.val);
                node1 = node1.next;
            }
            if (node2 != null) {
                list2.add(node2.val);
                node2 = node2.next;
            }
        } while (node1 != null || node2 != null);


        ListNode result = null;
        for (int i = list1.size() - 1; i >= 0; i--) {
            if (b < i || i < a) {
                ListNode cache = new ListNode(list1.get(i));
                cache.next = result;
                result = cache;
            } else if (b == i) {
                for (int j = list2.size() - 1; j >= 0; j--) {
                    ListNode cache = new ListNode(list2.get(j));
                    cache.next = result;
                    result = cache;
                }
            }
        }
        return result;
    }

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode first = list1;
        ListNode second = list1;
        ListNode ans = first;
        int i = 1;
        int j = 0;

        while (i < a) {
            first = first.next;
            i++;
        }
        while (j < b) {
            second = second.next;
            j++;
        }

        first.next = list2;
        ListNode secon = list2;

        while (secon.next != null) {
            secon = secon.next;
        }

        secon.next = second.next;

        return ans;
    }

}
