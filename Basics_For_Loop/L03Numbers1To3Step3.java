package ProgrammingBasics.Basics_For_Loop;

import java.util.Scanner;

public class L03Numbers1To3Step3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i += 3) {
            System.out.println(i);
        }
    }
}
