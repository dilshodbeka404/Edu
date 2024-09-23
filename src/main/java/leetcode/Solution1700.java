package leetcode;

public class Solution1700 {

    public static void main(String[] args) {
        countStudents(new int[]{1, 1, 0, 0}, new int[]{0, 1, 0, 1});
    }

    static int sandwichIndex = 0;

    public static int countStudents(int[] students, int[] sandwiches) {
        check(students, sandwiches, 0);
        return sandwiches.length - sandwichIndex;
    }

    private static void check(int[] students, int[] sandwiches, int index) {
        if (index != students.length) {
            for (int i = 0; i < students.length; i++) {
                if (sandwichIndex <= sandwiches.length && students[i] == sandwiches[sandwichIndex]) {
                    students[i] = 2;
                    sandwichIndex++;
                }
            }
            check(students, sandwiches, index + 1);
        }
    }

    public int countStudents2(int[] students, int[] sandwiches) {
        int[] count = new int[2];
        for (int student : students) {
            count[student]++;
        }
        for (int sandwich : sandwiches) {
            if (count[sandwich] == 0) {
                break;
            }
            count[sandwich]--;
        }
        return count[0] + count[1];
    }
}
