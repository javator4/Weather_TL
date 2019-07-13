package pl.sda;

import pl.sda.model.Current;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {


        WeatherService weatherService = new WeatherService("http://api.apixu.com/v1/current.json", "8a68548dd8364a969a581331191307");
        Current current = weatherService.getCityWeather("Torun");
        current.getTemp_c();
    }
}
