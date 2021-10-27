package ProgrammingBasics.Basics_While_Loop;

import java.util.Scanner;

public class E03x2Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());
        double currentMoney = Double.parseDouble(scanner.nextLine());
        int spendDays = 0;
        int countDays = 0;
        boolean isFailed = false;

        while (currentMoney < tripPrice) {
            String action = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            countDays++;

            switch (action) {
                case "spend":
                    spendDays++;
                    currentMoney -= money;
                    if (currentMoney < 0) {
                        currentMoney = 0;
                    }
                    break;
                case "save":
                    spendDays = 0;
                    currentMoney += money;
                    break;
                default:
                    break;
            }

            if (spendDays == 5) {
                isFailed = true;
                break;
            }
        }

        if (isFailed) {
            System.out.println("You can't save the money.");
            System.out.println(countDays);
        } else {
            System.out.printf("You saved the money for %d days.", countDays);
        }

    }
}
