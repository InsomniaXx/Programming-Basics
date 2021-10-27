package ProgrammingBasics.Basics_Conditional_Statements;

import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lvIncome = Double.parseDouble(scanner.nextLine());
        double averageProgress = Double.parseDouble(scanner.nextLine());
        double minIncome = Double.parseDouble(scanner.nextLine());

        boolean socialScholarship = (lvIncome < minIncome) && averageProgress >= 4.50;
        boolean excellentScholar = averageProgress >= 5.50;

        double socialScholarPrice = minIncome * 35 / 100;
        double excellentScholarPrice = averageProgress * 25;


        if (socialScholarship && !excellentScholar) {
            System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(socialScholarPrice));
        } else if (excellentScholar && !socialScholarship) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(excellentScholarPrice));
        } else if (socialScholarship && excellentScholar) {
            if (socialScholarPrice > excellentScholarPrice) {
                System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(socialScholarPrice));
            } else {
                System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(excellentScholarPrice));
            }
        } else if (!socialScholarship && !excellentScholar) {
            System.out.printf("You cannot get a scholarship!");
        }


    }
}
