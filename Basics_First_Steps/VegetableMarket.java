package ProgrammingBasics.Basics_First_Steps;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceVegetables = Double.parseDouble(scanner.nextLine());
        double priceFruit = Double.parseDouble(scanner.nextLine());
        double kgVegetables = Double.parseDouble(scanner.nextLine());
        double kgFruits = Double.parseDouble(scanner.nextLine());

        double euro = 1.94;
        double sumPrice = (priceVegetables * kgVegetables + priceFruit * kgFruits) / euro;

        System.out.printf("%.2f",sumPrice);

    }
}
