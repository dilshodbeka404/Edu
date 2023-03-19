package leetcode;

import java.util.Arrays;

public class Solution74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] ints : matrix) {
            if (matrix[0][0] < target && matrix[0][matrix[0].length - 1] > target) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (ints[j] == target) return true;
                }
            }
        }
        return false;
    }

    public boolean searchMatrix2(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;

        int i = 0;
        int j = matrix.length - 1;

        while (i < j) {
            int mid = i + (j - i) / 2;
            if (matrix[mid][matrix[0].length - 1] == target)
                return true;
            else if (matrix[mid][matrix[0].length - 1] < target)
                i = mid + 1;
            else
                j = mid - 1;
        }

        while (target > matrix[i][matrix[0].length - 1]) {
            i++;
            if (i >= matrix.length)
                return false;
        }

        int p = 0;
        j = matrix[0].length - 1;
        while (p <= j) {
            int mid = (p + j) / 2;
            if (matrix[i][mid] == target)
                return true;
            else if (matrix[i][mid] < target)
                p = mid + 1;
            else
                j = mid - 1;
        }
        return false;
    }

    public boolean searchMatrix3(int[][] matrix, int target) {
        if (matrix.length < 1 || matrix[0].length < 1) return false;
        if (target < matrix[0][0] || target > matrix[matrix.length - 1][matrix[0].length - 1]) return false;

        int[] firstColumn = new int[matrix.length];
        for (int i = 0; i < firstColumn.length; i++) {
            firstColumn[i] = matrix[i][0];
        }

        int index = Arrays.binarySearch(firstColumn, target);
        if (index >= 0) return true;
        else {
            int row = -index - 1 - 1;
            return Arrays.binarySearch(matrix[row], target) >= 0;
        }
    }
}
