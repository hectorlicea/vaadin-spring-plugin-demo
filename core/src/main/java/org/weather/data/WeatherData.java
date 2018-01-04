package org.weather.data;

import lombok.Getter;
import lombok.Setter;

/**
 * Weather data
 */
@Getter
@Setter
public class WeatherData {
    private String location;
    private Double latitude;
    private Double longitude;
    private String type;
    private Double value;
    private Double min;
    private Double max;

    public WeatherData(String location, Double latitude, Double longitude, String type, Double value){
        this(location, latitude, longitude, type, value, null, null);
    }

    public WeatherData(String location, Double latitude, Double longitude, String type, Double value, Double min, Double max){
        this.location = location;
        this.latitude = latitude;
        this.longitude = longitude;
        this.type = type;
        this.value = value;
        this.min = min;
        this.max = max;
    }
}
