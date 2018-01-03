package org.weather.plugin;

import org.weather.data.WeatherData;
import org.springframework.plugin.core.Plugin;

/**
 * Plugin interface
 */
public interface WeatherPlugin extends Plugin<String> {
    /**
     * Return component
     *
     * @param data Weather data
     * @return {@link WeatherComponent}
     */
    WeatherComponent getComponent(WeatherData data);
}
