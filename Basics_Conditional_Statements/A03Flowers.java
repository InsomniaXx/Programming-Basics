package ProgrammingBasics.Basics_Conditional_Statements;

import java.util.Scanner;

public class A03Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countChrysanthemum = Integer.parseInt(scanner.nextLine());
        int countRoses = Integer.parseInt(scanner.nextLine());
        int countTulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String isFeast = scanner.nextLine();

        double priceChrysanthemum = 0;
        double priceRoses = 0;
        double priceTulips = 0;

        switch (season) {
            case "Spring":
            case "Summer":
                priceChrysanthemum = countChrysanthemum * 2;
                priceRoses = countRoses * 4.10;
                priceTulips = countTulips * 2.50;
                break;
            case "Autumn":
            case "Winter":
                priceChrysanthemum = countChrysanthemum * 3.75;
                priceRoses = countRoses * 4.50;
                priceTulips = countTulips * 4.15;
                break;
            default:
                break;
        }

        int countFlowers = countRoses + countChrysanthemum + countTulips;
        double priceBouquet = priceChrysanthemum + priceRoses + priceTulips;

        if (isFeast.equals("Y")) {
            priceBouquet = priceBouquet + priceBouquet * 0.15;
        }

        if (countTulips > 7 && season.equals("Spring")) {
            priceBouquet = priceBouquet - priceBouquet * 0.05;
        }

        if (countRoses >= 10 && season.equals("Winter")) {
            priceBouquet = priceBouquet - priceBouquet * 0.10;
        }

        if (countFlowers > 20) {
            priceBouquet = priceBouquet - priceBouquet * 0.20;
        }

        System.out.printf("%.2f", Math.round((priceBouquet + 2) * 100000) / 100000.0);
    }
}
