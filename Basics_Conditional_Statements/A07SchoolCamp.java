package ProgrammingBasics.Basics_Conditional_Statements;

import java.util.Scanner;

public class A07SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String groupType = scanner.nextLine();
        int countStudents = Integer.parseInt(scanner.nextLine());
        int countNights = Integer.parseInt(scanner.nextLine());

        double priceAllNights = 0;

        switch (season) {
            case "Winter":
                if (groupType.equals("boys") || groupType.equals("girls")) {
                    priceAllNights = countNights * countStudents * 9.60;
                } else if (groupType.equals("mixed")) {
                    priceAllNights = countNights * countStudents * 10;
                }
                break;
            case "Spring":
                if (groupType.equals("boys") || groupType.equals("girls")) {
                    priceAllNights = countNights * countStudents * 7.20;
                } else if (groupType.equals("mixed")) {
                    priceAllNights = countNights * countStudents * 9.50;
                }
                break;
            case "Summer":
                if (groupType.equals("boys") || groupType.equals("girls")) {
                    priceAllNights = countNights * countStudents * 15;
                } else if (groupType.equals("mixed")) {
                    priceAllNights = countNights * countStudents * 20;
                }
                break;
            default:
                break;
        }

        if (countStudents >= 10 && countStudents < 20) {
            priceAllNights = priceAllNights - priceAllNights * 0.05;
        } else if (countStudents >= 20 && countStudents < 50) {
            priceAllNights = priceAllNights - priceAllNights * 0.15;
        } else if (countStudents >= 50) {
            priceAllNights = priceAllNights - priceAllNights * 0.50;
        }

        String sportType = "";

        switch (season) {
            case "Winter":
                if (groupType.equals("girls")) {
                    sportType = "Gymnastics";
                } else if (groupType.equals("boys")) {
                    sportType = "Judo";
                } else if (groupType.equals("mixed")) {
                    sportType = "Ski";
                }
                break;
            case "Spring":
                if (groupType.equals("girls")) {
                    sportType = "Athletics";
                } else if (groupType.equals("boys")) {
                    sportType = "Tennis";
                } else if (groupType.equals("mixed")) {
                    sportType = "Cycling";
                }
                break;
            case "Summer":
                if (groupType.equals("girls")) {
                    sportType = "Volleyball";
                } else if (groupType.equals("boys")) {
                    sportType = "Football";
                } else if (groupType.equals("mixed")) {
                    sportType = "Swimming";
                }
                break;
            default:
                break;
        }

        System.out.printf("%s %.2f lv.", sportType, priceAllNights);

    }

}
