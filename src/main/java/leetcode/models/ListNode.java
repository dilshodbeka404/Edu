package leetcode.models;

/**
 * @author Dilshodbek Akhmedov, Dush 10:50. 28/11/22
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
