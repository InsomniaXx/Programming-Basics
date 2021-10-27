package ProgrammingBasics.Basics_Conditional_Statements;

import java.util.Scanner;

public class A06TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kmPerMonth = Double.parseDouble(scanner.nextLine());

        double pricePerMonth = 0;

        if (kmPerMonth <= 5000) {
            switch (season) {
                case "Spring":
                case "Autumn":
                    pricePerMonth = kmPerMonth * 0.75;
                    break;
                case "Summer":
                    pricePerMonth = kmPerMonth * 0.90;
                    break;
                case "Winter":
                    pricePerMonth = kmPerMonth * 1.05;
                    break;
                default:
                    break;
            }
        } else if (kmPerMonth > 5000 && kmPerMonth <= 10000) {
            switch (season) {
                case "Spring":
                case "Autumn":
                    pricePerMonth = kmPerMonth * 0.95;
                    break;
                case "Summer":
                    pricePerMonth = kmPerMonth * 1.10;
                    break;
                case "Winter":
                    pricePerMonth = kmPerMonth * 1.25;
                    break;
                default:
                    break;
            }

        } else if (kmPerMonth > 10000 && kmPerMonth <= 20000) {
            pricePerMonth = kmPerMonth * 1.45;
        }
        double pricePerSeason = pricePerMonth * 4;
        double salary = pricePerSeason - pricePerSeason * 0.10;

        System.out.printf("%.2f", Math.round(salary * 100000) / 100000.0);
    }
}
