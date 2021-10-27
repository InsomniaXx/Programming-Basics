package ProgrammingBasics.Basics_Conditional_Statements;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countDays = Integer.parseInt(scanner.nextLine());
        int leftKgFood = Integer.parseInt(scanner.nextLine());
        double dogKgFoodPerDay = Double.parseDouble(scanner.nextLine());
        double catKgFoodPerDay = Double.parseDouble(scanner.nextLine());
        double turtleFoodPerDay = Double.parseDouble(scanner.nextLine());
        double turtleKgFoodPerDay = turtleFoodPerDay * 0.001;

        double currentFood = countDays * (dogKgFoodPerDay + catKgFoodPerDay + turtleKgFoodPerDay);

        if (leftKgFood >= currentFood) {
            System.out.printf("%.0f kilos of food left.", Math.floor(Math.abs((currentFood - leftKgFood))));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(Math.abs((leftKgFood - currentFood))));
        }
    }
}
