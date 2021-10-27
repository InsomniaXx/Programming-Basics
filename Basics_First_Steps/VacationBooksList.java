package ProgrammingBasics.Basics_First_Steps;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bookLists = Integer.parseInt(scanner.nextLine());
        int listsPerHour = Integer.parseInt(scanner.nextLine());
        int daysToRead = Integer.parseInt(scanner.nextLine());

        int totalRead = bookLists / listsPerHour;
        int totalPerHour = totalRead / daysToRead;

        System.out.println(totalPerHour);
    }
}
