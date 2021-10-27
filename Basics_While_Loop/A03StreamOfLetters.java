package ProgrammingBasics.Basics_While_Loop;

import java.util.Scanner;

public class A03StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder builder = new StringBuilder();
        StringBuilder temporaryBuilder = new StringBuilder();
        int countC = 0;
        int countO = 0;
        int countN = 0;

        while (!input.equals("End")) {
            String letter = input;

            if (letter.matches("[A-Za-z]")) {
                if (letter.equals("c")) {
                    countC++;
                    if (countC > 1) {
                        temporaryBuilder.append(letter);
                    }
                } else if (letter.equals("o")) {
                    countO++;
                    if (countO > 1) {
                        temporaryBuilder.append(letter);
                    }
                } else if (letter.equals("n")) {
                    countN++;
                    if (countN > 1) {
                        temporaryBuilder.append(letter);
                    }
                } else {
                    temporaryBuilder.append(letter);
                }
            }
            if (countC > 0 && countN > 0 && countO > 0) {
                builder.append(temporaryBuilder);
                builder.append(" ");

                countC = 0;
                countN = 0;
                countO = 0;

                temporaryBuilder.setLength(0);
            }
            input = scanner.nextLine();
        }
        System.out.println(builder.toString());
    }
}
