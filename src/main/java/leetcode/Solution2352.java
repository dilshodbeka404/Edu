package leetcode;

import java.util.HashSet;
import java.util.Set;

public class Solution2352 {
    public int equalPairs(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (rowEqualToCol(i, j, grid)) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean rowEqualToCol(int row, int col, int[][] grid) {
        int n = grid.length;
        for (int i = 0; i < n; i++) {
            if (grid[row][i] != grid[i][col]) {
                return false;
            }
        }
        return true;
    }

    public int equalPairsq(int[][] grid) {
        int count = 0;
        int n = grid.length;
        for (int i = 0; i < n; i++) {
            Set<Integer> colSet = new HashSet<>();
            Set<Integer> rowSet = new HashSet<>();
            for (int j = 0; j < n; j++) {
                rowSet.add(grid[i][j]);
                colSet.add(grid[j][i]);
            }
            if (rowSet.equals(colSet)) {
                count++;
            }
        }
        return count;
    }

    public int equalPairsw(int[][] grid) {
        int count = 0;
        int n = grid.length;
        for (int i = 0; i < n; i++) {
            boolean isEqual = true;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != grid[j][i]) {
                    isEqual = false;
                    break;
                }
            }
            if (isEqual) {
                count++;
            }
        }
        return count;
    }
}
