package org.location.plugin;

import com.vaadin.ui.Component;
import org.location.data.LocationData;

/**
 * Weather component interface
 */
public interface LocationComponent extends Component {

    /**
     * Update data in component.
     *
     * @param data Location data
     */
    void setLocationData(LocationData data);

}
