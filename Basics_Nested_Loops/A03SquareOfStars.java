package ProgrammingBasics.Basics_Nested_Loops;

import java.util.Scanner;

public class A03SquareOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String sign = "*";

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(sign + " ");
            }
            System.out.println();
        }
    }
}
