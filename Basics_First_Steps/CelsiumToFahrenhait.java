package ProgrammingBasics.Basics_First_Steps;

import java.util.Scanner;

public class CelsiumToFahrenhait {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double celsius = Double.parseDouble(scanner.nextLine());

        double fahrenheit = celsius * 1.8 + 32;

        System.out.printf("%.2f",fahrenheit);
    }
}
