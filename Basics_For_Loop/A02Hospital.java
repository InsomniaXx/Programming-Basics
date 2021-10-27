package ProgrammingBasics.Basics_For_Loop;

import java.util.Scanner;

public class A02Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int period = Integer.parseInt(scanner.nextLine());
        int countChecked = 0;
        int countUnchecked = 0;
        int countDoctors = 7;

        for (int i = 1; i <= period; i++) {
            int patients = Integer.parseInt(scanner.nextLine());
            if (i % 3 == 0) {
                if (countUnchecked > countChecked) {
                    countDoctors = countDoctors + 1;
                }
            }
            if (patients <= countDoctors) {
                countChecked = countChecked + patients;
            } else {
                countChecked = countChecked + countDoctors;
                countUnchecked = countUnchecked + Math.abs(patients - countDoctors);
            }
        }
        System.out.printf("Treated patients: %d.%n", countChecked);
        System.out.printf("Untreated patients: %d.%n", countUnchecked);
    }
}
