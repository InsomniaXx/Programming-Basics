package ProgrammingBasics.Basics_Exam_Questions;

import java.util.Scanner;

public class E06TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
       // String input = scanner.nextLine();

        double countMoney = 0;
        int countWinDays = 0;
        int countLoseDays = 0;
        int countWins = 0;
        int countLoses = 0;
        double countTotalMoney = 0;
        boolean isWin = false;

        for (int i = 1; i <= days; i++) {
            String input = scanner.nextLine();
            double countMoneyPerDay = 0;
            while (!input.equals("Finish")) {
                String result = scanner.nextLine();
                switch (result) {
                    case "win":
                        countWins++;
                        countMoney += 20;
                        countMoneyPerDay += 20;
                        break;
                    case "lose":
                        countLoses++;
                        break;
                    default:
                        break;
                }
                input = scanner.nextLine();
            }

            if (countWins > countLoses) {
                countTotalMoney += countMoneyPerDay + countMoneyPerDay * 0.1;

                countWinDays++;
            } else {

                countLoseDays++;
            }

        }
        countTotalMoney += countMoney;

        if (countWinDays > countLoseDays) {
            countTotalMoney = countTotalMoney + countTotalMoney * 0.2;
            isWin = true;
        }

        if (isWin) {
            System.out.printf("You won the tournament! Total raised money: %.2f", countTotalMoney);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", countTotalMoney);

        }

    }
}
