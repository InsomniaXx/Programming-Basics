package ProgrammingBasics.Basics_Exam_Questions;

import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tShirtPrice = Double.parseDouble(scanner.nextLine());
        double priceToGetBall = Double.parseDouble(scanner.nextLine());

        double shortsPrice = 0.75 * tShirtPrice;
        double socksPrice = 0.20 * shortsPrice;
        double shoesPrice = 2 * (shortsPrice + tShirtPrice);
        double finalPrice = tShirtPrice + shortsPrice + socksPrice + shoesPrice;
        double discountedPrice = finalPrice - finalPrice * 0.15;

        if (discountedPrice >= priceToGetBall) {
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.", discountedPrice);
        } else {
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.", priceToGetBall - discountedPrice);
        }

    }
}
