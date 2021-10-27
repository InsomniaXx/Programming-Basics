package ProgrammingBasics.Basics_For_Loop;

import java.util.Scanner;

public class E04Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double countP1 = 0;
        double countP2 = 0;
        double countP3 = 0;
        double countP4 = 0;
        double countP5 = 0;

        for (int i = 1; i <= n; i++) {
            double number = Double.parseDouble(scanner.nextLine());
             if (number < 200) {
                 countP1++;
             } else if (number >= 200 && number <= 399) {
                 countP2++;
             } else if (number >= 400 && number <= 599) {
                 countP3++;
             } else if (number >= 600 && number <= 799) {
                 countP4++;
             } else {
                 countP5++;
             }
        }

        double percentageP1 = countP1 / n * 100.0;
        double percentageP2 = countP2 / n * 100.0;
        double percentageP3 = countP3 / n * 100.0;
        double percentageP4 = countP4 / n * 100.0;
        double percentageP5 = countP5 / n * 100.0;

        System.out.printf("%.2f%%%n", percentageP1);
        System.out.printf("%.2f%%%n", percentageP2);
        System.out.printf("%.2f%%%n", percentageP3);
        System.out.printf("%.2f%%%n", percentageP4);
        System.out.printf("%.2f%%%n", percentageP5);
    }
}
