package ProgrammingBasics.Basics_Exam_Questions;

import java.util.Scanner;

public class E04EasterGuests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guestCount = Integer.parseInt(scanner.nextLine());
        double lyuboBudget = Double.parseDouble(scanner.nextLine());

        double priceEasterBread = 4;
        double priceEasterEgg = 0.45;

        double countEasterBread = Math.ceil(guestCount / 3.0);
        double countEasterEgg = Math.ceil(guestCount * 2);

        double finalSum = countEasterBread * priceEasterBread + countEasterEgg * priceEasterEgg;

        double difference = Math.abs(finalSum - lyuboBudget);

        if (lyuboBudget >= finalSum) {
            System.out.printf("Lyubo bought %.0f Easter bread and %.0f eggs.\n", countEasterBread, countEasterEgg);
            System.out.printf("He has %.2f lv. left.", difference);
        } else {
            System.out.printf("Lyubo doesn't have enough money. \n");
            System.out.printf("He needs %.2f lv. more.", difference);
        }
    }
}
