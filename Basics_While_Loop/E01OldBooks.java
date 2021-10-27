package ProgrammingBasics.Basics_While_Loop;

import java.util.Scanner;

public class E01OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String book = scanner.nextLine();
        String input = scanner.nextLine();
        int counter = 0;
        boolean hasBook = false;

        while (!input.equals("No More Books")) {
            if (input.equals(book)) {
                hasBook = true;
                break;
            }
            counter++;
            input = scanner.nextLine();
        }

        if (hasBook) {
            System.out.printf("You checked %d books and found it.", counter);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", counter);
        }
    }
}
