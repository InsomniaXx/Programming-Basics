package ProgrammingBasics.Basics_Conditional_Statements;

import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int overtimeCountWorkers = Integer.parseInt(scanner.nextLine());

        double workedHours = Math.floor((days - days * 0.1) * 8);
        double workedOvertimeHours = Math.floor(overtimeCountWorkers * (2 * days));
        double totalHours = Math.floor(workedHours + workedOvertimeHours);
        double hoursLeft = Math.floor(Math.abs(totalHours - hours));

        if (totalHours >= hours) {
            System.out.printf("Yes!%.0f hours left.", hoursLeft);
        } else {
            System.out.printf("Not enough time!%.0f hours needed.", hoursLeft);
        }
    }
}
