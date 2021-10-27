package ProgrammingBasics.Basics_For_Loop;

import java.util.Scanner;

public class A07FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double countFans = Integer.parseInt(scanner.nextLine());

        int countSectorA = 0;
        int countSectorB = 0;
        int countSectorV = 0;
        int countSectorG = 0;

        for (int i = 1; i <= countFans; i++) {
            String sector = scanner.nextLine();

            switch (sector) {
                case "A":
                    countSectorA = countSectorA + 1;
                    break;
                case "B":
                    countSectorB = countSectorB + 1;
                    break;
                case "V":
                    countSectorV = countSectorV + 1;
                    break;
                case "G":
                    countSectorG = countSectorG + 1;
                    break;
                default:
                    break;
            }
        }

        double countAverageFans = countFans / n * 100.0;

        System.out.printf("%.2f%%%n", countSectorA / countFans * 100.0);
        System.out.printf("%.2f%%%n", countSectorB / countFans * 100.0);
        System.out.printf("%.2f%%%n", countSectorV / countFans * 100.0);
        System.out.printf("%.2f%%%n", countSectorG / countFans * 100.0);
        System.out.printf("%.2f%%%n", countAverageFans);
    }
}
