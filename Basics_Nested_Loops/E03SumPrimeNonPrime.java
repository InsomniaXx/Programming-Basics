package ProgrammingBasics.Basics_Nested_Loops;

import java.util.Scanner;

public class E03SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int countPrimeSum = 0;
        int countNonPrimeSum = 0;


        while (!input.equals("stop")) {
            boolean isPrime = true;
            int number = Integer.parseInt(input);
            if (number < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    countNonPrimeSum += number;
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                countPrimeSum += number;
            }

            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", countPrimeSum);
        System.out.printf("Sum of all non prime numbers is: %d", countNonPrimeSum);
    }
}
