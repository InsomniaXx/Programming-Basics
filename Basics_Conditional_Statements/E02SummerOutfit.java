package ProgrammingBasics.Basics_Conditional_Statements;

import java.util.Scanner;

public class E02SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int temperature = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();

        String outfit = "";
        String shoes = "";

        switch (time) {
            case "Morning":
                if (temperature >= 10 && temperature <= 18) {
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                } else if (temperature > 18 && temperature <= 24) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                }
                break;
            case "Afternoon":
                if (temperature >= 10 && temperature <= 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (temperature > 18 && temperature <= 24) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                } else {
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                }
                break;
            case "Evening":
                outfit = "Shirt";
                shoes = "Moccasins";
                break;
            default:
                break;

        }

        if (outfit != "" && shoes != "") {
            System.out.printf("It's %d degrees, get your %s and %s.", temperature, outfit, shoes);
        }
    }
}
