package org.weather.service;

import org.weather.data.WeatherData;

import java.util.List;

/**
 * Service interface
 */
public interface WeatherService {

    /**
     * Return list of WeatherData
     *
     * @return list
     */
    List<WeatherData> loadWeatherData();
}
