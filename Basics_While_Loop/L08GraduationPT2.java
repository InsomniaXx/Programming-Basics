package ProgrammingBasics.Basics_While_Loop;

import java.util.Scanner;

public class L08GraduationPT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int counter = 1;
        double sum = 0;
        int excluded = 0;

        while (counter <= 12) {
            double grade = Double.parseDouble(scanner.nextLine());
             if (grade < 4.00) {
                 excluded += 1;
                 if (excluded > 1) {
                     System.out.printf("%s has been excluded at %d grade", name, counter - 1);
                     break;
                 }
             }
            sum += grade;
            counter++;
        }
        if (excluded == 0) {
            double average = sum / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, average);
        }
    }
}
