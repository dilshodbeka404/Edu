package adventofcode._2024;

import java.io.File;
import java.util.*;

public class Day10_1 {

    static List<String> map = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(">>>>>>>>>>>>>>>> Start file read DAY 10 ");
        try (Scanner scan = new Scanner(new File("src/main/resources/input.txt"))) {
            while (scan.hasNextLine()) {
                map.add(scan.nextLine());
            }
            int score = calculateTotalTrailheadScore(map);
            System.out.println("score = " + score);
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }

    public static int calculateTotalTrailheadScore(List<String> map) {
        int rows = map.size();
        int cols = map.get(0).length();
        int totalScore = 0;

        // Iterate over all positions in the map
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                // If the current position is a trailhead (height 0)
                if (map.get(r).charAt(c) == '0') {
                    totalScore += calculateTrailheadScore(map, r, c);
                }
            }
        }

        return totalScore;
    }

    private static int calculateTrailheadScore(List<String> map, int startRow, int startCol) {
        int rows = map.size();
        int cols = map.get(0).length();
        int score = 0;

        // Track visited positions to avoid revisiting
        boolean[][] visited = new boolean[rows][cols];

        // BFS to explore hiking trails
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startRow, startCol});

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int r = current[0];
            int c = current[1];

            // Skip if out of bounds or already visited
            if (r < 0 || r >= rows || c < 0 || c >= cols || visited[r][c]) {
                continue;
            }

            visited[r][c] = true;

            // Get the current height
            int currentHeight = map.get(r).charAt(c) - '0';

            // If we reach a height of 9, increment the score
            if (currentHeight == 9) {
                score++;
                continue; // No further exploration needed from height 9
            }

            // Explore neighbors if they have the next height
            int nextHeight = currentHeight + 1;
            for (int[] direction : new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}}) {
                int newRow = r + direction[0];
                int newCol = c + direction[1];
                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols &&
                    !visited[newRow][newCol] &&
                    map.get(newRow).charAt(newCol) - '0' == nextHeight) {
                    queue.add(new int[]{newRow, newCol});
                }
            }
        }

        return score;
    }
}
