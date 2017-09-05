
package com.mzhang.locationsharing.network.responses.mapquest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shape {

    private List<Long> maneuverIndexes = new ArrayList<Long>();
    private List<Double> shapePoints = new ArrayList<Double>();
    private List<Long> legIndexes = new ArrayList<Long>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The maneuverIndexes
     */
    public List<Long> getManeuverIndexes() {
        return maneuverIndexes;
    }

    /**
     * 
     * @param maneuverIndexes
     *     The maneuverIndexes
     */
    public void setManeuverIndexes(List<Long> maneuverIndexes) {
        this.maneuverIndexes = maneuverIndexes;
    }

    /**
     * 
     * @return
     *     The shapePoints
     */
    public List<Double> getShapePoints() {
        return shapePoints;
    }

    /**
     * 
     * @param shapePoints
     *     The shapePoints
     */
    public void setShapePoints(List<Double> shapePoints) {
        this.shapePoints = shapePoints;
    }

    /**
     * 
     * @return
     *     The legIndexes
     */
    public List<Long> getLegIndexes() {
        return legIndexes;
    }

    /**
     * 
     * @param legIndexes
     *     The legIndexes
     */
    public void setLegIndexes(List<Long> legIndexes) {
        this.legIndexes = legIndexes;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
