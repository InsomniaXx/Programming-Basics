package ProgrammingBasics.Basics_Conditional_Statements;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        boolean isHigher = a > b;

        if (isHigher) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
