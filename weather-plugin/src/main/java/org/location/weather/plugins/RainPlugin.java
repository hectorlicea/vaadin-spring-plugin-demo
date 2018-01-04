package org.location.weather.plugins;

import org.location.plugin.LocationComponent;
import org.location.plugin.LocationPlugin;
import org.location.data.LocationData;
import org.springframework.stereotype.Component;

/**
 * Rain plugin. {@link LocationPlugin} implementation
 */
@Component
public class RainPlugin  implements LocationPlugin {
    @Override
    public boolean supports(String s) {
        return "rain".equals(s);
    }

    @Override
    public LocationComponent getComponent(LocationData data) {
        LocationComponent component = new RainComponent();
        component.setLocationData(data);
        return component;
    }
}
