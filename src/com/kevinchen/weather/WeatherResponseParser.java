/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kevinchen
 */

import java.text.SimpleDateFormat;
import java.util.Date;

import org.json.JSONArray;
import org.json.JSONObject;

public class WeatherResponseParser {

    public void parseAndPrint(String jsonResponse) {
        JSONObject jsonObject = new JSONObject(jsonResponse);

        if (jsonObject.getInt("cod") == 200) {
            System.out.println("Weather forecase for city: ");
            JSONArray forecasts = jsonObject.getJSONArray("list");
            for (int i = 0; i < forecasts.length(); i++) {
                JSONObject forecast = forecasts.getJSONObject(i);
                long timestamp = forecast.getLong("dt");
                String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date(timestamp * 1000));
                double temperature = forecast.getJSONObject("main").getDouble("temp");
                String description = forecast.getJSONArray("weather").getJSONObject(0).getString("description");
                int humidity = forecast.getJSONObject("main").getInt("humidity");

                System.out.println(date + ": " + temperature + "°C, " + description + ", humidity: " + humidity + "%");
            }
        } else {
            System.out.println("Request contains an error");
        }
    }
}
