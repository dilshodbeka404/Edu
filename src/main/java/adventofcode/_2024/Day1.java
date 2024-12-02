package adventofcode._2024;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day1 {

    static List<Integer> line1 = new ArrayList<>();
    static List<Integer> line2 = new ArrayList<>();

    public static void fileReader() {
        System.out.println(">>>>>>>>>>>>>>>> Start file read");
        try (Scanner scan = new Scanner(new File("src/main/resources/input.txt"))) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] nums = line.split(" {3}");
                line1.add(Integer.valueOf(nums[0]));
                line2.add(Integer.valueOf(nums[1]));
            }
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        fileReader();

        System.out.println(">>>>>>>>>>>>>>>> Start sort");
        line1.sort(Integer::compareTo);
        line2.sort(Integer::compareTo);

        System.out.println(">>>>>>>>>>>>>>>> Start result calculate");
        int result = 0;
        for (int i = 0; i < line2.size(); i++) {
            result += Math.abs(line2.get(i) - line1.get(i));
        }

        System.out.println("result = " + result);
    }
}
