package ProgrammingBasics.Basics_While_Loop;

import java.util.Scanner;

public class E02ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int countFails = 0;
        int problemsCount = 0;
        double sumGrades = 0;
        String lastProblem = "";
        boolean isFailed = true;

        while (countFails < n) {
            String problemName = scanner.nextLine();
            if (problemName.equals("Enough")) {
                isFailed = false;
                break;
            }

            int grade = Integer.parseInt(scanner.nextLine());
            if (grade <= 4) {
                countFails++;
            }
            sumGrades += grade;
            problemsCount++;
            lastProblem = problemName;
        }

        if (isFailed) {
            System.out.printf("You need a break, %d poor grades.", countFails);
        } else {
            System.out.printf("Average score: %.2f%n", sumGrades / problemsCount);
            System.out.printf("Number of problems: %d%n", problemsCount);
            System.out.printf("Last problem: %s%n", lastProblem);
        }
    }
}
