package adventofcode._2024;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day3_1 {

    static long sum = 0;

    public static void main(String[] args) {
        System.out.println(">>>>>>>>>>>>>>>> Start file read");
        try (Scanner scan = new Scanner(new File("src/main/resources/input.txt"))) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                findMul(line);
            }
            System.out.println("sum = " + sum);
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }

    static void findMul(String text) {
        Matcher matcher = Pattern.compile("mul\\((-?\\d+),(-?\\d+)\\)").matcher(text);
        while (matcher.find()) {
            sum += Long.parseLong(matcher.group(1)) * Long.parseLong(matcher.group(2));
        }
    }
}
