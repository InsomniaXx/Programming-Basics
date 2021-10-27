package ProgrammingBasics.Basics_First_Steps;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Цена на скумрия
        double priceMackerel = Double.parseDouble(scanner.nextLine());
        //Цена на цаца
        double priceSprat = Double.parseDouble(scanner.nextLine());
        //Килограм паламуд
        double kgBonito = Double.parseDouble(scanner.nextLine());
        //Килограм сафрид
        double kgScad = Double.parseDouble(scanner.nextLine());
        //килограм миди
        int kgClams = Integer.parseInt(scanner.nextLine());

        //Цена паламуд
        double priceBonito = priceMackerel + priceMackerel * 60 / 100;
        //Цена сафрид
        double priceScad = priceSprat + priceSprat * 80 / 100;
        //Цена миди
        double priceClams = 7.50;

        double totalSum = kgBonito * priceBonito + kgScad * priceScad + kgClams * priceClams;
        System.out.printf("%.2f", totalSum);

    }
}
