package org.weather;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.*;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of an HTML page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@SpringUI
//@Theme("weathertheme")
public class WeathertUI extends UI {

    private Component content;

    @Autowired
    public WeathertUI(MainScreenView content){
        this.content = content;
    }

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        setContent(content);
    }

    @WebServlet(urlPatterns = "/*", name = "WeatherUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = WeathertUI.class, productionMode = false)
    public static class MeasurementUIServlet extends VaadinServlet {
    }
}
