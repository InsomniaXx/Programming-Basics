package ProgrammingBasics.Basics_Exam_Questions;

import java.util.Scanner;

public class E01AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameCompany = scanner.nextLine();
        int countTicketsAdults = Integer.parseInt(scanner.nextLine());
        int countTicketsKids = Integer.parseInt(scanner.nextLine());
        double netPriceAdult = Double.parseDouble(scanner.nextLine());
        double fee = Double.parseDouble(scanner.nextLine());

        double netPriceKids = netPriceAdult - netPriceAdult * 0.7;
        double totalAdultTickets = countTicketsAdults * netPriceAdult + countTicketsAdults * fee;
        double totalKidsTickets = countTicketsKids * netPriceKids + countTicketsKids * fee;

        double priceAgency = (totalAdultTickets + totalKidsTickets) * 0.2;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", nameCompany, priceAgency);
    }
}
