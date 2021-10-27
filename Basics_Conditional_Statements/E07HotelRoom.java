package ProgrammingBasics.Basics_Conditional_Statements;

import java.util.Scanner;

public class E07HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double studioPrice = 0;
        double apartmentPrice = 0;

        switch (month) {
            case "May":
            case "October":
                studioPrice = 50;
                apartmentPrice = 65;
                break;
            case "June":
            case "September":
                studioPrice = 75.20;
                apartmentPrice = 68.70;
                break;
            case "July":
            case "August":
                studioPrice = 76;
                apartmentPrice = 77;
                break;
            default:
                break;

        }

        switch (month) {
            case "May":
            case "October":
                if (nights > 7 && nights <= 14) {
                    studioPrice = studioPrice - studioPrice * 0.05;
                } else if (nights > 14) {
                    studioPrice = studioPrice - studioPrice * 0.30;
                }
                break;
            case "June":
            case "September":
                if (nights > 14) {
                    studioPrice = studioPrice - studioPrice * 0.20;
                }
        }

        if (nights > 14) {
            apartmentPrice = apartmentPrice - apartmentPrice * 0.10;
        }

        double totalPriceApartment = apartmentPrice * nights;
        double totalPriceStudio = studioPrice * nights;


        System.out.printf("Apartment: %.2f lv. \n", totalPriceApartment);
        System.out.printf("Studio: %.2f lv.", totalPriceStudio);

    }
}
