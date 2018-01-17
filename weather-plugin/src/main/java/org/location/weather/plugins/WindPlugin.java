package org.location.weather.plugins;

import org.location.data.LocationData;
import org.location.plugin.LocationComponent;
import org.location.plugin.LocationPlugin;
import org.springframework.stereotype.Component;

/**
 * Wind plugin. {@link LocationPlugin} implementation
 */
@Component
public class WindPlugin implements LocationPlugin {
    @Override
    public boolean supports(String s) {
        return "wind".equals(s);
    }

    @Override
    public com.vaadin.ui.Component getComponent(LocationData data) {
        LocationComponent component = new WindComponent();
        component.setLocationData(data);
        return component;
    }
}
