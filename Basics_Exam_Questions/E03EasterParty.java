package ProgrammingBasics.Basics_Exam_Questions;

import java.util.Scanner;

public class E03EasterParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countGuests = Integer.parseInt(scanner.nextLine());
        double covertPerPerson = Double.parseDouble(scanner.nextLine());
        double dessyBudget = Double.parseDouble(scanner.nextLine());

        dessyBudget = dessyBudget - dessyBudget * 0.10;

        if (countGuests >= 10 && countGuests <= 15) {
            covertPerPerson = covertPerPerson - covertPerPerson * 0.15;
        } else if (countGuests > 15 && countGuests <= 20) {
            covertPerPerson = covertPerPerson - covertPerPerson * 0.20;
        } else if (countGuests > 20) {
            covertPerPerson = covertPerPerson - covertPerPerson * 0.25;
        }

        double priceCovert = countGuests * covertPerPerson;

        double difference = Math.abs(priceCovert - dessyBudget);

        if (dessyBudget >= priceCovert) {
            System.out.printf("It is party time! %.2f leva left.", difference);
        } else {
            System.out.printf("No party! %.2f leva needed.", difference);
        }
    }
}
