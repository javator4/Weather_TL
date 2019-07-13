package pl.sda;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;
import pl.sda.model.Current;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;

public class WeatherService {

    private String url;
    private String apiKey;
    private String finalUrl;

    public WeatherService(String url, String apikey) {
       this.url = url;
       this.apiKey = apikey;
        this.finalUrl = this.url + "?key=" + this.apiKey+ "&q=";
    }

    public Current getCityWeather(String city) {
        this.finalUrl += city;
        //Current current = new Current();
        Current current = new Current();
        try {
            String data = IOUtils.toString(new URL(this.finalUrl), Charset.forName("UTF-8"));
            JSONObject jsonObject = new JSONObject(data);
            String temp = jsonObject.getJSONObject("current").get("temp_c").toString();
            //System.out.println(temp);

            //Current current = new Current();
            current.setTemp_c(Float.parseFloat(temp));
            temp = jsonObject.getJSONObject("current").get("temp_f").toString();
            current.setTemp_f(Float.parseFloat(temp));
             temp = jsonObject.getJSONObject("current").get("wind_kph").toString();
            current.setWind_kph(Float.parseFloat(temp));
             temp = jsonObject.getJSONObject("current").get("last_updated").toString();
            current.setLast_updated(temp);
            temp = jsonObject.getJSONObject("current").get("wind_dir").toString();
            current.setWind_dir(temp);
             temp = jsonObject.getJSONObject("current").get("feelslike_c").toString();
            current.setFeelslike_c(Float.parseFloat(temp));
             temp = jsonObject.getJSONObject("current").get("feelslike_f").toString();
            current.setFeelslike_f(Float.parseFloat(temp));
            temp = jsonObject.getJSONObject("current").get("vis_km").toString();
            current.setVis_km(Float.parseFloat(temp));
           //return current;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return current;
    }
}
