package ProgrammingBasics.Basics_Nested_Loops;

import java.util.Scanner;

public class E02EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        for (int i = firstNumber; i <= secondNumber; i++) {
            //10001 % 10 = 1
            // 100001 / 10 = 10000
            int evenSum = 0;
            int oddSum = 0;
            int currentNumber = i;
            for (int position = 6; position >= 1; position--) {
                //Взимам последната цифра
                int digit = currentNumber % 10;
                //Премахвам последната цифра
                currentNumber /= 10;
                if (position % 2 == 0) {
                    evenSum += digit;
                } else {
                    oddSum += digit;
                }
            }
            //Проверка дали сумите на четни и нечетни позиции са равни
            if (evenSum == oddSum) {
                System.out.print(i + " ");
            }
        }

    }
}
