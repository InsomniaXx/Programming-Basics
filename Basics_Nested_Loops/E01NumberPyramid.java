package ProgrammingBasics.Basics_Nested_Loops;

import java.util.Scanner;

public class E01NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean isEqual = false;

        for (int rows = 1; rows <= n; rows++) {
            for (int col = 1; col <= rows; col++) {
                counter++;
                if (counter > n) {
                    isEqual = true;
                    break;
                }
                System.out.print(counter + " ");
            }
            if (isEqual) {
                break;
            }
            System.out.println();
        }
    }
}
