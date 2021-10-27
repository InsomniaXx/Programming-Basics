package ProgrammingBasics.Basics_First_Steps;

import java.util.Scanner;

public class FishTanks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double volumeCM = length * width * height;
        double volumeLitres = volumeCM * 0.001;
        double neededLitres = volumeLitres - volumeLitres * percent / 100;


        System.out.printf("%.2f", neededLitres);
    }
}
