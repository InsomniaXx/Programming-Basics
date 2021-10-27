package ProgrammingBasics.Basics_First_Steps;

import java.util.Scanner;

public class WeatherForecast2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double degree = Double.parseDouble(scanner.nextLine());

        if (degree >= 26.00) {
            if (degree <= 35.00) {
                System.out.println("Hot");
            } else {
                System.out.println("unknown");
            }
        } else if (degree >= 20.1) {
            if (degree <= 25.9) {
                System.out.println("Warm");
            } else {
                System.out.println("unknown");
            }
        } else if (degree >= 15.00) {
            if (degree <= 20.00) {
                System.out.println("Mild");
            } else {
                System.out.println("unknown");
            }
        } else if (degree >= 12.00) {
            if (degree <= 14.9) {
                System.out.println("Cool");
            } else {
                System.out.println("unknown");
            }
        } else if (degree >= 5.00) {
            if (degree <= 11.9) {
                System.out.println("Cold");
            } else {
                System.out.println("unknown");
            }
        } else {
            System.out.println("unknown");
        }
    }
}
