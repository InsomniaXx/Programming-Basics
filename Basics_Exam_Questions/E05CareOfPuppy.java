package ProgrammingBasics.Basics_Exam_Questions;

import java.util.Scanner;

public class E05CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countFoodKg = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int countCurrentFood = 0;
        boolean isEnough = false;

        while (!input.equals("Adopted")) {
            int food = Integer.parseInt(input);
            countCurrentFood += food;

            input = scanner.nextLine();
        }

        if (countFoodKg * 1000 >= countCurrentFood) {
            System.out.printf("Food is enough! Leftovers: %d grams.", countFoodKg * 1000 - countCurrentFood);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", Math.abs(countCurrentFood - countFoodKg * 1000));
        }

    }
}
