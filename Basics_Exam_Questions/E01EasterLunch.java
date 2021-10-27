package ProgrammingBasics.Basics_Exam_Questions;

import java.util.Scanner;

public class E01EasterLunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countEasterCake = Integer.parseInt(scanner.nextLine());
        int countEggshells = Integer.parseInt(scanner.nextLine());
        int kgCookies = Integer.parseInt(scanner.nextLine());

        double priceEasterCake = 3.20;
        double priceEggs = 4.35; // за кора с 12 яйца
        double priceKgCookies = 5.40;
        double priceEggPaint = 0.15; // за яйце

        double sumCake = countEasterCake * priceEasterCake;
        double sumEggs = countEggshells * priceEggs;
        double sumEggPaint = countEggshells * 12 * priceEggPaint;
        double sumCookies = kgCookies * priceKgCookies;

        double totalSum = sumCake + sumEggs + sumEggPaint + sumCookies;

        System.out.printf("%.2f", totalSum);
    }
}
