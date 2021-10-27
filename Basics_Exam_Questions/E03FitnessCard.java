package ProgrammingBasics.Basics_Exam_Questions;

import java.util.Scanner;

public class E03FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentMoney = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();

        double cardPrice = 0;

        switch (sport) {
            case "Gym":
                if (gender.equals("m")) {
                    cardPrice += 42;
                } else if (gender.equals("f")) {
                    cardPrice += 35;
                }
                break;
            case "Boxing":
                if (gender.equals("m")) {
                    cardPrice += 41;
                } else if (gender.equals("f")) {
                    cardPrice += 37;
                }
                break;
            case "Yoga":
                if (gender.equals("m")) {
                    cardPrice += 45;
                } else if (gender.equals("f")) {
                    cardPrice += 42;
                }
                break;
            case "Zumba":
                if (gender.equals("m")) {
                    cardPrice += 34;
                } else if (gender.equals("f")) {
                    cardPrice += 31;
                }
                break;
            case "Dances":
                if (gender.equals("m")) {
                    cardPrice += 51;
                } else if (gender.equals("f")) {
                    cardPrice += 53;
                }
                break;
            case "Pilates":
                if (gender.equals("m")) {
                    cardPrice += 39;
                } else if (gender.equals("f")) {
                    cardPrice += 37;
                }
                break;
            default:
                break;
        }

        if (age <= 19) {
            cardPrice = cardPrice - cardPrice * 0.20;
        }

        if (currentMoney >= cardPrice) {
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        } else {
            System.out.printf("You don't have enough money! You need $%.2f more.", Math.abs(cardPrice - currentMoney));
        }
    }
}
