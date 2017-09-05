
package com.mzhang.locationsharing.network.responses.mapquest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Result {

    private ProvidedLocation providedLocation;
    private List<Location> locations = new ArrayList<Location>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     *     The providedLocation
     */
    public ProvidedLocation getProvidedLocation() {
        return providedLocation;
    }

    /**
     *
     * @param providedLocation
     *     The providedLocation
     */
    public void setProvidedLocation(ProvidedLocation providedLocation) {
        this.providedLocation = providedLocation;
    }

    /**
     *
     * @return
     *     The locations
     */
    public List<Location> getLocations() {
        return locations;
    }

    /**
     *
     * @param locations
     *     The locations
     */
    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
