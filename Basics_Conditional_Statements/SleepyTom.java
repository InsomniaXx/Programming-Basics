package ProgrammingBasics.Basics_Conditional_Statements;

import java.util.Scanner;

public class SleepyTom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int freeDays = Integer.parseInt(scanner.nextLine());

        int normForPlay = 30000;
        int workDays = 365 - freeDays;
        int minutesForPlay = workDays * 63 + freeDays * 127;

        int hours = minutesForPlay / 60;
        int minutes = minutesForPlay % 60;
        int differenceHours = Math.abs((normForPlay - minutesForPlay) / 60);
        int differenceMinutes = Math.abs((normForPlay - minutesForPlay) % 60);

        if (minutesForPlay > normForPlay) {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", differenceHours, differenceMinutes);
        } else {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", differenceHours, differenceMinutes);
        }

    }
}
