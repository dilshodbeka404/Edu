package adventofcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(">>>>>>>>>>>>>>>> Start file read");
        Scanner scan = new Scanner(new File("src/main/resources/input.txt"));

        int count = 0;
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            String[] nums = line.split(" ");
            System.out.println(Arrays.stream(nums).toList());
            if (isSafeReport(nums)) count++;
        }
        System.out.println("count = " + count);
    }

    public static boolean isSafeReport(String[] report) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < report.length; i++) {
            int diff = Integer.parseInt(report[i]) - Integer.parseInt(report[i - 1]);
            if (diff < 1 || diff > 3) return false;

            if (diff > 0) {
                decreasing = false;
            } else if (diff < 0) {
                increasing = false;
            }
        }
        return increasing || decreasing;
    }
}
