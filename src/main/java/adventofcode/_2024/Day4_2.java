package adventofcode._2024;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day4_2 {
    public static void main(String[] args) {
        System.out.println(">>>>>>>>>>>>>>>> Start file read");
        try (Scanner scan = new Scanner(new File("src/main/resources/input.txt"))) {
            List<String> grid = new ArrayList<>();
            while (scan.hasNextLine()) {
                grid.add(scan.nextLine());
            }
            int result = findXMas(grid);
            System.out.println("XMAS so‘zi umumiy: " + result + " marta uchradi.");
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }

    public static int findXMas(List<String> grid) {
        int count = 0;
        int rows = grid.size();
        int cols = grid.get(0).length();

        // Har bir markazni tekshiramiz
        for (int i = 1; i < rows - 1; i++) {
            for (int j = 1; j < cols - 1; j++) {
                // Markaziy harf "A" bo‘lsa, tekshiramiz
                if (grid.get(i).charAt(j) == 'A') {
                    if (isXMas(grid, i, j)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private static boolean isXMas(List<String> grid, int row, int col) {
        int rows = grid.size();
        int cols = grid.get(0).length();

        // Diagonal 1: yuqori chap -> pastki o‘ng
        boolean diagonal1 = checkMAS(grid, row - 1, col - 1, row + 1, col + 1);

        // Diagonal 2: yuqori o‘ng -> pastki chap
        boolean diagonal2 = checkMAS(grid, row - 1, col + 1, row + 1, col - 1);

        return diagonal1 && diagonal2;
    }

    private static boolean checkMAS(List<String> grid, int startRow, int startCol, int endRow, int endCol) {
        int rows = grid.size();
        int cols = grid.get(0).length();

        // Tekshiruv: chegaradan chiqmaganini aniqlash
        if (startRow < 0 || startCol < 0 || endRow >= rows || endCol >= cols) {
            return false;
        }

        // Yuqori harf "M", pastki harf "S" bo‘lishi kerak
        char startChar = grid.get(startRow).charAt(startCol);
        char endChar = grid.get(endRow).charAt(endCol);
        return (startChar == 'M' && endChar == 'S') || (startChar == 'S' && endChar == 'M');
    }
}
