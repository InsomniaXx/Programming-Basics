package ProgrammingBasics.Basics_Conditional_Statements;

import java.util.Scanner;

public class FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        double quantityFuel = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine();

        double gasolinePrice = 2.22;
        double dieselPrice = 2.33;
        double gasPrice = 0.93;

        boolean hasCard = clubCard.equals("Yes");

        if (hasCard) {
            gasolinePrice = gasolinePrice - 0.18;
            dieselPrice = dieselPrice - 0.12;
            gasPrice = gasPrice - 0.08;
        }
        double totalPrice = 0;

        if (fuelType.equals("Gasoline")) {
            totalPrice = quantityFuel * gasolinePrice;
        } else if (fuelType.equals("Diesel")) {
            totalPrice = quantityFuel * dieselPrice;
        } else if (fuelType.equals("Gas")) {
            totalPrice = quantityFuel * gasPrice;
        }

        if (quantityFuel < 20) {
            System.out.printf("%.2f lv.", totalPrice);
        } else if (quantityFuel >= 20 && quantityFuel <= 25) {
            totalPrice = totalPrice - totalPrice * 0.08;
            System.out.printf("%.2f lv.", totalPrice);
        } else {
            totalPrice = totalPrice - totalPrice * 0.1;
            System.out.printf("%.2f lv.", totalPrice);
        }
    }
}
