package ProgrammingBasics.Basics_Conditional_Statements;

import java.util.Scanner;

public class AreaOrFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeFigure = scanner.nextLine();

        String squareFigure = "square";
        String rectangleFigure = "rectangle";
        String circleFigure = "circle";
        String triangleFigure = "triangle";

        if (typeFigure.equals(squareFigure)) {
            double squareSide1 = Double.parseDouble(scanner.nextLine());
            double squareArea = squareSide1 * squareSide1;

            System.out.printf("%.3f", squareArea);

        } else if (typeFigure.equals(rectangleFigure)) {
            double rectangleSide1 = Double.parseDouble(scanner.nextLine());
            double rectangleSide2 = Double.parseDouble(scanner.nextLine());
            double rectangleArea = rectangleSide1 * rectangleSide2;

            System.out.printf("%.3f", rectangleArea);

        } else if (typeFigure.equals(circleFigure)) {
            double radiusCircle = Double.parseDouble(scanner.nextLine());

            double circleArea = Math.PI * radiusCircle * radiusCircle;
            System.out.printf("%.3f", circleArea);

        } else if (typeFigure.equals(triangleFigure)) {
            double triangleSide1 = Double.parseDouble(scanner.nextLine());
            double triangleHeight = Double.parseDouble(scanner.nextLine());

            double triangleArea = triangleSide1 * triangleHeight / 2;
            System.out.printf("%.3f", triangleArea);
        }

    }
}
