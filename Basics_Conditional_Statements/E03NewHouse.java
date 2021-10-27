package ProgrammingBasics.Basics_Conditional_Statements;

import java.util.Scanner;

public class E03NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowerType = scanner.nextLine();
        int flowerCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double flowerPrice = 0;

        switch (flowerType) {
            case "Roses":
                flowerPrice = 5;
                break;
            case "Dahlias":
                flowerPrice = 3.80;
                break;
            case "Tulips":
                flowerPrice = 2.80;
                break;
            case "Narcissus":
                flowerPrice = 3;
                break;
            case "Gladiolus":
                flowerPrice = 2.50;
                break;
            default:
                break;

        }

        double finalPrice = flowerCount * flowerPrice;

        if (flowerType.equals("Roses") && flowerCount > 80) {
            finalPrice = finalPrice - finalPrice * 0.10;
        } else if (flowerType.equals("Dahlias") && flowerCount > 90) {
            finalPrice = finalPrice - finalPrice * 0.15;
        } else if (flowerType.equals("Tulips") && flowerCount > 80) {
            finalPrice = finalPrice - finalPrice * 0.15;
        } else if (flowerType.equals("Narcissus") && flowerCount < 120) {
            finalPrice = finalPrice + finalPrice * 0.15;
        } else if (flowerType.equals("Gladiolus") && flowerCount < 80) {
            finalPrice = finalPrice + finalPrice * 0.20;
        }

        double moneyLeft = Math.abs(budget - finalPrice);

        if (finalPrice > 0) {
            if (budget >= finalPrice) {
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, moneyLeft);
            } else {
                System.out.printf("Not enough money, you need %.2f leva more.", moneyLeft);
            }
        }
    }
}
