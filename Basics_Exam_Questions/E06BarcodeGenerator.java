package ProgrammingBasics.Basics_Exam_Questions;

import java.util.Scanner;

public class E06BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        int digit1_first = (firstNumber / 1000) % 10;
        int digit2_first = (firstNumber / 100) % 10;
        int digit3_first = (firstNumber / 10) % 10;
        int digit4_first = (firstNumber / 1) % 10;

        int digit1_second = (secondNumber / 1000) % 10;
        int digit2_second = (secondNumber / 100) % 10;
        int digit3_second = (secondNumber / 10) % 10;
        int digit4_second = (secondNumber / 1) % 10;

        for (int i = digit1_first; i <= digit1_second; i++) {
            for (int j = digit2_first; j <= digit2_second; j++) {
                for (int k = digit3_first; k <= digit3_second; k++) {
                    for (int l = digit4_first; l <= digit4_second; l++) {
                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }
    }
}
