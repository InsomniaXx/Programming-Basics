package ProgrammingBasics.Basics_For_Loop;

import java.util.Scanner;

public class E05DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double countP1 = 0;
        double countP2 = 0;
        double countP3 = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number % 2 == 0) {
                countP1++;
            }
            if (number % 3 == 0) {
                countP2++;
            }
            if (number % 4 == 0) {
                countP3++;
            }
        }

        double percentageP1 = countP1 / n * 100;
        double percentageP2 = countP2 / n * 100;
        double percentageP3 = countP3 / n * 100;

        System.out.printf("%.2f%%%n", percentageP1);
        System.out.printf("%.2f%%%n", percentageP2);
        System.out.printf("%.2f%%%n", percentageP3);
    }
}
