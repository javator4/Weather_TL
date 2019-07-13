package pl.sda;

import pl.sda.model.Current;

public class WeatherService {


    private String finalUrl;

    public WeatherService(String url, String key) {
        finalUrl = url + "?key=" + key + "&q=";
    }

    public Current getCityWeather(String city) {
        finalUrl += city;
        Current current = new Current();
        return current;
    }
}
