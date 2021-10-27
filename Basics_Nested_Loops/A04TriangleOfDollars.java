package ProgrammingBasics.Basics_Nested_Loops;

import java.util.Scanner;

public class A04TriangleOfDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String symbol = "$";

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}
