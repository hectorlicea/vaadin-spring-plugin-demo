package org.location.data;

import lombok.Getter;
import lombok.Setter;

/**
 * Location data
 */
@Getter
@Setter
public class LocationData {
    private String location;
    private Double latitude;
    private Double longitude;
    private String type;
    private Double value;
    private Double min;
    private Double max;

    public LocationData(String location, Double latitude, Double longitude, String type, Double value){
        this(location, latitude, longitude, type, value, null, null);
    }

    public LocationData(String location, Double latitude, Double longitude, String type, Double value, Double min, Double max){
        this.location = location;
        this.latitude = latitude;
        this.longitude = longitude;
        this.type = type;
        this.value = value;
        this.min = min;
        this.max = max;
    }
}
