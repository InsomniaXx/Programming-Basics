package ProgrammingBasics.Basics_Conditional_Statements;

import java.util.Scanner;

public class L13SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String feedback = scanner.nextLine();

        double pricePerType = 0;

        switch (type) {
            case "room for one person":
                pricePerType = 18;
                break;
            case "apartment":
                pricePerType = 25;
                break;
            case "president apartment":
                pricePerType = 35;
                break;
            default:
                pricePerType = 0;
                break;
        }

        if (days < 10) {
           switch (type) {
               case "room for one person":
                   pricePerType = pricePerType;
                   break;
               case "apartment":
                   pricePerType = pricePerType - pricePerType * 0.30;
                   break;
               case "president apartment":
                   pricePerType = pricePerType - pricePerType * 0.10;
                   break;
               default:
                   break;
           }
        } else if (days >= 10 && days <= 15) {
            switch (type) {
                case "room for one person":
                    pricePerType = pricePerType;
                    break;
                case "apartment":
                    pricePerType = pricePerType - pricePerType * 0.35;
                    break;
                case "president apartment":
                    pricePerType = pricePerType - pricePerType * 0.15;
                    break;
                default:
                    break;
            }

        } else if (days > 15) {
            switch (type) {
                case "room for one person":
                    pricePerType = pricePerType;
                    break;
                case "apartment":
                    pricePerType = pricePerType - pricePerType * 0.50;
                    break;
                case "president apartment":
                    pricePerType = pricePerType - pricePerType * 0.20;
                    break;
                default:
                    break;
            }

        }

        double finalPrice = 0;

        if (feedback.equals("positive")) {
            finalPrice = (pricePerType + pricePerType * 0.25) * (days - 1);
        } else if (feedback.equals("negative")) {
            finalPrice = (pricePerType - pricePerType * 0.10) * (days - 1);
        }

        System.out.printf("%.2f", finalPrice);
    }
}
