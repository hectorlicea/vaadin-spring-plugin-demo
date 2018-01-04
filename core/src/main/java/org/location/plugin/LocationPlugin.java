package org.location.plugin;

import org.location.data.LocationData;
import org.springframework.plugin.core.Plugin;

/**
 * Plugin interface
 */
public interface LocationPlugin extends Plugin<String> {
    /**
     * Return component
     *
     * @param data Location data
     * @return {@link LocationComponent}
     */
    LocationComponent getComponent(LocationData data);
}
