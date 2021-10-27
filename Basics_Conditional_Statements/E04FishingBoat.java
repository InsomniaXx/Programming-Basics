package ProgrammingBasics.Basics_Conditional_Statements;

import java.util.Scanner;

public class E04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fisherCount = Integer.parseInt(scanner.nextLine());

        double rentPrice = 0;

        switch (season) {
            case "Spring":
                rentPrice = 3000;
                break;
            case "Summer":
            case "Autumn":
                rentPrice = 4200;
                break;
            case "Winter":
                rentPrice = 2600;
            default:
                break;
        }

        if (fisherCount >= 0 && fisherCount <= 6) {
            rentPrice = rentPrice - rentPrice * 0.10;
        } else if (fisherCount >= 7 && fisherCount <= 11) {
            rentPrice = rentPrice - rentPrice * 0.15;
        } else if (fisherCount > 12) {
            rentPrice = rentPrice - rentPrice * 0.25;
        }

        if (fisherCount % 2 == 0 && !season.equals("Autumn")) {
            rentPrice = rentPrice - rentPrice * 0.05;
        }

        double moneyLeft = Math.abs(budget - rentPrice);

        if (budget >= rentPrice) {
            System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", moneyLeft);
        }
    }
}
