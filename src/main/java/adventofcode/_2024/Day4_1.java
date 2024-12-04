package adventofcode._2024;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day4_1 {
    public static void main(String[] args) {
        System.out.println(">>>>>>>>>>>>>>>> Start file read");
        try (Scanner scan = new Scanner(new File("src/main/resources/input.txt"))) {
            List<String> grid = new ArrayList<>();
            while (scan.hasNextLine()) {
                grid.add(scan.nextLine());
            }
            int result = findXmas(grid);
            System.out.println("XMAS so‘zi umumiy: " + result + " marta uchradi.");
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }

    // Yo‘nalishlar: {qator o‘zgarishi, ustun o‘zgarishi}
    private static final int[][] DIRECTIONS = {
            {0, 1},  // O‘ngga
            {0, -1}, // Chapga
            {1, 0},  // Pastga
            {-1, 0}, // Yuqoriga
            {1, 1},  // Pastga diagonal (chap-ustdan o‘ng-pastga)
            {-1, -1}, // Yuqoriga diagonal (o‘ng-pastdan chap-ustga)
            {1, -1}, // Pastga diagonal (o‘ng-ustdan chap-pastga)
            {-1, 1}  // Yuqoriga diagonal (chap-pastdan o‘ng-ustga)
    };

    public static int findXmas(List<String> grid) {
        int count = 0;
        int rows = grid.size();
        int cols = grid.get(0).length();
        String target = "XMAS";

        // Har bir hujayrani tekshirish
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Agar "X" bo‘lsa, barcha yo‘nalishlarda qidiramiz
                for (int[] direction : DIRECTIONS) {
                    if (findWord(grid, i, j, direction, target)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private static boolean findWord(List<String> grid, int row, int col, int[] direction, String target) {
        int rows = grid.size();
        int cols = grid.get(0).length();

        for (int k = 0; k < target.length(); k++) {
            int newRow = row + k * direction[0];
            int newCol = col + k * direction[1];

            // Tashqariga chiqib ketmaslik va mos kelishini tekshirish
            if (newRow < 0 || newRow >= rows || newCol < 0 || newCol >= cols || grid.get(newRow).charAt(newCol) != target.charAt(k)) {
                return false;
            }
        }
        return true;
    }
}
