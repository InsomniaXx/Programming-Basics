package ProgrammingBasics.Basics_First_Steps;

import java.util.Scanner;

public class RadianToDegree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double radian = Double.parseDouble(scanner.nextLine());
        // Double degree = radian * 180 / 3.14;
        Double degree = radian * 180 / Math.PI;
        System.out.printf("%.0f", degree);
    }
}
