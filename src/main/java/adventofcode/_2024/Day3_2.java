package adventofcode._2024;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day3_2 {

    static long sum = 0;
    static boolean isMulEnabled = true;

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
        Matcher matcher = Pattern.compile("mul\\((-?\\d+),(-?\\d+)\\)|do\\(\\)|don't\\(\\)").matcher(text);
        while (matcher.find()) {
            String match = matcher.group();

            if (match.equals("do()")) {
                isMulEnabled = true; // Enable mul instructions
            } else if (match.equals("don't()")) {
                isMulEnabled = false; // Disable mul instructions
            } else if (match.startsWith("mul") && isMulEnabled) {
                sum += Long.parseLong(matcher.group(1)) * Long.parseLong(matcher.group(2));
            }
        }
    }
}
