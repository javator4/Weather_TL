package pl.sda.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Current {

    private int last_updated_epoch;
    private String last_updated;
    private int temp_c;
    private int temp_f;
    private int is_day;
    private float wind_mph;
    private float wind_kph;
    private int wind_degree;
    private String wind_dir;
    private int pressure_mb;
    private float pressure_in;
    private int precip_mm;
    private int precip_in;
    private int humidity;
    private int cloud;
    private float feelslike_c;
    private float feelslike_f;
    private int vis_km;
    private int vis_miles;
    private int uv;
    private float gust_mph;
    private float gust_kph;
    private Condition condition;


}
