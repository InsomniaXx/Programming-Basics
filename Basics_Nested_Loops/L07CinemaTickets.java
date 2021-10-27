package ProgrammingBasics.Basics_Nested_Loops;

import java.util.Scanner;

public class L07CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int counterTotalTicket = 0;
        int countStudent = 0;
        int countStandard = 0;
        int countKid = 0;


        while (!input.equals("Finish")) {
            String movieName = input;
            int freeSeats = Integer.parseInt(scanner.nextLine());

            int counterTicket = 0;
            String command = scanner.nextLine();
            while (!command.equals("End")) {
                String ticketType = command;
                counterTicket++;

                switch (ticketType) {
                    case "student":
                        countStudent++;
                        break;
                    case "standard":
                        countStandard++;
                        break;
                    case "kid":
                        countKid++;
                        break;
                }
                if (counterTicket == freeSeats) {
                    break;
                }
                command = scanner.nextLine();
            }
            counterTotalTicket += counterTicket;
            System.out.printf("%s - %.2f%% full.\n", movieName, counterTicket * 1.0 / freeSeats * 100);
            input = scanner.nextLine();
        }

        System.out.printf("Total tickets: %d\n", counterTotalTicket);
        System.out.printf("%.2f%% student tickets.\n", countStudent * 1.0 / counterTotalTicket * 100);
        System.out.printf("%.2f%% standard tickets.\n", countStandard * 1.0 / counterTotalTicket * 100);
        System.out.printf("%.2f%% kids tickets.\n", countKid * 1.0 / counterTotalTicket * 100);

    }
}