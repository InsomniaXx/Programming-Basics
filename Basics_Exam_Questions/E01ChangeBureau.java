package ProgrammingBasics.Basics_Exam_Questions;

import java.util.Scanner;

public class E01ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countBTC = Integer.parseInt(scanner.nextLine());
        double countYoan = Double.parseDouble(scanner.nextLine());
        double commissionFee = Double.parseDouble(scanner.nextLine());

        double moneyBTCtoBGN = countBTC * 1168;
        double moneyYoanToUSD = countYoan * 0.15;
        double moneyYoanToBGN = moneyYoanToUSD * 1.76;
        double moneyToEUR = (moneyBTCtoBGN + moneyYoanToBGN) / 1.95;
        double finalMoney = moneyToEUR - moneyToEUR * commissionFee / 100;

        System.out.printf("%.2f", finalMoney);
    }
}
