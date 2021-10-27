package ProgrammingBasics.Basics_For_Loop;

import java.util.Scanner;

public class L04EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int currentNum = 2;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.println(1);
            }
            if (i % 2 == 0) {
                System.out.printf("%.0f \n", Math.pow(currentNum, i));
            }

        }

    }
}
