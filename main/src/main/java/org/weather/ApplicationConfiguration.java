package org.weather;

import org.springframework.context.annotation.Configuration;
import org.springframework.plugin.core.config.EnablePluginRegistries;
import org.weather.plugin.WeatherPlugin;

@Configuration
@EnablePluginRegistries(WeatherPlugin.class)
public class ApplicationConfiguration {
}
