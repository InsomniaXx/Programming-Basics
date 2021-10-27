package ProgrammingBasics.Basics_Exam_Questions;

import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int digit1_first = (n / 1000) % 10;
        int digit2_first = (n / 100) % 10;
        int digit3_first = (n / 10) % 10;
        int digit4_first = (n / 1) % 10;

        boolean abcd = false;
        boolean dcba = false;
        boolean nothing = false;

        for (int a = 1; a <= 9; a++) { // 1
            for (int b = 9; b >= a; b--) { // 9
                for (int c = 0; c <= 9; c++) { // 8
                    for (int d = 9 - 1; d >= c; d--) { // 1
                        if ((a + b + c + d) == (a * b * c * d)) {
                            //if ((n < 1000 && (n / 100) % 10 == 5) || n >= 1000 && (n / 1000) % 10 == 5){
                            if (n % 10 == 5) {
                                abcd = true;
                                System.out.println(a * 1000 + b * 100 + c * 10 + d);
                                break;
                            }
                        } else if ((a * b * c * d) / (a + b + c + d) == 3) {
                            if (n % 3 == 0) {
                                dcba = true;
                                System.out.println(d * 1000 + c * 100 + b * 10 + a);
                                break;
                            }
                        }
                    }
                    if (abcd || dcba) {
                        break;
                    }
                }
                if (abcd || dcba) {
                    break;
                }
            }
            if (abcd || dcba) {
                break;
            }
        }

        if (!abcd && !dcba) {
            System.out.println("Nothing found");
        }

    }
}
