package leetcode;

/**
 * @author Dilshodbek Akhmedov, Sesh 09:46. 13/12/22
 */
public class Solution931 {

//    public int minFallingPathSum(int[][] matrix) {
//
//        for (int i = 1; i < matrix.length; i++) {
//            for (int j = 0; j < matrix.length; j++) {
//                matrix[i][j] += minOfThree(matrix, i - 1, j);
//            }
//        }
//
//        int res = Integer.MAX_VALUE;
//        for (int k = 0; k < matrix.length; k++) {
//            res = Math.min(res, matrix[matrix.length - 1][k]);
//        }
//
//        return res;
//    }
//
//    private int minOfThree(int[][] matrix, int i, int j) {
//        int min = matrix[i][j];
//
//        if (j > 0) {
//            min = Math.min(min, matrix[i][j - 1]);
//        }
//
//        if (j < matrix.length - 1) {
//            min = Math.min(min, matrix[i][j + 1]);
//        }
//
//        return min;
//    }

    int ans = Integer.MAX_VALUE;

    public int minFallingPathSum(int[][] matrix) {
        helper(matrix, matrix.length - 2);
        return ans;
    }

    void helper(int[][] matrix, int r) {
        if (r < 0) {
            for (int i = 0; i < matrix.length; i++) {
                ans = Math.min(ans, matrix[0][i]);
            }
            return;
        }

        for (int i = 0; i < matrix.length; i++) {
            int minNextVal = matrix[r + 1][i];
            if (i > 0) {
                minNextVal = Math.min(minNextVal, matrix[r + 1][i - 1]);
            }
            if (i < matrix.length - 1) {
                minNextVal = Math.min(minNextVal, matrix[r + 1][i + 1]);
            }
            matrix[r][i] += minNextVal;
        }

        helper(matrix, r - 1);
    }
}
