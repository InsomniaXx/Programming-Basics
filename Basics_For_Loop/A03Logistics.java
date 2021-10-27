package ProgrammingBasics.Basics_For_Loop;

import java.util.Scanner;

public class A03Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double priceVan = 0;
        double priceTruck = 0;
        double priceTrain = 0;

        double countVan = 0;
        double countTruck = 0;
        double countTrain = 0;

        double totalCargo = 0;

        for (int i = 1; i <= n; i++) {
            int cargo = Integer.parseInt(scanner.nextLine());
            if (cargo <= 3) {
                priceVan = priceVan + cargo * 200;
                countVan = countVan + cargo;
            } else if (cargo >= 4 && cargo <= 11) {
                priceTruck = priceTruck + cargo * 175;
                countTruck = countTruck + cargo;
            } else if (cargo >= 12) {
                priceTrain = priceTrain + cargo * 120;
                countTrain = countTrain + cargo;
            }
            totalCargo = totalCargo + cargo;
        }
        double middleSum = (priceVan + priceTruck + priceTrain) / totalCargo;
        double percentageVan = countVan / totalCargo * 100.0;
        double percentageTruck = countTruck / totalCargo * 100.0;
        double percentageTrain = countTrain / totalCargo * 100.0;

        System.out.printf("%.2f%n", middleSum);
        System.out.printf("%.2f%%%n", percentageVan);
        System.out.printf("%.2f%%%n", percentageTruck);
        System.out.printf("%.2f%%%n", percentageTrain);
    }
}
