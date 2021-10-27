package ProgrammingBasics.Basics_Conditional_Statements;

import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        String metricType = scanner.nextLine();
        String outMetricType = scanner.nextLine();

        String millimeters = "mm";
        String meters = "m";
        String centimeters = "cm";

        if (outMetricType.equals(millimeters)) {
            if (metricType.equals(millimeters)) {
                System.out.printf("%.3f", number);
            } else if (metricType.equals(centimeters)) {
                System.out.printf("%.3f", number * 10);
            } else if (metricType.equals(meters)) {
                System.out.printf("%.3f", number * 1000);
            }

        } else if (outMetricType.equals(centimeters)) {
            if (metricType.equals(millimeters)) {
                System.out.printf("%.3f", number * 0.1);
            } else if (metricType.equals(centimeters)) {
                System.out.printf("%.3f", number);
            } else if (metricType.equals(meters)) {
                System.out.printf("%.3f", number * 100);
            }

        } else if (outMetricType.equals(meters)) {
            if (metricType.equals(millimeters)) {
                System.out.printf("%.3f", number * 0.001);
            } else if (metricType.equals(centimeters)) {
                System.out.printf("%.3f", number * 0.01);
            } else if (metricType.equals(meters)) {
                System.out.printf("%.3f", number);
            }

        }
    }
}
