package number;

import java.util.Scanner;

/**
 * @author Dilshodbek Akhmedov, Wed 16:28. 17/08/22
 */
public class MaxCombinations {
    public static final Scanner SCANNER_NUM = new Scanner(System.in);

    public static Integer getNum() {
        return SCANNER_NUM.nextInt();
    }

    //20, 10, 5
    public static void main(String[] args) {
        int count = 0;
        int num = getNum();
        for (int i = 0; i <= num / 20; i++) {
            for (int j = 0; j <= num / 10; j++) {
                for (int k = 0; k <= num / 5; k++) {
                    if (i * 20 + j * 10 + k * 5 == num) count++;
                }
            }
        }

        System.out.println("count = " + count);
        main(new String[]{"", ""});
    }
}
