package ProgrammingBasics.Basics_Exam_Questions;

import java.util.Scanner;

public class E04Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int countPoints = 0;
        int countRed = 0;
        int countOrange = 0;
        int countYellow = 0;
        int countWhite = 0;
        int countOthers = 0;
        int countBlackDivision = 0;

        for (int i = 1; i <= n; i++) {
            String colorBall = scanner.nextLine();

            switch (colorBall) {
                case "red":
                    countRed++;
                    countPoints += 5;
                    break;
                case "orange":
                    countOrange++;
                    countPoints += 10;
                    break;
                case "yellow":
                    countYellow++;
                    countPoints += 15;
                    break;
                case "white":
                    countWhite++;
                    countPoints += 20;
                    break;
                case "black":
                    countBlackDivision++;
                    countPoints /= 2;
                    break;
                default:
                    countOthers++;
                    break;
            }
        }
        System.out.printf("Total points: %d%n", countPoints);
        System.out.printf("Points from red balls: %d%n", countRed);
        System.out.printf("Points from orange balls: %d%n", countOrange);
        System.out.printf("Points from yellow balls: %d%n", countYellow);
        System.out.printf("Points from white balls: %d%n", countWhite);
        System.out.printf("Other colors picked: %d%n", countOthers);
        System.out.printf("Divides from black balls: %d%n", countBlackDivision);


    }
}
