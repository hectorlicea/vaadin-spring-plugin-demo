package org.weather.plugins;

import org.weather.plugin.WeatherComponent;
import org.weather.plugin.WeatherPlugin;
import org.weather.data.WeatherData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Temperature plugin. {@link WeatherPlugin} implementation
 */
@Component
public class TemperaturePlugin implements WeatherPlugin {
    private ApplicationContext context;

    public TemperaturePlugin(ApplicationContext context){
        this.context = context;
    }

    @Override
    public boolean supports(String s) {
        return "temperature".equals(s);
    }

    @Override
    public WeatherComponent getComponent(WeatherData data) {
        // ApplicationContext return new instance of TemperatureComponent bean
        TemperatureComponent temperature = context.getBean(TemperatureComponent.class);
        temperature.setWeatherData(data);

        return temperature;
    }
}
