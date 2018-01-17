package org.location;

import com.vaadin.ui.Component;
import org.location.plugin.LocationComponent;
import org.location.plugin.LocationPlugin;
import org.location.data.LocationData;

/**
 * Default plugin. {@link LocationPlugin} implementation
 */
public class DefaultPlugin implements LocationPlugin {
    @Override
    public boolean supports(String s) {
        return false;
    }

    @Override
    public Component getComponent(LocationData data) {
        LocationComponent component = new Default();
        component.setLocationData(data);
        return component;
    }

    /**
     * {@link LocationComponent} implementation to show location data
     */
    private class Default extends LocationComponent {

        public Default(){
            super();
        }

        @Override
        protected void buildComponent() {
        }

        @Override
        public void setLocationData(LocationData data) {
            setLocationData(data.getLocation(), data.getLatitude() , data.getLongitude());
        }
    }
}
