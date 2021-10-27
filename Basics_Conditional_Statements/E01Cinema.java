package ProgrammingBasics.Basics_Conditional_Statements;

import java.util.Scanner;

public class E01Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projectionType = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        double pricePerType = 0;

        switch (projectionType) {
            case "Premiere":
                pricePerType = 12;
                break;
            case "Normal":
                pricePerType = 7.50;
                break;
            case "Discount":
                pricePerType = 5;
                break;
            default:
                break;
        }

        double totalPrice = rows * columns * pricePerType;

        System.out.printf("%.2f leva", totalPrice);
    }
}
