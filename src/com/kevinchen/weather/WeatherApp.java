/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author kevinchen
 */
public class WeatherApp {

    public static void main(String[] args) throws IOException {
        WeatherAPI api = new WeatherAPI();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a city name: ");
        String city = scanner.nextLine();
        String forecastString = api.getForecast(city);

        WeatherResponseParser parser = new WeatherResponseParser();
        parser.parseAndPrint(forecastString);
    }
}
