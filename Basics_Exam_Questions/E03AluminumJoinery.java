package ProgrammingBasics.Basics_Exam_Questions;

import java.util.Scanner;

public class E03AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countJoinery = Integer.parseInt(scanner.nextLine());
        String typeJoinery = scanner.nextLine();
        String deliveryType = scanner.nextLine();
        double priceJoinery = 0;

        switch (typeJoinery) {
            case "90X130":
                priceJoinery = countJoinery * 110;
                if (countJoinery > 30 && countJoinery < 60) {
                    priceJoinery = priceJoinery - priceJoinery * 0.05;
                } else if (countJoinery > 60) {
                    priceJoinery = priceJoinery - priceJoinery * 0.08;
                }
                break;
            case "100X150":
                priceJoinery = countJoinery * 140;
                if (countJoinery > 40 && countJoinery <= 80) {
                    priceJoinery = priceJoinery - priceJoinery * 0.06;
                } else if (countJoinery > 80) {
                    priceJoinery = priceJoinery - priceJoinery * 0.1;
                }
                break;
            case "130X180":
                priceJoinery = countJoinery * 190;
                if (countJoinery > 20 && countJoinery <= 50) {
                    priceJoinery = priceJoinery - priceJoinery * 0.07;
                } else if (countJoinery > 50) {
                    priceJoinery = priceJoinery - priceJoinery * 0.12;
                }
                break;
            case "200X300":
                priceJoinery = countJoinery * 250;
                if (countJoinery > 25 && countJoinery <= 50) {
                    priceJoinery = priceJoinery - priceJoinery * 0.09;
                } else if (countJoinery > 50) {
                    priceJoinery = priceJoinery - priceJoinery * 0.14;
                }
                break;
            default:
                break;
        }
        if (countJoinery < 10) {
            System.out.println("Invalid order");
        } else {
            if (deliveryType.equals("With delivery")) {
                priceJoinery += 60;
            }
            if (countJoinery > 99) {
                priceJoinery = priceJoinery - priceJoinery * 0.04;
            }
            System.out.printf("%.2f BGN", priceJoinery);
        }
    }
}
