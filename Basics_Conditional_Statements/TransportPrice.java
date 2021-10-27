package ProgrammingBasics.Basics_Conditional_Statements;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String dayOrNight = scanner.nextLine();

        String dayTime = "day";
        String nightTime = "night";

        //такси
        double startPriceTaxi = 0.70;
        double pricePerKm = 0;

        if (dayOrNight.equals(dayTime)) {
            pricePerKm = 0.79 * n;
        } else if (dayOrNight.equals(nightTime)) {
            pricePerKm = 0.90 * n;
        }
        double taxiPrice = startPriceTaxi + pricePerKm;

        //автобус
        double priceBus = 0.09 * n;

        //влак
        double priceTrain = 0.06 * n;

        if (n >=20 && n < 100) {
            if (priceBus < taxiPrice) {
                System.out.printf("%.2f",priceBus);
            } else {
                System.out.printf("%.2f", taxiPrice);
            }
        } else if (n >=100) {
            if ((priceBus < taxiPrice) && (priceBus < priceTrain)) {
                System.out.printf("%.2f", priceBus);
            } else if ((priceTrain < priceBus) && (priceTrain < taxiPrice)) {
                System.out.printf("%.2f", priceTrain);
            } else {
                System.out.printf("%.2f", taxiPrice);
            }
        } else {
            System.out.printf("%.2f", taxiPrice);
        }
    }
}
