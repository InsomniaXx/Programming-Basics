package ProgrammingBasics.Basics_Conditional_Statements;

import java.util.Scanner;

public class A10MultiplyBy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextFloat();

        while (number >= 0) {
            System.out.printf("Result: %.2f \n", number * 2);
            number = scanner.nextFloat();
        }

        System.out.println("Negative number!");
    }
}
