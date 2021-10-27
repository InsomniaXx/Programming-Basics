package ProgrammingBasics.Basics_Conditional_Statements;

import java.util.Scanner;

public class E08OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hourExam = Integer.parseInt(scanner.nextLine());
        int minutesExam = Integer.parseInt(scanner.nextLine());
        int hourArrival = Integer.parseInt(scanner.nextLine());
        int minutesArrival = Integer.parseInt(scanner.nextLine());

        String conditionArrival = "";

        int timeExam = hourExam * 60 + minutesExam;
        int timeArrival = hourArrival * 60 + minutesArrival;
        int difference = timeArrival - timeExam;

        if (difference >= -30 && difference <= 0) {
            conditionArrival = "On time";
        } else if (difference < -30) {
            conditionArrival = "Early";
        } else if (difference > 0) {
            conditionArrival = "Late";
        }
        int calculatedHour = Math.abs(difference / 60);
        int calculatedMinutes = Math.abs(difference % 60);

        switch (conditionArrival) {
            case "Late":
                System.out.println(conditionArrival);
                if (difference / 60 > 0) {
                    if (calculatedMinutes < 10) {
                        System.out.printf("%d:0%d hours after the start", calculatedHour, calculatedMinutes);
                    } else {
                        System.out.printf("%d:%d hours after the start", calculatedHour, calculatedMinutes);
                    }
                } else {
                    System.out.printf("%d minutes after the start", calculatedMinutes);
                }
                break;
            case "On time":
            case "Early":
                System.out.println(conditionArrival);
                if (difference != 0) {
                    if (calculatedHour > 0) {
                        if (calculatedMinutes < 10) {
                            System.out.printf("%d:0%d hours before the start", calculatedHour, calculatedMinutes);
                        } else {
                            System.out.printf("%d:%d hours before the start", calculatedHour, calculatedMinutes);
                        }
                    } else {
                        System.out.printf("%d minutes before the start", calculatedMinutes);
                    }
                }
                break;
            default:
                break;
        }

    }
}
