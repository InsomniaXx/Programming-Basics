package ProgrammingBasics.Basics_Nested_Loops;

import java.util.Scanner;

public class E04TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int counter = 0;
        double finalSum = 0;

        while (!input.equals("Finish")) {
            double sum = 0;
            double averageSum = 0;
            counter++;
            for (int i = 1; i <= n; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                sum += grade;
            }
            averageSum += sum / n;
            finalSum += averageSum;
            System.out.printf("%s - %.2f.%n", input, averageSum);
            input = scanner.nextLine();
        }
        System.out.printf("OOP.Abstraction.L03StudentSystem.Student's final assessment is %.2f.", finalSum / counter);

    }
}
