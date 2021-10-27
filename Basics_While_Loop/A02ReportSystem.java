package ProgrammingBasics.Basics_While_Loop;

import java.util.Scanner;

public class A02ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sellPrice = Integer.parseInt(scanner.nextLine());

        boolean isSuccessful = true;
        double countCSSum = 0;
        double countCCSum = 0;
        int countCS = 0;
        int countCC = 0;
        int countActions = 0;
        double currentPrice = 0;
        String action = "";

        String input = scanner.nextLine();

        double averageCC = 0;
        double averageCS = 0;

        while (!input.equals("End")) {
            int countMoney = Integer.parseInt(input);
            countActions++;

            if (countActions % 2 == 0) {
                action = "CreditCard";
            } else {
                action = "Cash";
            }
            if (action.equals("Cash")) {
                if (countMoney > 100) {
                    isSuccessful = false;
                } else {
                    isSuccessful = true;
                    countCSSum += countMoney;
                    countCS++;
                }
            } else {
                if (countMoney < 10) {
                    isSuccessful = false;
                } else {
                    isSuccessful = true;
                    countCCSum += countMoney;
                    countCC++;
                }
            }
            if (isSuccessful) {
                System.out.println("Product sold!");
                currentPrice = countCSSum + countCCSum;
                if (sellPrice <= currentPrice) {
                    break;
                }
            } else {
                System.out.println("Error in transaction!");
            }

            input = scanner.nextLine();
        }
        if (countCCSum != 0 && countCC != 0) {
            averageCC += countCCSum / countCC;
        }
        if (countCSSum != 0 && countCS != 0) {
            averageCS += countCSSum / countCS;
        }
        if (input.equals("End")) {
            System.out.println("Failed to collect required money for charity.");
        } else {
            System.out.printf("Average CS: %.2f%n", averageCS);
            System.out.printf("Average CC: %.2f%n", averageCC);
        }
    }

}

