package ProgrammingBasics.Basics_Conditional_Statements;

import java.util.Scanner;

public class L07WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();
        String openOrClose = "";

       switch (day) {
           case "Monday":
           case "Tuesday":
           case "Wednesday":
           case "Thursday":
           case "Friday":
           case "Saturday":
               if (hour >= 10 && hour <= 18) {
                   openOrClose = "open";
               } else {
                   openOrClose = "closed";
               }
               break;
           case "Sunday":
               openOrClose = "closed";
               break;
       }

        System.out.println(openOrClose);
    }
}
