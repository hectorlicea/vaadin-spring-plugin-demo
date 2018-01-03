package org.weather;

import com.vaadin.navigator.View;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.VerticalLayout;
import org.weather.plugin.WeatherPlugin;
import org.weather.data.WeatherData;
import org.weather.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.plugin.core.PluginRegistry;

import javax.annotation.PostConstruct;

/**
 * Main view in UI
 */
@UIScope
@SpringComponent
public class MainScreenView extends VerticalLayout implements View {

	private final CssLayout menuArea = new CssLayout();


	@Autowired
	private PluginRegistry<WeatherPlugin, String> registry;//Plugins registry

	@Autowired
	private WeatherService service;


	public MainScreenView() {

	}

	@PostConstruct
	private void init() {
		setWidth("100%");
		setMargin(false);
		setSpacing(false);

		CssLayout content = new CssLayout();
		content.setWidth("100%");
		addComponent(content);

		//Read all measurements
		for (WeatherData dto: service.loadWeatherData()){
			// Get the plugin by the measurement type.
			// If not exists plugin for this type, the registry return an instance of DefaultMeasurementPlugin
			WeatherPlugin mc = registry.getPluginFor(dto.getType(), new DefaultPlugin());
			// Add component to UI
			content.addComponent(mc.getComponent(dto));
		}
	}
}
