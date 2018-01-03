package org.weather.plugin;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import org.weather.data.WeatherData;

public abstract class AbstractWeatherComponent extends VerticalLayout implements WeatherComponent {

    private Label locationName;
    private Label latitude;
    private Label longitude;

    public AbstractWeatherComponent(){
        setMargin(false);
        addStyleName(ValoTheme.LAYOUT_CARD);
        setWidth("200px");
        setHeight("200px");

        Component location = buildLocation();
        addComponent(location);

        buildComponent();
    }

    private Component buildLocation(){
        locationName = new Label();
        locationName.setContentMode(ContentMode.HTML);

        latitude = new Label("",ContentMode.HTML);
        latitude.addStyleName(ValoTheme.LABEL_TINY);
        longitude = new Label("",ContentMode.HTML);
        longitude.addStyleName(ValoTheme.LABEL_TINY);
        Component location = new HorizontalLayout(latitude, longitude);

        VerticalLayout locationComponent = new VerticalLayout();
        locationComponent.setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);
        locationComponent.addComponents(locationName, location);
        locationComponent.setMargin(false);
        locationComponent.setSpacing(false);
        return locationComponent;
    }

    protected void setLocationData(String location, Double latitude, Double longitude){
        this.locationName.setValue("<b>Location: </b>" + location);
        this.latitude.setValue("<b>Lat: </b>" + latitude);
        this.longitude.setValue("<b>Long: </b>" + longitude);
    }

    protected abstract void buildComponent();


    @Override
    public void setWeatherData(WeatherData data) {

    }
}
