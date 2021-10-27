package ProgrammingBasics.Basics_First_Steps;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double depositSum = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        Double interestRate = Double.parseDouble(scanner.nextLine());

        Double sumPerMonth = (depositSum * interestRate / 100) / 12;
        Double sum = depositSum + months * sumPerMonth;

        System.out.println(sum);
    }
}
