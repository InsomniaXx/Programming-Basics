package ProgrammingBasics.Basics_First_Steps;

import java.util.Scanner;

public class CharityCamplaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysCampaign = Integer.parseInt(scanner.nextLine());
        int quantityMaker = Integer.parseInt(scanner.nextLine());
        int quantityCakes = Integer.parseInt(scanner.nextLine());
        int quantityWaffles = Integer.parseInt(scanner.nextLine());
        int quantityPancakes = Integer.parseInt(scanner.nextLine());

        double priceCake = 45.0;
        double priceWaffle = 5.80;
        double pricePancake = 3.20;

        double pricePerMaker = quantityCakes * priceCake + quantityWaffles * priceWaffle + quantityPancakes * pricePancake;
        double priceAllDays = pricePerMaker * quantityMaker * daysCampaign;
        double priceAllMakers = pricePerMaker * quantityMaker;
        double charitySum = priceAllDays - (priceAllDays / 8);
        // System.out.println(priceAllMakers);
        // System.out.printf("%.1f \n", priceAllDays);
        System.out.printf("%.2f",charitySum);
    }
}
