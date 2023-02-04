package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dilshodbek Akhmedov, Dush 12:14. 05/12/22
 */
public class Solution54 {
    public List<Integer> spiralOrders(int[][] matrix) {
        int y = 0, x = 0;
        boolean hasNextMove = true;
        List<Integer> list = new ArrayList<>(matrix.length * matrix[0].length);
        list.add(matrix[y][x]);
        matrix[y][x] = 101;
        while (hasNextMove) {
            boolean moveMade = false;
            while (moveExists(y, x + 1, matrix)) {
                x++;
                list.add(matrix[y][x]);
                matrix[y][x] = 101;
                moveMade = true;
            }
            while (moveExists(y + 1, x, matrix)) {
                y++;
                list.add(matrix[y][x]);
                matrix[y][x] = 101;
                moveMade = true;
            }
            while (moveExists(y, x - 1, matrix)) {
                x--;
                list.add(matrix[y][x]);
                matrix[y][x] = 101;
                moveMade = true;
            }
            while (moveExists(y - 1, x, matrix)) {
                y--;
                list.add(matrix[y][x]);
                matrix[y][x] = 101;
                moveMade = true;
            }
            if (moveMade) continue;
            hasNextMove = false;
        }
        return list;
    }

    private boolean moveExists(int row, int col, int[][] grid) {
        return row >= 0 && row < grid.length && col >= 0 && col < grid[0].length && grid[row][col] != 101;
    }


    public List<Integer> spiralOrder(int[][] matrix) {
        int length = matrix.length;
        if (length == 0) {
            return new ArrayList<>();
        }
        int width = matrix[0].length;
        if (width == 0) {
            return new ArrayList<>();
        }
        int total = length * width;
        List<Integer> result = new ArrayList<>();
        int start = 0;
        int xStart = 0;
        int yStart = 0;
        int xLimit = width - 1;
        int yLimit = length - 1;
        int i = xStart;
        int j = yStart;
        while (start < total) {
            while (start < total && i <= xLimit) {
                result.add(matrix[j][i++]);
                start++;
            }
            i--;
            j++;
            while (start < total && j <= yLimit) {
                result.add(matrix[j++][i]);
                start++;
            }
            j--;
            i--;
            while (start < total && i >= xStart) {
                result.add(matrix[j][i--]);
                start++;
            }
            i++;
            j--;
            while (start < total && j > yStart) {
                result.add(matrix[j--][i]);
                start++;
            }
            xStart++;
            yStart++;
            xLimit--;
            yLimit--;
            i = xStart;
            j = yStart;
        }
        return result;
    }
}
