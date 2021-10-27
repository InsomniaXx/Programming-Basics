package ProgrammingBasics.Basics_Exam_Questions;

import java.util.Scanner;

public class E02CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutesPerDay = Integer.parseInt(scanner.nextLine());
        int countWalking = Integer.parseInt(scanner.nextLine());
        double caloriesPerDay = Double.parseDouble(scanner.nextLine());

        double caloriesDecrease = countWalking * minutesPerDay * 5;
        double enoughCalories = caloriesPerDay - caloriesPerDay * 0.5;

        if (caloriesDecrease >= enoughCalories) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %.0f.", caloriesDecrease);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %.0f.", caloriesDecrease);
        }
    }
}
