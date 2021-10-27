package ProgrammingBasics.Basics_Conditional_Statements;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countMagnolia = Integer.parseInt(scanner.nextLine());
        int countHyacinth = Integer.parseInt(scanner.nextLine());
        int countRose = Integer.parseInt(scanner.nextLine());
        int countCactus = Integer.parseInt(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double priceMagnolia = countMagnolia * 3.25;
        double priceHyacinth = countHyacinth * 4;
        double priceRose = countRose * 3.50;
        double priceCactus = countCactus * 8;

        double sumFlowers = priceMagnolia + priceHyacinth + priceRose + priceCactus;
        double finalPrice = sumFlowers - sumFlowers * 0.05;
        double moneyLeft = Math.abs(finalPrice - giftPrice);

        if (finalPrice >= giftPrice) {
            System.out.printf("She is left with %.0f leva.", Math.floor(moneyLeft));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(moneyLeft));
        }
    }
}
