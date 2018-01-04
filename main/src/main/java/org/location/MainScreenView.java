package org.location;

import com.vaadin.navigator.View;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.VerticalLayout;
import org.location.plugin.LocationPlugin;
import org.location.data.LocationData;
import org.location.service.LocationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.plugin.core.PluginRegistry;

import javax.annotation.PostConstruct;

/**
 * Main view in UI
 */
@UIScope
@SpringComponent
public class MainScreenView extends VerticalLayout implements View {

	private LocationsService service;
	private PluginRegistry<LocationPlugin, String> registry;//Plugins registry

	@Autowired
	public MainScreenView( LocationsService service, PluginRegistry<LocationPlugin, String> registry) {
		this.service = service;
		this.registry = registry;
	}

	@PostConstruct
	private void init() {
		setWidth("100%");
		setMargin(false);
		setSpacing(false);

		CssLayout content = new CssLayout();
		content.setWidth("100%");
		addComponent(content);

		//Read all locations
		for (LocationData dto: service.loadLocationsData()){
			// Get the plugin by the weather type.
			// If not exists plugin for this type, the registry return an instance of DefaultPlugin
			LocationPlugin mc = registry.getPluginFor(dto.getType(), new DefaultPlugin());
			// Add component to UI
			content.addComponent(mc.getComponent(dto));
		}
	}
}
