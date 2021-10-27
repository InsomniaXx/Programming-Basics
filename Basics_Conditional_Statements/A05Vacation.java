package ProgrammingBasics.Basics_Conditional_Statements;

import java.util.Scanner;

public class A05Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String settleType = "";
        String settlePlace = "";
        double settleBudget = 0;

        if (budget <= 1000) {
            settleType = "Camp";
            switch (season) {
                case "Summer":
                    settlePlace = "Alaska";
                    settleBudget = budget * 0.65;
                    break;
                case "Winter":
                    settlePlace = "Morocco";
                    settleBudget = budget * 0.45;
                    break;
                default:
                    break;
            }
        } else if (budget > 1000 && budget <= 3000) {
            settleType = "Hut";
            switch (season) {
                case "Summer":
                    settlePlace = "Alaska";
                    settleBudget = budget * 0.80;
                    break;
                case "Winter":
                    settlePlace = "Morocco";
                    settleBudget = budget * 0.60;
                    break;
                default:
                    break;
            }
        } else if (budget > 3000) {
            settleType = "Hotel";
            settleBudget = budget * 0.90;
            switch (season) {
                case "Summer":
                    settlePlace = "Alaska";
                    break;
                case "Winter":
                    settlePlace = "Morocco";
                    break;
                default:
                    break;
            }
        }

        System.out.printf("%s - %s - %.2f", settlePlace, settleType, Math.floor(settleBudget * 100000) / 100000.0);
    }
}
