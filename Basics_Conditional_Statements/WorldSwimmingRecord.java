package ProgrammingBasics.Basics_Conditional_Statements;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentRecord = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timeInSeconds = Double.parseDouble(scanner.nextLine());

        double score = distanceInMeters * timeInSeconds;

        double reducedScore = Math.floor(distanceInMeters / 15);
        double finalScore = (score + (reducedScore * 12.5));

        if (finalScore < currentRecord) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", finalScore);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", Math.abs(finalScore - currentRecord));
        }
    }
}
