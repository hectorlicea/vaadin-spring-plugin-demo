package org.location.weather.plugins;

import org.location.plugin.LocationComponent;
import org.location.plugin.LocationPlugin;
import org.location.data.LocationData;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Temperature plugin. {@link LocationPlugin} implementation
 */
@Component
public class TemperaturePlugin implements LocationPlugin {
    private ApplicationContext context;

    public TemperaturePlugin(ApplicationContext context){
        this.context = context;
    }

    @Override
    public boolean supports(String s) {
        return "temperature".equals(s);
    }

    @Override
    public com.vaadin.ui.Component getComponent(LocationData data) {
        // ApplicationContext return new instance of TemperatureComponent bean
        TemperatureComponent temperature = context.getBean(TemperatureComponent.class);
        temperature.setLocationData(data);

        return temperature;
    }
}
