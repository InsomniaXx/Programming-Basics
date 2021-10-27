package ProgrammingBasics.Basics_Conditional_Statements;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        Double h = Double.parseDouble(scanner.nextLine());

        double firstPipe = p1 * h;
        double secondPipe = p2 * h;
        double bothPipes = firstPipe + secondPipe;

        double percentageFull = (bothPipes / v) * 100;
        double percentageFirstPipe = (firstPipe / bothPipes) * 100;
        double percentageSecondPipe = (secondPipe / bothPipes) * 100;


        if (bothPipes <= v) {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", percentageFull, percentageFirstPipe, percentageSecondPipe);

        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", h, Math.abs(firstPipe + secondPipe - v));
        }

    }
}
