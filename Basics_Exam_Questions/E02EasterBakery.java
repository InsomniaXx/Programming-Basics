package ProgrammingBasics.Basics_Exam_Questions;

import java.util.Scanner;

public class E02EasterBakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceFlourKg = Double.parseDouble(scanner.nextLine());
        double kgFlour = Double.parseDouble(scanner.nextLine());
        double kgSugar = Double.parseDouble(scanner.nextLine());
        int countEggShells = Integer.parseInt(scanner.nextLine());
        int countYeast = Integer.parseInt(scanner.nextLine());

        double priceSugar = priceFlourKg - priceFlourKg * 0.25;
        double priceEggShell = priceFlourKg + priceFlourKg * 0.10;
        double priceYeast = priceSugar - priceSugar * 0.80;

        double sumFlour = priceFlourKg * kgFlour;
        double sumSugar = priceSugar * kgSugar;
        double sumEggShell = priceEggShell * countEggShells;
        double sumYeast = priceYeast * countYeast;

        double totalSum = sumFlour + sumSugar + sumEggShell + sumYeast;

        System.out.printf("%.2f", totalSum);

    }
}
