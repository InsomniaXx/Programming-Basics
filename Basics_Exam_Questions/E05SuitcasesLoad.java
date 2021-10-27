package ProgrammingBasics.Basics_Exam_Questions;

import java.util.Scanner;

public class E05SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capacity = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();

        boolean isFull = false;
        int countBaggage = 0;

        while (!input.equals("End")) {
            double volumeBaggage = Double.parseDouble(input);
            countBaggage++;

            if (countBaggage % 3 == 0) {
                capacity -= volumeBaggage + volumeBaggage * 0.1;
            } else {
                capacity -= volumeBaggage;
            }
            if (capacity < 0) {
                isFull = true;
                System.out.println("No more space!");
                countBaggage--;
                break;
            }
            input = scanner.nextLine();
        }

        if (!isFull) {
            System.out.println("Congratulations! All suitcases are loaded!");
        }
        System.out.printf("Statistic: %d suitcases loaded.", countBaggage);
    }
}
