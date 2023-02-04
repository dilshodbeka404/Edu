package leetcode;

import leetcode.models.ListNode;

/**
 * @author Dilshodbek Akhmedov, Pay 15:39. 13/10/22
 */
public class Solution83 {

    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        head.next = deleteDuplicates(head.next);
        return head.val == head.next.val ? head.next : head;
    }


//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int c = 0;
//        while (m < nums1.length) {
//            nums1[m++] = nums2[c++];
//        }
//        Arrays.sort(nums1);
//
//    }

    public void merge(int[] A, int m, int[] B, int n) {
        for (int i = m + n - 1, a = m - 1, b = n - 1; b >= 0; i--) {
            if (a >= 0 && A[a] > B[b]) A[i] = A[a--];
            else A[i] = B[b--];
        }
    }
}
