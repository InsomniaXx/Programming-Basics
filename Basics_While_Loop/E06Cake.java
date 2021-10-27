package ProgrammingBasics.Basics_While_Loop;

import java.util.Scanner;

public class E06Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cakeLength = Integer.parseInt(scanner.nextLine());
        int cakeWidth = Integer.parseInt(scanner.nextLine());

        int cakeArea = cakeWidth * cakeLength;
        boolean isFinished = false;

        String input = scanner.nextLine();

        while (!input.equals("STOP")) {
            int cakePart = Integer.parseInt(input);
            cakeArea -= cakePart;
            if (cakeArea <= 0) {
                isFinished = true;
                break;
            }
            input = scanner.nextLine();
        }

        if (isFinished) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakeArea));
        } else {
            System.out.printf("%d pieces are left.", cakeArea);
        }

    }
}
