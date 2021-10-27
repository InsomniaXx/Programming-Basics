package ProgrammingBasics.Basics_Conditional_Statements;

import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int additionalMinutes = 15;

        int calculatedHour = (hour * 60 + minutes + additionalMinutes) / 60;
        int calculatedMinutes = (hour * 60 + minutes + additionalMinutes) % 60;

        if (calculatedHour >= 24) {
            calculatedHour = calculatedHour - 24;
        }

        if (calculatedMinutes <= 9) {
            System.out.print(calculatedHour);
            System.out.println(":0" + calculatedMinutes);
        } else{
            System.out.print(calculatedHour);
            System.out.println(":" + calculatedMinutes);
        }

    }
}
