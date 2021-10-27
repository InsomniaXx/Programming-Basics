package ProgrammingBasics.Basics_Exam_Questions;

import java.util.Scanner;

public class E02MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentRecord = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timeInSeconds = Double.parseDouble(scanner.nextLine());

        double distanceInSeconds = distanceInMeters * timeInSeconds;
        double distanceWithDelay = (Math.floor(distanceInMeters / 50)) * 30;

        double timeGeorge = distanceInSeconds + distanceWithDelay;
        if (timeGeorge < currentRecord) {
            System.out.printf("Yes! The new record is %.2f seconds.", timeGeorge);
        } else {
            System.out.printf("No! He was %.2f seconds slower.", Math.abs(timeGeorge - currentRecord));
        }
    }
}
