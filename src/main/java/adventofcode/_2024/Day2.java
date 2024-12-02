package adventofcode._2024;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(">>>>>>>>>>>>>>>> Start file read");
        try (Scanner scan = new Scanner(new File("src/main/resources/input.txt"))) {
            int count = 0;
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] nums = line.split(" ");
                System.out.println(Arrays.stream(nums).toList());
                if (isSafeReport(nums)) count++;
            }
            System.out.println("count = " + count);
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }

    public static boolean isSafeReport(String[] report) {
        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int i = 1; i < report.length; i++) {
            int diff = Integer.parseInt(report[i]) - Integer.parseInt(report[i - 1]);

            if (Math.abs(diff) < 1 || Math.abs(diff) > 3) {
                return false;
            }

            // Check increasing or decreasing
            if (diff > 0) {
                isDecreasing = false; // Can't be decreasing if it increases
            } else if (diff < 0) {
                isIncreasing = false; // Can't be increasing if it decreases
            }
        }
        return isIncreasing || isDecreasing;
    }
}
