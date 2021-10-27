package ProgrammingBasics.Basics_While_Loop;

import java.util.Scanner;

public class E05Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double price = Double.parseDouble(scanner.nextLine());
        double countCoins = 0;

        price = price * 100;

        while (price > 0) {
            if (price >= 200) {
                countCoins ++;
                price -= 200;
            } else if (price >= 100) {
                countCoins ++;
                price -= 100;
            } else if (price >= 50) {
                countCoins ++;
                price -= 50;
            } else if (price >= 20) {
                countCoins ++;
                price -= 20;
            } else if (price >= 10) {
                countCoins ++;
                price -= 10;
            } else if (price >= 5) {
                countCoins ++;
                price -= 5;
            } else if (price >= 2) {
                countCoins ++;
                price -= 2;
            } else if (price >= 1) {
                countCoins ++;
                price -= 1;
            } else {
                break;
            }
        }
        System.out.printf("%.0f",countCoins);
    }
}
