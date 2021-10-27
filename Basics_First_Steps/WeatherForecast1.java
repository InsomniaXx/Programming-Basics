package ProgrammingBasics.Basics_First_Steps;

import java.util.Scanner;

public class WeatherForecast1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String weather = scanner.nextLine();
        String sunnyWeather = "sunny";

        if (weather.equals(sunnyWeather)) {
            System.out.println("It's warm outside!");
        } else {
            System.out.println("It's cold outside!");
        }
    }
}
