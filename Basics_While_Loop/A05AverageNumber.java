package ProgrammingBasics.Basics_While_Loop;

import java.util.Scanner;

public class A05AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        double sum = 0;
        double average = 0;

        while (counter < n) {
            int number = Integer.parseInt(scanner.nextLine());
            counter++;
            sum += number;
        }
        average = sum / counter;

        System.out.printf("%.2f", average);

    }
}
