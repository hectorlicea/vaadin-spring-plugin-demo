package org.location.service;

import org.location.data.LocationData;

import java.util.List;

/**
 * Service interface
 */
public interface LocationsService {

    /**
     * Return list of LocationData
     *
     * @return list
     */
    List<LocationData> loadLocationsData();
}
