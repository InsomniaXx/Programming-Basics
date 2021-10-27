package ProgrammingBasics.Basics_Exam_Questions;

import java.util.Scanner;

public class E02AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceBaggage20Kilo = Double.parseDouble(scanner.nextLine());
        double kiloBaggage = Double.parseDouble(scanner.nextLine());
        int daysTillTrip = Integer.parseInt(scanner.nextLine());
        int countBaggage = Integer.parseInt(scanner.nextLine());

        double baggageFee = 0;

        if (kiloBaggage < 10) {
            baggageFee = priceBaggage20Kilo * 0.2;
        } else if (kiloBaggage >= 10 && kiloBaggage <= 20) {
            baggageFee = priceBaggage20Kilo * 0.5;
        } else if (kiloBaggage > 20) {
            baggageFee = priceBaggage20Kilo;
        }

        if (daysTillTrip > 30) {
            baggageFee = baggageFee + baggageFee * 0.1;
        } else if (daysTillTrip >= 7 && daysTillTrip <= 30) {
            baggageFee = baggageFee + baggageFee * 0.15;
        } else if (daysTillTrip < 7) {
            baggageFee = baggageFee + baggageFee * 0.4;
        }
        double finalPrice = baggageFee *  countBaggage;

        System.out.printf("The total price of bags is: %.2f lv. ", finalPrice);
    }
}
