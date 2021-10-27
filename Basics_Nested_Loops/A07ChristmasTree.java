package ProgrammingBasics.Basics_Nested_Loops;

import java.util.Scanner;

public class A07ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        System.out.printf(" |%n");
        for (int i = 0; i < n; i++) {
            System.out.printf("*");
            for (int j = 0; i <= j - i; i++) {
                System.out.printf("|");
            }
        }

        System.out.println();


    }
}
