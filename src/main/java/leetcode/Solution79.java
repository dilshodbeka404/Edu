package leetcode;

public class Solution79 {

    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        if (m * n < word.length()) return false;

        char[] wordChars = word.toCharArray();
        int[] boarDF = new int[128];

        for (char[] chars : board) {
            for (int j = 0; j < n; ++j) {
                ++boarDF[chars[j]];
            }
        }

        for (char ch : wordChars) {
            if (--boarDF[ch] < 0) {
                return false;
            }
        }

        if (boarDF[wordChars[0]] > boarDF[wordChars[wordChars.length - 1]]) reverse(wordChars);

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (wordChars[0] == board[i][j] && search(board, i, j, wordChars, new boolean[m][n], 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private void reverse(char[] word) {
        int n = word.length;
        for (int i = 0; i < n / 2; ++i) {
            char temp = word[i];
            word[i] = word[n - i - 1];
            word[n - i - 1] = temp;
        }
    }

    private static final int[] dirs = {0, -1, 0, 1, 0};

    private boolean search(char[][] board, int row, int col, char[] word, boolean[][] visited, int index) {
        if (index == word.length) return true;

        if (row < 0 || col < 0 || row == board.length || col == board[0].length || board[row][col] != word[index] || visited[row][col]) {
            return false;
        }

        visited[row][col] = true;

        for (int i = 0; i < 4; ++i) {
            if (search(board, row + dirs[i], col + dirs[i + 1], word, visited, index + 1)) {
                return true;
            }
        }
        visited[row][col] = false;
        return false;
    }
}