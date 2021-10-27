package ProgrammingBasics.Basics_Conditional_Statements;

import java.util.Scanner;

public class A02BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countJunior = Integer.parseInt(scanner.nextLine());
        int countSenior = Integer.parseInt(scanner.nextLine());
        String traceType = scanner.nextLine();

        double pricePerTrace = 0;

        switch (traceType) {
            case "trail":
                pricePerTrace = countJunior * 5.50 + countSenior * 7.0;
                break;
            case "cross-country":
                pricePerTrace = countJunior * 8.0 + countSenior * 9.50;

                if (countJunior + countSenior >= 50) {
                    pricePerTrace = pricePerTrace - pricePerTrace * 0.25;
                }
                break;
            case "downhill":
                pricePerTrace = countJunior * 12.25 + countSenior * 13.75;
                break;
            case "road":
                pricePerTrace = countJunior * 20.0 + countSenior * 21.50;
                break;
            default:
                break;

        }

        double finalPrice = pricePerTrace - pricePerTrace * 0.05;

        System.out.printf("%.2f", Math.round(finalPrice * 100000) / 100000.0);
    }
}
