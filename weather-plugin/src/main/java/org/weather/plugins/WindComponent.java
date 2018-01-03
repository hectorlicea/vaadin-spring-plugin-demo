package org.weather.plugins;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import org.weather.data.WeatherData;
import org.weather.plugin.AbstractWeatherComponent;
import org.weather.plugin.WeatherComponent;

/**
 * {@link WeatherComponent} implementation to show 'wind' measurement data.
 */
public class WindComponent extends AbstractWeatherComponent {
    private Label type;
    private Label value;

    public WindComponent(){
        super();
    }

    @Override
    protected void buildComponent() {
        Component valueComp = buildValue();
        type = new Label(VaadinIcons.FLAG_O.getHtml(), ContentMode.HTML);
        type.addStyleName(ValoTheme.LABEL_LARGE);
        setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);
        addComponents(type, valueComp);
    }

    private Component buildValue(){
        value = new Label();
        value.addStyleNames(ValoTheme.LABEL_BOLD,ValoTheme.LABEL_COLORED, ValoTheme.LABEL_HUGE);

        Label grade = new Label("km/h");
        grade.addStyleNames(ValoTheme.LABEL_BOLD, "um");
        return new HorizontalLayout(value, grade);
    }

     @Override
    public void setWeatherData(WeatherData data){
        setLocationData(data.getLocation(), data.getLatitude() , data.getLongitude());

        value.setValue(data.getValue().toString());
    }
}
