package ProgrammingBasics.Basics_Conditional_Statements;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceTour = Double.parseDouble(scanner.nextLine());
        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int dollCount = Integer.parseInt(scanner.nextLine());
        int bearCount = Integer.parseInt(scanner.nextLine());
        int minionCount = Integer.parseInt(scanner.nextLine());
        int truckCount = Integer.parseInt(scanner.nextLine());

        double puzzlePrice = 2.60;
        double dollPrince = 3.00;
        double bearPrice = 4.10;
        double minionPrice = 8.20;
        double truckPrice = 2.00;

        double sumPuzzle = puzzlePrice * puzzleCount;
        double sumDoll = dollPrince * dollCount;
        double sumBear = bearPrice * bearCount;
        double sumMinion = minionPrice * minionCount;
        double sumTruck = truckPrice * truckCount;

        double totalToysCount = puzzleCount + dollCount + bearCount + minionCount + truckCount;
        double totalSumCount = sumPuzzle + sumDoll + sumBear + sumMinion + sumTruck;


        if (totalToysCount >= 50) {
            totalSumCount = totalSumCount - totalSumCount * 25 / 100;
        }
        double rentPrice = totalSumCount * 10 /100;
        double moneyLeft = totalSumCount - rentPrice;
        boolean isMoneyLeft = moneyLeft >= priceTour;
        double diff = Math.abs(moneyLeft - priceTour);

        if (isMoneyLeft) {
            System.out.printf("Yes! %.2f lv left.", diff);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }
    }
}
