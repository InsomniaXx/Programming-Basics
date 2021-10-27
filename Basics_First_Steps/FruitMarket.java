package ProgrammingBasics.Basics_First_Steps;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceStrawberry = Double.parseDouble(scanner.nextLine());
        double quantityBananas = Double.parseDouble(scanner.nextLine());
        double quantityOranges = Double.parseDouble(scanner.nextLine());
        double quantityRedBerries = Double.parseDouble(scanner.nextLine());
        double quantityStrawberry = Double.parseDouble(scanner.nextLine());

        double priceRedBerries = priceStrawberry - priceStrawberry * 50 / 100;
        double priceOranges = priceRedBerries - priceRedBerries * 40 / 100;
        double priceBananas = priceRedBerries - priceRedBerries * 80 / 100;

        double sumStrawberry = quantityStrawberry * priceStrawberry;
        double sumBananas = quantityBananas * priceBananas;
        double sumRedBerries = quantityRedBerries * priceRedBerries;
        double sumOranges = quantityOranges * priceOranges;

        double totalSum = sumBananas + sumOranges + sumStrawberry + sumRedBerries;

        System.out.printf("%.2f", totalSum);
    }
}
