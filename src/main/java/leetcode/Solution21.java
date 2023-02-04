package leetcode;

import leetcode.models.ListNode;

import java.util.Objects;

/**
 * @author Dilshodbek Akhmedov, Dush 14:44. 26/12/22
 */
public class Solution21 {
    public ListNode mergeTwoLists1(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        ListNode node = null;
        while (Objects.nonNull(list1) || Objects.nonNull(list2)) {
            if (Objects.nonNull(list1) && Objects.nonNull(list2)) {
                if (list1.val > list2.val) {
                    node = fillNode(node, list2.val);
                    list2 = list2.next;
                } else {
                    node = fillNode(node, list1.val);
                    list1 = list1.next;
                }
            } else if (Objects.nonNull(list1)) {
                node = fillNode(node, list1.val);
                list1 = list1.next;
            } else {
                node = fillNode(node, list2.val);
                list2 = list2.next;
            }
        }
        return node;
    }

    private ListNode fillNode(ListNode node, Integer val) {
        while (node == null) {
            node = new ListNode(val);
            node = node.next;
        }
        return node;
    }

    public static void main(String[] args) {
        String m = "213214";
        int firstNode = Integer.parseInt(String.valueOf(m.charAt(0)));
        ListNode root = new ListNode(firstNode);


        ListNode temp = root;
        for (int i = 1; i < m.length(); ++i) {
            while (temp.next == null) {
                temp.next = new ListNode(Integer.parseInt(String.valueOf(m.charAt(i))));
            }
            temp = temp.next;
        }

        temp = root;

        while (temp != null) {
            System.out.print(" -> " + temp.val);
            temp = temp.next;
        }
    }
}
