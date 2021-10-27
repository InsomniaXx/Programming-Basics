package ProgrammingBasics.Basics_For_Loop;

import java.util.Scanner;

public class E06Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());

        double countFacebook = 0;
        double countInstagram = 0;
        double countReddit = 0;
        double totalPenalty = 0;
        int count = 0;

        for (int i = 1; i <= n && (salary - totalPenalty > 0); i++) {
            count = count + i;
            String website = scanner.nextLine();

            switch (website) {
                case "Facebook":
                    countFacebook++;
                    break;
                case "Instagram":
                    countInstagram++;
                    break;
                case "Reddit":
                    countReddit++;
                    break;
                default:
                    break;
            }
            totalPenalty = countFacebook * 150 + countInstagram * 100 + countReddit * 50;
        }
        if (salary - totalPenalty > 0) {
            System.out.printf("%.0f", salary - totalPenalty);
        } else {
            System.out.println("You have lost your salary.");
        }
    }
}
