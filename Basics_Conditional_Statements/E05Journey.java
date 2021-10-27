package ProgrammingBasics.Basics_Conditional_Statements;

import java.util.Scanner;

public class E05Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        double price = 0;
        String destinationPlace = "";

        if (budget >= 0 && budget <= 100) {
            destination = "Bulgaria";
            switch (season) {
                case "summer":
                    price = budget * 0.30;
                    break;
                case "winter":
                    price = budget * 0.70;
                    break;
                default:
                    break;
            }
        } else if (budget > 100 && budget <= 1000) {
            destination = "Balkans";
            switch (season) {
                case "summer":
                    price = budget * 0.40;
                    break;
                case "winter":
                    price = budget * 0.80;
                    break;
                default:
                    break;
            }
        } else if (budget > 1000) {
            destination = "Europe";
            price = budget * 0.90;
        }

        if (season.equals("summer") && !destination.equals("Europe")) {
            destinationPlace = "Camp";
        } else if (season.equals("winter")) {
            destinationPlace = "Hotel";
        } else if (destination.equals("Europe")) {
            destinationPlace = "Hotel";
        }

        if (price > 0) {
            System.out.printf("Somewhere in %s \n", destination);
            System.out.printf("%s - %.2f \n", destinationPlace, price);
        }
    }
}
