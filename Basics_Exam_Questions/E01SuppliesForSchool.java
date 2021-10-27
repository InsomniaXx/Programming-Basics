package ProgrammingBasics.Basics_Exam_Questions;

import java.util.Scanner;

public class E01SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPens = Integer.parseInt(scanner.nextLine());
        int countMarkers = Integer.parseInt(scanner.nextLine());
        double cleaningLitres = Double.parseDouble(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double pricePens = 5.80;
        double priceMarkers = 7.20;
        double priceCleaning = 1.20;

        double totalPrice = countPens * pricePens + countMarkers * priceMarkers + cleaningLitres * priceCleaning;
        double finalPrice = totalPrice - totalPrice * discount / 100;

        System.out.printf("%.3f", finalPrice);
    }
}
