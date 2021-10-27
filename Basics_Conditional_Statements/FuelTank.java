package ProgrammingBasics.Basics_Conditional_Statements;

import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        double litres = Double.parseDouble(scanner.nextLine());

        String dieselType = "Diesel";
        String gasolineType = "Gasoline";
        String gasType = "Gas";
        String outputType = String.format("%s", fuelType).toLowerCase();

        if (!fuelType.equals(dieselType) && !fuelType.equals(gasolineType) && !fuelType.equals(gasType)) {
            System.out.println("Invalid fuel!");
        } else {
            if (litres < 25) {
                System.out.printf("Fill your tank with %s!", outputType);
            } else {
                System.out.printf("You have enough %s.", outputType);
            }
        }

    }
}
