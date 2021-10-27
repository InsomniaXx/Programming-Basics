package ProgrammingBasics.Basics_While_Loop;

import java.util.Scanner;

public class E03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyNeed = Double.parseDouble(scanner.nextLine());
        double currentMoney = Double.parseDouble(scanner.nextLine());

        int countDaysSpend = 0;
        int countDays = 0;

        while (currentMoney < moneyNeed && countDaysSpend < 5) {
            String action = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            countDays++;

            if (action.equals("save")) {
                currentMoney += money;
                countDaysSpend = 0;
            } else if (action.equals("spend")) {
                currentMoney -= money;
                countDaysSpend += 1;
                if (currentMoney < 0) {
                    currentMoney = 0;
                }
            }
        }
        if (countDaysSpend == 5) {
            System.out.println("You can't save the money.");
            System.out.println(countDays);
        }
        if (currentMoney >= moneyNeed) {
            System.out.printf("You saved the money for %d days.", countDays);
        }
    }
}
