package ProgrammingBasics.Basics_Nested_Loops;

import java.util.Scanner;

public class A01RectangleOf10x10Stars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        String sign = "*";

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                counter++;
                System.out.print(sign);
            }
            System.out.println();
        }
    }
}
