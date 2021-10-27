package ProgrammingBasics.Basics_While_Loop;

import java.util.Scanner;

public class A01Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countBottles = Integer.parseInt(scanner.nextLine()); // 750ml
        String input = scanner.nextLine();

        int countDetergent = countBottles * 750;
        int countLoading = 0;
        int countPlates = 0;
        int countPot = 0;
        boolean isFinished = false;

        while (!input.equals("End")) {
            int countDishes = Integer.parseInt(input);
            countLoading++;

            if (countLoading % 3 == 0) {
                countDetergent -= countDishes * 15;
                countPot += countDishes;
            } else {
                countDetergent -= countDishes * 5;
                countPlates += countDishes;
            }
            if (countDetergent < 0) {
                isFinished = true;
                break;
            }
            input = scanner.nextLine();
        }

        if (isFinished) {
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(countDetergent));
        } else {
            System.out.println("Detergent was enough!");
            System.out.printf("%s dishes and %s pots were washed.\n", countPlates, countPot);
            System.out.printf("Leftover detergent %d ml.", Math.abs(countDetergent));
        }
    }
}
