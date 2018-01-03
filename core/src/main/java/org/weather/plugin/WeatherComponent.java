package org.weather.plugin;

import com.vaadin.ui.Component;
import org.weather.data.WeatherData;

/**
 * Weather component interface
 */
public interface WeatherComponent extends Component {

    /**
     * Update data in component.
     *
     * @param data Weather data
     */
    void setWeatherData(WeatherData data);

}
