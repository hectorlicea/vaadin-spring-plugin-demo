package org.location;

import org.location.plugin.LocationPlugin;
import org.springframework.context.annotation.Configuration;
import org.springframework.plugin.core.config.EnablePluginRegistries;

@Configuration
@EnablePluginRegistries(LocationPlugin.class)
public class ApplicationConfiguration {
}
