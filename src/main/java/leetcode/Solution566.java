package leetcode;

/**
 * @author Dilshodbek Akhmedov, Jum 10:32. 23/12/22
 */
public class Solution566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
//        List<Integer> list = new ArrayList<>();
//        int[][] newMatrix = new int[r][c];
//        for (int[] ints : nums) {
//            for (int i : ints) {
//                list.add(i);
//            }
//        }
//        int count = 0;
//        for (int i = 0; i < r; i++) {
//            for (int j = 0; j < c; j++) {
//                newMatrix[i][j] = list.get(count++);
//            }
//        }
//        return newMatrix;

        int n = nums.length;
        int m = nums[0].length;
        if (r * c != n * m) return nums;
        int[][] res = new int[r][c];
        for (int i = 0; i < r * c; i++)
            res[i / c][i % c] = nums[i / m][i % m];
        return res;
    }
}
