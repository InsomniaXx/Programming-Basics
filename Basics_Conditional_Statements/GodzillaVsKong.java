package ProgrammingBasics.Basics_Conditional_Statements;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int countStatists = Integer.parseInt(scanner.nextLine());
        double pricePerStatist = Double.parseDouble(scanner.nextLine());
        double totalPriceCloth = countStatists * pricePerStatist;

        double priceDecor = budget * 0.1;

        if (countStatists > 150) {
            totalPriceCloth = totalPriceCloth - totalPriceCloth * 0.1;
        }

        double finalPrice = totalPriceCloth + priceDecor;

        if (finalPrice > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(budget - finalPrice));
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", Math.abs(budget - finalPrice));
        }
    }
}
