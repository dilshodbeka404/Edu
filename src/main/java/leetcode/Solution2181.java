package leetcode;

import leetcode.models.ListNode;

import java.util.Objects;

/**
 * @author Dilshodbek Akhmedov, Wed 11:54 AM. 12/28/22
 */
public class Solution2181 {

    public ListNode mergeNodes(ListNode head) {
        ListNode newList = head;
        ListNode currHead = head.next;
        int sum;
        while (currHead != null) {
            sum = 0;
            while (currHead.val != 0) {
                sum = sum + currHead.val;
                currHead = currHead.next;
            }
            newList.next = currHead;
            currHead.val = sum;
            newList = newList.next;
            currHead = currHead.next;
        }

        return head.next;
    }
}
