package ProgrammingBasics.Basics_Nested_Loops;

import java.util.Scanner;

public class A06RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.printf(" ");
            }
            System.out.printf("*");
            for (int j = 1; j <= i - 1; j++) {
                System.out.printf(" *");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = n - i; j >= 1; j--) {
                System.out.printf(" ");
            }
            System.out.printf("*");
            for (int j = i - 1; j >= 1; j--) {
                System.out.printf(" *");
            }
            System.out.println();
        }
        System.out.println();
    }
}
