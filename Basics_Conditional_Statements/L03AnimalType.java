package ProgrammingBasics.Basics_Conditional_Statements;

import java.util.Scanner;

public class L03AnimalType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String animal = scanner.nextLine();
        String type = "";

       switch (animal) {
           case "dog":
               type = "mammal";
               break;
           case "crocodile":
           case "tortoise":
           case "snake":
               type = "reptile";
               break;
           default:
               type = "unknown";
               break;

       }

        System.out.println(type);

    }
}
