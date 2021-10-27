package ProgrammingBasics.Basics_For_Loop;

import java.util.Scanner;

public class A06Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double priceWater = 0;
        double priceInternet = 0;
        double priceOthers = 0;
        double priceElectricity = 0;

        for (int i = 1; i <= n; i++) {
            double priceElectricityPerMonth = Double.parseDouble(scanner.nextLine());

            priceElectricity = priceElectricity + priceElectricityPerMonth;
            priceWater = priceWater + 20;
            priceInternet = priceInternet + 15;
            priceOthers = (priceElectricity + priceWater + priceInternet) + (priceElectricity + priceWater + priceInternet) * 0.20;
        }

        double averagePrice = (priceElectricity + priceWater + priceInternet + priceOthers) / n;
        System.out.printf("Electricity: %.2f lv \n", priceElectricity);
        System.out.printf("Water: %.2f lv \n", priceWater);
        System.out.printf("Internet: %.2f lv \n", priceInternet);
        System.out.printf("Other: %.2f lv \n", priceOthers);
        System.out.printf("Average: %.2f lv \n", averagePrice);

    }
}
