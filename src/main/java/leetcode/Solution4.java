package leetcode;

/**
 * @author Dilshodbek Akhmedov, Pay 10:48. 06/10/22
 */
public class Solution4 {
    public static void main(String[] args) {
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int length1 = nums1.length;
        int length2 = nums2.length;
        int length3 = length1 + length2;
        int[] mergedArray = new int[length3];

        while (i < length1 && j < length2) {
            if (nums1[i] < nums2[j]) {
                mergedArray[k] = nums1[i];
                i++;
                k++;
            } else if (nums2[j] <= nums1[i]) {
                mergedArray[k] = nums2[j];
                j++;
                k++;
            }
        }

        while (i < length1) {
            mergedArray[k] = nums1[i];
            i++;
            k++;
        }

        while (j < length2) {
            mergedArray[k] = nums2[j];
            j++;
            k++;
        }

        int middle = length3 / 2;

        if (length3 % 2 != 0) {
            return mergedArray[length3 / 2];
        } else {
            return (double) (mergedArray[middle] + mergedArray[middle - 1]) / 2;
        }
    }

//    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        int s1 = nums1.length;
//        int s2 = nums2.length;
//        double[] temp = new double[s1 + s2];
//        int i = 0, j = 0, k = 0;
//        while (i < s1 && j < s2) {
//            if (nums1[i] <= nums2[j]) {
//                temp[k] = nums1[i];
//                i++;
//            } else {
//                temp[k] = nums2[j];
//                j++;
//            }
//            k++;
//        }
//        if (i >= s1) {
//            for (int t = j; t < s2; t++) {
//                temp[k] = nums2[t];
//                k++;
//            }
//        }
//        if (j >= s2) {
//            for (int t = i; t < s1; t++) {
//                temp[k] = nums1[t];
//                k++;
//            }
//        }
//        //just for checking printing temp array
//        if (temp.length % 2 != 0)
//            return temp[temp.length / 2];
//        else
//            return (temp[temp.length / 2] + temp[temp.length / 2 - 1]) / 2;
//    }

}
