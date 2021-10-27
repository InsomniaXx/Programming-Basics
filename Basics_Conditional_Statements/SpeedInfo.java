package ProgrammingBasics.Basics_Conditional_Statements;

import java.util.Scanner;

public class SpeedInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double speed = Double.parseDouble(scanner.nextLine());
        String slowSpeed = "slow";
        String averageSpeed = "average";
        String fastSpeed = "fast";
        String ultraFastSpeed = "ultra fast";
        String extremelyFastSpeed = "extremely fast";

        if (speed <= 10) {
            System.out.println(slowSpeed);
        } else if (speed > 10 && speed <= 50) {
            System.out.println(averageSpeed);
        } else if (speed > 50 && speed <= 150) {
            System.out.println(fastSpeed);
        } else if (speed > 150 && speed <= 1000) {
            System.out.println(ultraFastSpeed);
        } else if (speed > 1000) {
            System.out.println(extremelyFastSpeed);
        }
    }
}
