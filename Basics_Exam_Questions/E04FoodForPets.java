package ProgrammingBasics.Basics_Exam_Questions;

import java.util.Scanner;

public class E04FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double totalFoodQuantity = Double.parseDouble(scanner.nextLine());

        double dogFoodQuantity = 0;
        double catFoodQuantity = 0;
        double quantityBiscuits = 0;

        for (int i = 1; i <= days; i++) {
            int dogFood = Integer.parseInt(scanner.nextLine());
            int catFood = Integer.parseInt(scanner.nextLine());

            if (i % 3 == 0) {
                quantityBiscuits += (dogFood + catFood) * 0.1;
            }
            dogFoodQuantity += dogFood;
            catFoodQuantity += catFood;

        }
        double totalEaten = (dogFoodQuantity + catFoodQuantity) / totalFoodQuantity;
        double dogFoodEaten = dogFoodQuantity / (dogFoodQuantity + catFoodQuantity);
        double catFoodEaten = catFoodQuantity / (dogFoodQuantity + catFoodQuantity);

        System.out.printf("Total eaten biscuits: %.0fgr.%n", quantityBiscuits);
        System.out.printf("%.2f%% of the food has been eaten.%n", totalEaten * 100);
        System.out.printf("%.2f%% eaten from the dog.%n", dogFoodEaten * 100);
        System.out.printf("%.2f%% eaten from the cat.%n", catFoodEaten * 100);
    }
}
