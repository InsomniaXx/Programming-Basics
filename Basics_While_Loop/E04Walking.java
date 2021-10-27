package ProgrammingBasics.Basics_While_Loop;

import java.util.Scanner;

public class E04Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 10000;
        String input = scanner.nextLine();
        int countSteps = 0;

        while (countSteps <= n) {
            if (input.equals("Going home")) {
                int stepsToHome = Integer.parseInt(scanner.nextLine());
                countSteps += stepsToHome;
                break;
            }
            int stepsRecoded = Integer.parseInt(input);
            countSteps += stepsRecoded;
            if (countSteps <= n) {
                input = scanner.nextLine();
            }
        }
        if (countSteps >= n) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", countSteps - n);
        } else {
            System.out.printf("%d more steps to reach goal.", Math.abs(countSteps - n));
        }
    }
}
