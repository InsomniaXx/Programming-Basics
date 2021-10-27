package ProgrammingBasics.Basics_Nested_Loops;

import java.util.Scanner;

public class L04SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int count = 0;
        boolean flag = false;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                count++;
                int result = i + j;
                if (magicNumber == result) {
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", count, i, j, result);
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }

        if (!flag) {
            System.out.printf("%d combinations - neither equals %d", count, magicNumber);
        }
    }
}
