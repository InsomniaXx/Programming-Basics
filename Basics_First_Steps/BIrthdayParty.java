package ProgrammingBasics.Basics_First_Steps;

import java.util.Scanner;

public class BIrthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rent = Integer.parseInt(scanner.nextLine());

        double cakePrice = (rent * 20 /100);
        double drinksPrice = cakePrice - (cakePrice * 45 / 100);
        double animatorPrice = (rent / 3);

        double totalSum = rent + cakePrice + drinksPrice + animatorPrice;

        System.out.println(totalSum);
    }
}
