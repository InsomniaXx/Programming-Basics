package ProgrammingBasics.Basics_For_Loop;

import java.util.Scanner;

public class L11CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceWashingMachine = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int countBrother = 0;
        int countToys = 0;
        double sumMoney = 0;
        double money = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                money = money + 10;
                sumMoney = sumMoney + money;
                countBrother++;
            } else {
                countToys++;
            }
        }

        int allToysMoney = countToys * toyPrice;
        double lillyMoney = sumMoney + allToysMoney - countBrother;
        double difference = Math.abs(lillyMoney - priceWashingMachine);

        if (lillyMoney >= priceWashingMachine) {
            System.out.printf("Yes! %.2f", difference);
        } else {
            System.out.printf("No! %.2f", difference);
        }
    }
}
