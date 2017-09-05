
package com.mzhang.locationsharing.network.responses.mapquest;

import java.util.HashMap;
import java.util.Map;

public class Center {

    private Long lng;
    private Long lat;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The lng
     */
    public Long getLng() {
        return lng;
    }

    /**
     * 
     * @param lng
     *     The lng
     */
    public void setLng(Long lng) {
        this.lng = lng;
    }

    /**
     * 
     * @return
     *     The lat
     */
    public Long getLat() {
        return lat;
    }

    /**
     * 
     * @param lat
     *     The lat
     */
    public void setLat(Long lat) {
        this.lat = lat;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
