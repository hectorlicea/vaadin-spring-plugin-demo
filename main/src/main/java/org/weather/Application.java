package org.weather;

import com.vaadin.spring.annotation.EnableVaadin;
import org.weather.plugin.WeatherPlugin;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.plugin.core.config.EnablePluginRegistries;

/**
 * Application
 *
 */
@EnableVaadin
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
