package ProgrammingBasics.Basics_For_Loop;

import java.util.Scanner;

public class E03OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double minOddNumber = Double.POSITIVE_INFINITY;
        double maxOddNumber = Double.NEGATIVE_INFINITY;
        double oddSum = 0;
        double minEvenNumber = Double.POSITIVE_INFINITY;
        double maxEvenNumber = Double.NEGATIVE_INFINITY;
        double evenSum = 0;

        for (int i = 1; i <= n; i++) {
            double number = Double.parseDouble(scanner.nextLine());
            if (i % 2 == 0) {
                evenSum += number;
                if (number <= minEvenNumber) {
                    minEvenNumber = number;
                }
                if (number >= maxEvenNumber) {
                    maxEvenNumber = number;
                }
            } else {
                oddSum += number;
                if (number <= minOddNumber) {
                    minOddNumber = number;
                }
                if (number >= maxOddNumber) {
                    maxOddNumber = number;
                }
            }
        }

        System.out.printf("OddSum=%.2f,%n", oddSum);
        if (n > 0) {
            System.out.printf("OddMin=%.2f,%n", minOddNumber);
            System.out.printf("OddMax=%.2f,%n", maxOddNumber);
        } else {
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No,");
        }
        System.out.printf("EvenSum=%.2f,%n", evenSum);
        if (n > 1) {
            System.out.printf("EvenMin=%.2f,%n", minEvenNumber);
            System.out.printf("EvenMax=%.2f%n", maxEvenNumber);
        } else {
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        }
    }
}
