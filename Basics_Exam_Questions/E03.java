package ProgrammingBasics.Basics_Exam_Questions;

import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double packageWeight = Double.parseDouble(scanner.nextLine());
        String packageType = scanner.nextLine();
        double packageDistance = Double.parseDouble(scanner.nextLine());
        double travelPrice = 0;
        double markUp = 0;
        double finalPrice = 0;

        if (packageWeight < 1) {
            travelPrice = 0.03;
        } else if (packageWeight >= 1 && packageWeight < 10) {
            travelPrice = 0.05;
        } else if (packageWeight >= 10 && packageWeight < 40) {
            travelPrice = 0.10;
        } else if (packageWeight >= 40 && packageWeight < 90) {
            travelPrice = 0.15;
        } else if (packageWeight >= 90 && packageWeight < 150) {
            travelPrice = 0.20;
        }

        if (packageType.equals("express")) {
            if (packageWeight < 1) {
                markUp = travelPrice * 0.80;
            } else if (packageWeight >= 1 && packageWeight < 10) {
                markUp = travelPrice * 0.40;
            } else if (packageWeight >= 10 && packageWeight < 40) {
                markUp = travelPrice * 0.05;
            } else if (packageWeight >= 40 && packageWeight < 90) {
                markUp = travelPrice * 0.02;
            } else if (packageWeight >= 90 && packageWeight < 150) {
                markUp = travelPrice * 0.01;
            }

        }

        if (packageType.equals("standard")) {
            finalPrice = travelPrice * packageDistance;
        } else if (packageType.equals("express")) {
            finalPrice = packageDistance * packageWeight * markUp + travelPrice * packageDistance;
        }
        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", packageWeight, finalPrice);
    }
}
