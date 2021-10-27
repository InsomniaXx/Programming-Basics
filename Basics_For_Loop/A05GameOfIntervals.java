package ProgrammingBasics.Basics_For_Loop;

import java.util.Scanner;

public class A05GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double sumPoints = 0;

        double countTill9 = 0;
        double countTill19 = 0;
        double countTill29 = 0;
        double countTill39 = 0;
        double countTill50 = 0;
        double countInvalidNumbers = 0;

        for (int i = 1; i <= n; i++) {
            int nextNumber = Integer.parseInt(scanner.nextLine());

            if (nextNumber >= 0 && nextNumber <= 9) {
                sumPoints = sumPoints + nextNumber * 0.20;
                countTill9++;
            } else if (nextNumber >= 10 && nextNumber <= 19) {
                sumPoints = sumPoints + nextNumber * 0.30;
                countTill19++;
            } else if (nextNumber >= 20 && nextNumber <= 29) {
                sumPoints = sumPoints + nextNumber * 0.40;
                countTill29++;
            } else if (nextNumber >= 30 && nextNumber <= 39) {
                sumPoints = sumPoints + 50;
                countTill39++;
            } else if (nextNumber >= 40 && nextNumber <= 50) {
                sumPoints = sumPoints + 100;
                countTill50++;
            } else {
                sumPoints = sumPoints / 2.0;
                countInvalidNumbers++;
            }
        }

        System.out.printf("%.2f%n", sumPoints);
        System.out.printf("From 0 to 9: %.2f%%%n", countTill9 / n * 100);
        System.out.printf("From 10 to 19: %.2f%%%n", countTill19 / n * 100);
        System.out.printf("From 20 to 29: %.2f%%%n", countTill29 / n * 100);
        System.out.printf("From 30 to 39: %.2f%%%n", countTill39 / n * 100);
        System.out.printf("From 40 to 50: %.2f%%%n", countTill50 / n * 100);
        System.out.printf("Invalid numbers: %.2f%%%n", countInvalidNumbers / n * 100);
    }
}
