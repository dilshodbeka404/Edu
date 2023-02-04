package leetcode;

/**
 * @author Dilshodbek Akhmedov, Sesh 17:16. 25/10/22
 */
public class Solution88 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{4, 5, 6, 0, 0, 0};
        int[] nums2 = new int[]{1, 2, 3};
        merge(nums1, 3, nums2, 3);
    }

    public static void merge(int[] A, int m, int[] B, int n) {
        for (int i = n + m - 1, a = m - 1, b = n - 1; i >= 0; i--) {
            if (a >= 0 && A[a] > B[b]) {
                A[i] = A[a--];
            } else A[i] = B[b--];
        }


    }
}
