package ProgrammingBasics.Basics_Conditional_Statements;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        double bonusNumber = 0;
        double additionalBonus = 0;

        if (startNumber <= 100) {
            bonusNumber = 5;
        } else if (startNumber > 100 && startNumber <= 1000) {
            bonusNumber = startNumber * 0.2;
        } else if (startNumber > 1000){
            bonusNumber = startNumber * 0.1;
        }

        if (startNumber % 2 == 0) {
            additionalBonus = 1;
        } else if (startNumber % 5 == 0) {
            additionalBonus = 2;
        }

        double sumBonus = bonusNumber + additionalBonus;
        double total = startNumber + sumBonus;


        System.out.println(sumBonus);
        System.out.println(total);

    }
}
