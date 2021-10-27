package ProgrammingBasics.Basics_Nested_Loops;

import java.util.Scanner;

public class A05SquareFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String signPlus = "+";
        String signMinus = "-";
        String signDash = "|";

        System.out.printf("%s ", signPlus);
        for (int k = 1; k <= n - 2; k++) {
            System.out.printf("%s ", signMinus);
        }
        System.out.printf("%s ", signPlus);
        System.out.println();

        for (int i = 1; i <= n - 2; i++) {
            System.out.printf("%s ", signDash);

            for (int j = 1; j <= n - 2; j++) {
                System.out.printf("%s ", signMinus);
            }
            System.out.printf("%s ", signDash);
            System.out.println();
        }

        System.out.printf("%s ", signPlus);
        for (int k = 1; k <= n - 2; k++) {
            System.out.printf("%s ", signMinus);
        }
        System.out.printf("%s ", signPlus);
        System.out.println();

    }
}
