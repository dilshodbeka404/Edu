package leetcode;

public class Solution1491 {
    public double average(int[] salary) {
        int max = salary[0];
        int min = salary[0];
        double sum = 0;
        for (int i : salary) {
            if (i > max) {
                max = i;
            } else if (min > i) {
                min = i;
            }
            sum += i;
        }
        return (sum - max - min) / (salary.length - 2);
    }
}
