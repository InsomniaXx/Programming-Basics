package ProgrammingBasics.Basics_Conditional_Statements;

import java.util.Scanner;

public class A01MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String vipVsNormal = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());

        double ticketPrice = 0;

        if (vipVsNormal.equals("VIP")) {
            ticketPrice = people * 499.99;
        } else if (vipVsNormal.equals("Normal")) {
            ticketPrice = people * 249.99;
        }

        if (people >= 1 && people <= 4) {
            budget = budget - budget * 0.75;
        } else if (people >= 5 && people <= 9) {
            budget = budget - budget * 0.60;
        } else if (people >= 10 && people <= 24) {
            budget = budget - budget * 0.50;
        } else if (people >= 25 && people <= 49) {
            budget = budget - budget * 0.40;
        } else if (people >= 50) {
            budget = budget - budget * 0.25;
        }

        if (ticketPrice <= budget) {
            System.out.printf("Yes! You have %.2f leva left.", budget - ticketPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(ticketPrice - budget));
        }
    }
}
