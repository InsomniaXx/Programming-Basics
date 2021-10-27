package ProgrammingBasics.Basics_For_Loop;

import java.util.Scanner;

public class A01BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inheritanceMoney = Double.parseDouble(scanner.nextLine());
        int yearToLive = Integer.parseInt(scanner.nextLine());
        int currentAge = 18;
        double spentMoney = 0;

        for (int i = 1800; i <= yearToLive; i++) {
            if (i % 2 == 0) {
                spentMoney = spentMoney + 12000;
            } else {
                spentMoney = spentMoney + 12000 + (50 * currentAge);
            }
            currentAge++;
        }

        double difference = Math.abs(inheritanceMoney - spentMoney);

        if (inheritanceMoney >= spentMoney) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", difference);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", difference);
        }
    }
}
