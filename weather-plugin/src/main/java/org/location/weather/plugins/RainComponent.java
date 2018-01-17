package org.location.weather.plugins;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import org.location.plugin.LocationComponent;
import org.location.data.LocationData;

/**
 * {@link LocationComponent} implementation to show 'rain' weather data
 */
public class RainComponent extends LocationComponent {
    private Label type;
    private Label value;

    public RainComponent(){
        super();
    }

    @Override
    protected void buildComponent() {
        Component valueComp = buildValue();
        type = new Label(VaadinIcons.UMBRELLA.getHtml(), ContentMode.HTML);
        type.addStyleName(ValoTheme.LABEL_LARGE);
        setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);
        addComponents(type, valueComp);
    }

    private Component buildValue(){
        value = new Label();
        value.addStyleNames(ValoTheme.LABEL_BOLD,ValoTheme.LABEL_COLORED, ValoTheme.LABEL_HUGE);

        Label um = new Label("mm");
        um.addStyleNames(ValoTheme.LABEL_BOLD, ValoTheme.LABEL_SMALL);

        return new HorizontalLayout(value, um);
    }

     @Override
    public void setLocationData(LocationData data){
        setLocationData(data.getLocation(), data.getLatitude() , data.getLongitude());
        value.setValue(data.getValue().toString());
    }
}
