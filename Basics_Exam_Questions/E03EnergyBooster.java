package ProgrammingBasics.Basics_Exam_Questions;

import java.util.Scanner;

public class E03EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String set = scanner.nextLine();
        int countSets = Integer.parseInt(scanner.nextLine());

        double totalPriceWatermelon = 0;
        double totalPriceMango = 0;
        double totalPricePineapple = 0;
        double totalPriceRaspberry = 0;

        switch (fruit) {
            case "Watermelon":
                if (set.equals("small")) {
                    totalPriceWatermelon += 2 * 56;
                } else if (set.equals("big")) {
                    totalPriceWatermelon += 5 * 28.70;
                }
                break;
            case "Mango":
                if (set.equals("small")) {
                    totalPriceMango += 2 * 36.66;
                } else if (set.equals("big")) {
                    totalPriceMango += 5 * 19.60;
                }
                break;
            case "Pineapple":
                if (set.equals("small")) {
                    totalPricePineapple += 2 * 42.10;
                } else if (set.equals("big")) {
                    totalPricePineapple += 5 * 24.80;
                }
                break;
            case "Raspberry":
                if (set.equals("small")) {
                    totalPriceRaspberry += 2 * 20;
                } else if (set.equals("big")) {
                    totalPriceRaspberry += 5 * 15.20;
                }
                break;
            default:
                break;
        }

        double finalPrice = (totalPriceWatermelon + totalPriceMango + totalPricePineapple + totalPriceRaspberry) * countSets;
        double discountedPrice = finalPrice;

        if (finalPrice >= 400 && finalPrice <= 1000) {
            discountedPrice = discountedPrice - discountedPrice * 0.15;
        } else if (finalPrice > 1000) {
            discountedPrice = discountedPrice - discountedPrice * 0.5;
        }

        System.out.printf("%.2f lv.", discountedPrice);
    }
}
