package ProgrammingBasics.Basics_First_Steps;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // широчина
        double w = Double.parseDouble(scanner.nextLine());
        //височина
        double h = Double.parseDouble(scanner.nextLine());

        //дължина работно място
        double wStation = 70;
        //ширина работно място
        double hStation = 120;
        // брой места на ред
        double stationPerRow = (h * 100 - 100) / 70;
        int stationRowInt = (int)stationPerRow;
        //брой места на колона
        double stationPerColumn = w * 100  / 120;
        int stationColumnInt = (int)stationPerColumn;
        //брой възможни места
        int availableStations = stationRowInt * stationColumnInt - 3;


        System.out.println(availableStations);


    }
}
