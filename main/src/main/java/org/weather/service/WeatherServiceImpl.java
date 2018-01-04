package org.weather.service;

import org.weather.data.WeatherData;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Service implementation
 */
@Service
public class WeatherServiceImpl implements WeatherService {

    @Override
    public List<WeatherData> loadWeatherData() {
        //Generate dummy weather data
        return Arrays.asList(new WeatherData("East", 20.173, -74.377, "rain", 95.0),
                new WeatherData("East",20.431,-74.734, "wind", 20.0),
                new WeatherData("East", 20.168, -74.212, "temperature", 31.0, 25.0, 36.0),
                new WeatherData("East", 20.168, -74.212, "pressure", 2010.0),
                new WeatherData("West", 20.755, -77.629,"rain", 62.0),
                new WeatherData("North",21.206,-76.365, "temperature", -5.0, -7.0, 0.0));
    }
}
