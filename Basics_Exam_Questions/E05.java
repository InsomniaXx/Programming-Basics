package ProgrammingBasics.Basics_Exam_Questions;

import java.util.Scanner;

public class E05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalClimbedMetres = 5364;
        String input = scanner.nextLine();
        int countDays = 1;
        boolean isReached = false;
        boolean isDaysPassed = false;

        for (int i = 1; i <= 5; i++) {
            //countDays++;
            while (!input.equals("END")) {

                String sleep = scanner.nextLine();
                int climbedMetres = Integer.parseInt(sleep);

                if (input.equals("Yes")) {
                    countDays++;
                }

                if (countDays > 5) {
                    isDaysPassed = true;
                    break;
                }

                totalClimbedMetres += climbedMetres;

                if (totalClimbedMetres >= 8848) {
                    isReached = true;
                    break;
                }

                input = scanner.nextLine();
            }
            if (isReached) {
                break;
            }
            if (isDaysPassed) {
                break;
            }
        }

        if (isReached) {
            System.out.printf("Goal reached for %d days!", countDays);
        } else {
            System.out.println("Failed!");
            System.out.printf("%d", totalClimbedMetres);
        }

    }
}
