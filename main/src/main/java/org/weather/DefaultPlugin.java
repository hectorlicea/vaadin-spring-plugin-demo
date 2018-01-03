package org.weather;

import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import org.weather.plugin.AbstractWeatherComponent;
import org.weather.plugin.WeatherComponent;
import org.weather.plugin.WeatherPlugin;
import org.weather.data.WeatherData;

/**
 * Default plugin. {@link WeatherPlugin} implementation
 */
public class DefaultPlugin implements WeatherPlugin {
    @Override
    public boolean supports(String s) {
        return false;
    }

    @Override
    public WeatherComponent getComponent(WeatherData data) {
        WeatherComponent component = new Default();
        component.setWeatherData(data);
        return component;
    }

    /**
     * {@link WeatherComponent} implementation to show weather data
     */
    private class Default extends AbstractWeatherComponent {

        public Default(){
            super();
        }

        @Override
        protected void buildComponent() {
        }

        @Override
        public void setWeatherData(WeatherData data) {
            setLocationData(data.getLocation(), data.getLatitude() , data.getLongitude());
        }
    }
}
