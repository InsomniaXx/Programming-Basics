package ProgrammingBasics.Basics_Conditional_Statements;

import java.util.Scanner;

public class E06OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNumber = Integer.parseInt(scanner.nextLine());
        double secondNumber = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        double result = 0;
        String evenOdd = "";

        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
            case "%":
                result = firstNumber % secondNumber;
                break;
            default:
                break;
        }

        if (operator.equals("+") || operator.equals("-") || operator.equals("*")) {
            if (result % 2 == 0) {
                evenOdd = "even";
            } else {
                evenOdd = "odd";
            }
            System.out.printf("%.0f %s %.0f = %.0f - %s", firstNumber, operator, secondNumber, result, evenOdd);
        }
        if (secondNumber != 0) {
            if (operator.equals("/")) {
                System.out.printf("%.0f / %.0f = %.2f", firstNumber, secondNumber, result);
            } else if (operator.equals("%")) {
                System.out.printf("%.0f %% %.0f = %.0f", firstNumber, secondNumber, result);
            }
        } else {
            System.out.printf("Cannot divide %.0f by zero", firstNumber);
        }
    }
}
