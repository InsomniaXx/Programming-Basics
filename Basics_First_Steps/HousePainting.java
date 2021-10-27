package ProgrammingBasics.Basics_First_Steps;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Височина на къщата
        double x = Double.parseDouble(scanner.nextLine());
        //Дължина на страничната стена
        double y = Double.parseDouble(scanner.nextLine());
        //Височина на триъгълната страна на покрива
        double h = Double.parseDouble(scanner.nextLine());

        double greenWalls = 3.4;
        double redRoof = 4.3;

        //Стени - 4 страни
        //Лицето на 1 сранична стена
        double areaSideWalls = 2 * (x * y) - 2 * (1.5 * 1.5);
        double areaBackWalls = 2 * (x * x) - 1.2 * 2;
        //Покрив - 4 страни
        double roofRectangle = 2 * (x * y);
        double roofTriangle = 2 * (x * h) / 2;

        double greenPaint = (areaSideWalls + areaBackWalls) / greenWalls;
        double redPaint = (roofRectangle + roofTriangle) / redRoof;

        System.out.printf("%.2f \n", greenPaint);
        System.out.printf("%.2f \n", redPaint);
    }
}
