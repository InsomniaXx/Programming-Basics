package ProgrammingBasics.Basics_Conditional_Statements;

import java.util.Scanner;

public class E09Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String leapVsNormal = scanner.nextLine();
        int p = Integer.parseInt(scanner.nextLine()); // брой празници в годината (които не са събота и неделя).
        int h = Integer.parseInt(scanner.nextLine()); // брой уикенди, в които Влади си пътува до родния град.

        double timesPlayedVolleyball = (48 - h) * 3 / 4.0 + h + p * 2 / 3.0;

        if (leapVsNormal.equals("leap")) {
            timesPlayedVolleyball = timesPlayedVolleyball + timesPlayedVolleyball * 0.15;
        }

        System.out.printf("%.0f", Math.floor(timesPlayedVolleyball));
    }
}
