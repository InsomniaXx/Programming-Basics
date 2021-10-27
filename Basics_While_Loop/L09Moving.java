package ProgrammingBasics.Basics_While_Loop;

import java.util.Scanner;

public class L09Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int area = width * length * height;
        boolean hasVolume = true;
        String input = scanner.nextLine();

        while (!input.equals("Done")) {
            int box = Integer.parseInt(input);
            area -= box;

            if (area < 0) {
                hasVolume = false;
                break;
            }
            input = scanner.nextLine();

        }
            if (hasVolume) {
                System.out.printf("%d Cubic meters left.", Math.abs(area));
            } else {
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(area));
            }
    }
}
