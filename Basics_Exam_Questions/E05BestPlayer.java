package ProgrammingBasics.Basics_Exam_Questions;

import java.util.Scanner;

public class E05BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        boolean hasHat_trick = false;
        boolean moreThan10 = false;
        int countGoals = Integer.MIN_VALUE;
        String bestPlayer = "";

        while (!input.equals("END")) {
            String playerName = input;
            int playerGoals = Integer.parseInt(scanner.nextLine());

            if (playerGoals > countGoals) {
                bestPlayer = playerName;
                countGoals = playerGoals;
            }
            if (playerGoals >= 3) {
                hasHat_trick = true;
            }
            if (playerGoals >= 10) {
                System.out.printf("%s is the best player!%n", playerName);
                System.out.printf("He has scored %d goals and made a hat-trick !!!", playerGoals);
                moreThan10 = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (!moreThan10) {
            System.out.printf("%s is the best player!%n", bestPlayer);
            if (hasHat_trick) {
                System.out.printf("He has scored %d goals and made a hat-trick !!!", countGoals);
            } else {
                System.out.printf("He has scored %d goals.", countGoals);
            }
        }
    }
}
