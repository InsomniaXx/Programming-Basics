package ProgrammingBasics.Basics_Conditional_Statements;

import java.util.Scanner;

public class L12TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double tradeVolume = Double.parseDouble(scanner.nextLine());

        double percentage = 0;

        if (tradeVolume >= 0 && tradeVolume <= 500) {
            switch (town) {
                case "Sofia":
                    percentage = 0.05;
                    break;
                case "Varna":
                    percentage = 0.045;
                    break;
                case "Plovdiv":
                    percentage =  0.055;
                    break;
                default:
                    percentage = 0;
                    break;
            }
        } else if (tradeVolume > 500 && tradeVolume <= 1000) {
            switch (town) {
                case "Sofia":
                    percentage = 0.07;
                    break;
                case "Varna":
                    percentage = 0.075;
                    break;
                case "Plovdiv":
                    percentage =  0.08;
                    break;
                default:
                    percentage = 0;
                    break;
            }
        } else if (tradeVolume > 1000 && tradeVolume <= 10000) {
            switch (town) {
                case "Sofia":
                    percentage = 0.08;
                    break;
                case "Varna":
                    percentage = 0.10;
                    break;
                case "Plovdiv":
                    percentage =  0.12;
                    break;
                default:
                    percentage = 0;
                    break;
            }
        } else if (tradeVolume > 10000) {
            switch (town) {
                case "Sofia":
                    percentage = 0.12;
                    break;
                case "Varna":
                    percentage = 0.13;
                    break;
                case "Plovdiv":
                    percentage =  0.145;
                    break;
                default:
                    percentage = 0;
                    break;
            }
        }

        if (percentage > 0) {
            System.out.printf("%.2f", tradeVolume * percentage);
        } else {
            System.out.println("error");
        }
    }
}
