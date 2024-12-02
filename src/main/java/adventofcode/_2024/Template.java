package adventofcode._2024;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Template {
    public static void main(String[] args) {
        System.out.println(">>>>>>>>>>>>>>>> Start file read");
        try (Scanner scan = new Scanner(new File("src/main/resources/input.txt"))) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                List<Integer> nums = Arrays.stream(line.split(" ")).map(Integer::parseInt).toList();
                System.out.println(nums);


            }
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }
}
