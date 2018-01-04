package org.location.weather.plugins;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import org.location.plugin.AbstractLocationComponent;
import org.location.plugin.LocationComponent;
import org.location.data.LocationData;
import org.springframework.context.annotation.Scope;

/**
 * {@link LocationComponent} implementation to show 'temperature' weather data.
 * Defined as @SpringComponent and scope 'prototype'.
 * Scopes a single bean definition to any number of object instances
 */
@SpringComponent
@Scope("prototype")
public class TemperatureComponent extends AbstractLocationComponent {

    private Label type;
    private Label value;
    private Label minValue;
    private Label maxValue;

    public TemperatureComponent(){
        super();
    }

    @Override
    protected void buildComponent() {
        Component valueComp = buildValue();
        Component minmaxComp = buildMinMax();

        type = new Label("",ContentMode.HTML);
        type.addStyleName(ValoTheme.LABEL_LARGE);
        setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);
        addComponents(type, valueComp, minmaxComp);
    }

    private Component buildValue(){
        value = new Label();
        value.addStyleNames(ValoTheme.LABEL_BOLD, ValoTheme.LABEL_HUGE);

        Label grade = new Label("&deg;C", ContentMode.HTML);
        grade.addStyleNames(ValoTheme.LABEL_BOLD, ValoTheme.LABEL_SMALL);
        return new HorizontalLayout(value, grade);
    }

    private Component buildMinMax(){
        minValue = new Label("", ContentMode.HTML);
        minValue.addStyleName(ValoTheme.LABEL_SMALL);
        maxValue = new Label("", ContentMode.HTML);
        maxValue.addStyleName(ValoTheme.LABEL_SMALL);

        HorizontalLayout layout = new HorizontalLayout(minValue, maxValue);
        layout.setSpacing(true);

        return layout;
    }

    @Override
    public void setLocationData(LocationData data){
        setLocationData(data.getLocation(), data.getLatitude() , data.getLongitude());

        value.setValue(data.getValue().toString());

        if(data.getValue()>0){
            type.setValue(VaadinIcons.SUN_O.getHtml());
        }else{
            value.addStyleName(ValoTheme.LABEL_COLORED);
            type.setValue(VaadinIcons.ASTERISK.getHtml());
        }
        minValue.setValue("<b>min:</b>"+data.getMin());
        maxValue.setValue("<b>max:</b>"+data.getMax());
    }
}
