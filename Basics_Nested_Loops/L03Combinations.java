package ProgrammingBasics.Basics_Nested_Loops;

import java.util.Scanner;

public class L03Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int count = 0;
        boolean flag = false;

        for (int i = 0; i <= number; i++) {
            for (int j = 0; j <= number; j++) {
                for (int k = 0; k <= number; k++) {
                    int result = i + j + k;
                    if (result == number) {
                        count++;
                    }
                }
            }
        }
        System.out.printf("%d", count);
    }
}
