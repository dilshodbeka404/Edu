package leetcode;

/**
 * @author Dilshodbek Akhmedov, Dush 11:54. 05/12/22
 */
public class Solution6 {
    public String convert(String s, int numRows) {
        int N = s.length();
        if (numRows == 1 || numRows >= N) {
            return s;
        }


        char[] ans = new char[N];

        int fill = 0;
        int time = 2 * numRows - 2;
        char[] chars = s.toCharArray();

        for (int h = 0; h < numRows; h++) {

            if (h == 0 || h == numRows - 1) {
                for (int j = h; j < N; j += time) {
                    ans[fill++] = chars[j];
                }
                continue;
            }

            for (int j = h, nextLTop = time; j < N; j += time, nextLTop += time) {
                ans[fill++] = chars[j];
                if (nextLTop - h < N) {
                    ans[fill++] = chars[nextLTop - h];
                }
            }
        }

        return String.valueOf(ans);
    }

//    public String convert(String s, int numRows) {
//        if (numRows < 3) {
//            return s;
//        }
//
//        int n = s.length();
//        int sections = (int) Math.ceil(n / (2 * numRows - 2.0));
//        int numCols = sections * (numRows - 1);
//
//        char[][] matrix = new char[numRows][numCols];
//        for (char[] row : matrix) {
//            Arrays.fill(row, ' ');
//        }
//
//        int currRow = 0, currCol = 0;
//        int currStringIndex = 0;
//
//        // Iterate in zigzag pattern on matrix and fill it with string characters.
//        while (currStringIndex < n) {
//            // Move down.
//            while (currRow < numRows && currStringIndex < n) {
//                matrix[currRow][currCol] = s.charAt(currStringIndex);
//                currRow++;
//                currStringIndex++;
//            }
//
//            currRow -= 2;
//            currCol++;
//
//            // Move up (with moving right also).
//            while (currRow > 0 && currCol < numCols && currStringIndex < n) {
//                matrix[currRow][currCol] = s.charAt(currStringIndex);
//                currRow--;
//                currCol++;
//                currStringIndex++;
//            }
//        }
//
//        StringBuilder answer = new StringBuilder();
//        for (char[] row : matrix) {
//            for (char character : row) {
//                if (character != ' ') {
//                    answer.append(character);
//                }
//            }
//        }
//
//        return answer.toString();
//    }


    public String converts(String s, int numRows) {
        int n = s.length();
        if (numRows == 1 || n <= numRows) {
            return s;
        }

        int sections = (int) Math.ceil(n / (2 * numRows - 2.0));
        int numCols = sections * (numRows - 1);
        int currRow = 0, currCol = 0;
        int currStringIndex = 0;

        char[] matrix = new char[n];

        // Iterate in zigzag pattern on matrix and fill it with string characters.
        while (currStringIndex < n) {
            // Move down.
            while (currRow < numRows && currStringIndex < n) {
                matrix[currRow + currCol] = s.charAt(currStringIndex);
                currRow++;
                currStringIndex++;
            }

            currRow -= 2;
            currCol++;

            // Move up (with moving right also).
            while (currRow > 0 && currCol < numCols && currStringIndex < n) {
                matrix[currRow + currCol] = s.charAt(currStringIndex);
                currRow--;
                currCol++;
                currStringIndex++;
            }
        }

        return String.valueOf(matrix);
    }
}
