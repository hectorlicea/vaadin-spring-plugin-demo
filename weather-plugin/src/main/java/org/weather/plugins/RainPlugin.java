package org.weather.plugins;

import org.weather.plugin.WeatherComponent;
import org.weather.plugin.WeatherPlugin;
import org.weather.data.WeatherData;
import org.springframework.stereotype.Component;

/**
 * Rain plugin. {@link WeatherPlugin} implementation
 */
@Component
public class RainPlugin  implements WeatherPlugin {
    @Override
    public boolean supports(String s) {
        return "rain".equals(s);
    }

    @Override
    public WeatherComponent getComponent(WeatherData data) {
        WeatherComponent component = new RainComponent();
        component.setWeatherData(data);
        return component;
    }
}
