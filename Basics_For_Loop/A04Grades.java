package ProgrammingBasics.Basics_For_Loop;

import java.util.Scanner;

public class A04Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double gradeTill3 = 0;
        double gradeTill4 = 0;
        double gradeTill5 = 0;
        double gradeTill6 = 0;

        double countGrades = 0;
        for (int i = 1; i <= n; i++) {
            double studentGrade = Double.parseDouble(scanner.nextLine());

            if (studentGrade >= 2.00 && studentGrade <= 2.99) {
                gradeTill3 = gradeTill3 + 1;
            } else if (studentGrade >= 3.00 && studentGrade <= 3.99) {
                gradeTill4 = gradeTill4 + 1;
            } else if (studentGrade >= 4.00 && studentGrade <= 4.99) {
                gradeTill5 = gradeTill5 + 1;
            } else if (studentGrade >= 5.00) {
                gradeTill6 = gradeTill6 + 1;
            }

            countGrades = countGrades + studentGrade;
        }

        double averageGrade = countGrades / n;
        double percentageTill3 = gradeTill3 / n * 100.0;
        double percentageTill4 = gradeTill4 / n * 100.0;
        double percentageTill5 = gradeTill5 / n * 100.0;
        double percentageTill6 = gradeTill6 / n * 100.0;

        System.out.printf("Top students: %.2f%%%n", percentageTill6);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", percentageTill5);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", percentageTill4);
        System.out.printf("Fail: %.2f%%%n", percentageTill3);
        System.out.printf("Average: %.2f%n", averageGrade);
    }
}
