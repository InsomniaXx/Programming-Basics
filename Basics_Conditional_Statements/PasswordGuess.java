package ProgrammingBasics.Basics_Conditional_Statements;

import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phrase = "s3cr3t!P@ssw0rd";
        String password = scanner.nextLine();

        boolean isCorrect = password.equals(phrase);

        if (isCorrect) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }

    }
}
