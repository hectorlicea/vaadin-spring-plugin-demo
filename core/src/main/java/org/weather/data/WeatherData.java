package org.weather.data;

import lombok.Getter;
import lombok.Setter;

/**
 * Weather data
 */
@Getter
@Setter
public class WeatherData {
    private String type;
    private String location;
    private Double latitude;
    private Double longitude;
    private Double value;
    private Double min;
    private Double max;

    public WeatherData(String type, String location, Double latitude, Double longitude, Double value){
        this(type, location, latitude, longitude, value, null, null);
    }

    public WeatherData(String type, String location, Double latitude, Double longitude, Double value, Double min, Double max){
        this.type = type;
        this.location = location;
        this.latitude = latitude;
        this.longitude = longitude;
        this.value = value;
        this.min = min;
        this.max = max;
    }
}
