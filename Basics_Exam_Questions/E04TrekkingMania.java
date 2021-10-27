package ProgrammingBasics.Basics_Exam_Questions;

import java.util.Scanner;

public class E04TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countGroupClimbers = Integer.parseInt(scanner.nextLine());
        int countTotalClimbers = 0;
        double countMusala = 0;
        double countMontBlanc = 0;
        double countKilimanjaro = 0;
        double countK2 = 0;
        double countEverest = 0;

        for (int i = 1; i <= countGroupClimbers; i++) {
            int climbersFromGroup = Integer.parseInt(scanner.nextLine());
            countTotalClimbers += climbersFromGroup;
            if (climbersFromGroup <= 5) {
                countMusala += climbersFromGroup;
            }
            if (climbersFromGroup >= 6 && climbersFromGroup <= 12) {
                countMontBlanc += climbersFromGroup;
            }
            if (climbersFromGroup >= 13 && climbersFromGroup <= 25) {
                countKilimanjaro += climbersFromGroup;
            }
            if (climbersFromGroup >= 26 && climbersFromGroup <= 40) {
                countK2 += climbersFromGroup;
            }
            if (climbersFromGroup >= 41) {
                countEverest += climbersFromGroup;
            }
        }

        System.out.printf("%.2f%%%n", (countMusala / countTotalClimbers) * 100);
        System.out.printf("%.2f%%%n", (countMontBlanc / countTotalClimbers) * 100);
        System.out.printf("%.2f%%%n", (countKilimanjaro / countTotalClimbers) * 100);
        System.out.printf("%.2f%%%n", (countK2 / countTotalClimbers) * 100);
        System.out.printf("%.2f%%%n", (countEverest / countTotalClimbers) * 100);
    }
}
