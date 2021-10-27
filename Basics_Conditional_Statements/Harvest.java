package ProgrammingBasics.Basics_Conditional_Statements;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int xGrape = Integer.parseInt(scanner.nextLine());
        double yGrape = Double.parseDouble(scanner.nextLine());
        int zLitres = Integer.parseInt(scanner.nextLine());
        int countWorkers = Integer.parseInt(scanner.nextLine());

        double totalGrape = xGrape * yGrape;
        double wineProduce = (0.4 * totalGrape) / 2.5;
        double litresLeft = Math.abs(wineProduce - zLitres);
        double litrePerWorker = Math.abs(wineProduce - zLitres) / countWorkers;

        if (wineProduce >= zLitres) {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n", Math.floor(wineProduce));
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(litresLeft), Math.ceil(litrePerWorker));

        } else {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(litresLeft));
        }

    }
}
