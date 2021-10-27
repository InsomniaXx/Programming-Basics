package ProgrammingBasics.Basics_Exam_Questions;

import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double countLitres = 0;
        double countDegrees = 0;

        for (int i = 1; i <= days; i++) {
            double quantityRakia = Double.parseDouble(scanner.nextLine());
            double degreeRakia = Double.parseDouble(scanner.nextLine());

            countLitres += quantityRakia;
            countDegrees += quantityRakia * degreeRakia;
        }

        System.out.printf("Liter: %.2f%n", countLitres);
        System.out.printf("Degrees: %.2f%n", countDegrees / countLitres);

        if (countDegrees / countLitres < 38) {
            System.out.printf("Not good, you should baking!");
        } else if (countDegrees / countLitres >= 38 && countDegrees / countLitres <= 42) {
            System.out.printf("Super!");
        } else {
            System.out.printf("Dilution with distilled water!");
        }
    }
}
