package org.weather.plugins;

import org.weather.data.WeatherData;
import org.weather.plugin.WeatherComponent;
import org.weather.plugin.WeatherPlugin;
import org.springframework.stereotype.Component;

/**
 * Wind plugin. {@link WeatherPlugin} implementation
 */
@Component
public class WindPlugin implements WeatherPlugin {
    @Override
    public boolean supports(String s) {
        return "wind".equals(s);
    }

    @Override
    public WeatherComponent getComponent(WeatherData data) {
        WeatherComponent component = new WindComponent();
        component.setWeatherData(data);
        return component;
    }
}
