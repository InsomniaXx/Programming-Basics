package ProgrammingBasics.Basics_While_Loop;

import java.util.Scanner;

public class L01ReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        while (!name.equals("Stop")) {
            System.out.println(name);
            name = scanner.nextLine();
        }
    }
}
