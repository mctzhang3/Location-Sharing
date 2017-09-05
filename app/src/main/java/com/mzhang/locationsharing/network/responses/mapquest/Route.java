
package com.mzhang.locationsharing.network.responses.mapquest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Route {

    private BestFit bestFit;
    private Boolean hasTollRoad;
    private List<Object> computedWaypoints = new ArrayList<Object>();
    private Double fuelUsed;
    private Shape shape;
    private Boolean hasUnpaved;
    private Boolean hasHighway;
    private Long realTime;
    private BoundingBox boundingBox;
    private Double distance;
    private Long time;
    private List<Long> locationSequence = new ArrayList<Long>();
    private Boolean hasSeasonalClosure;
    private String sessionId;
    private List<Location> locations = new ArrayList<Location>();
    private MapState mapState;
    private Boolean hasCountryCross;
    private List<Leg> legs = new ArrayList<Leg>();
    private String formattedTime;
    private RouteError routeError;
    private Options options;
    private Boolean hasFerry;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The bestFit
     */
    public BestFit getBestFit() {
        return bestFit;
    }

    /**
     * 
     * @param bestFit
     *     The bestFit
     */
    public void setBestFit(BestFit bestFit) {
        this.bestFit = bestFit;
    }

    /**
     * 
     * @return
     *     The hasTollRoad
     */
    public Boolean getHasTollRoad() {
        return hasTollRoad;
    }

    /**
     * 
     * @param hasTollRoad
     *     The hasTollRoad
     */
    public void setHasTollRoad(Boolean hasTollRoad) {
        this.hasTollRoad = hasTollRoad;
    }

    /**
     * 
     * @return
     *     The computedWaypoints
     */
    public List<Object> getComputedWaypoints() {
        return computedWaypoints;
    }

    /**
     * 
     * @param computedWaypoints
     *     The computedWaypoints
     */
    public void setComputedWaypoints(List<Object> computedWaypoints) {
        this.computedWaypoints = computedWaypoints;
    }

    /**
     * 
     * @return
     *     The fuelUsed
     */
    public Double getFuelUsed() {
        return fuelUsed;
    }

    /**
     * 
     * @param fuelUsed
     *     The fuelUsed
     */
    public void setFuelUsed(Double fuelUsed) {
        this.fuelUsed = fuelUsed;
    }

    /**
     * 
     * @return
     *     The shape
     */
    public Shape getShape() {
        return shape;
    }

    /**
     * 
     * @param shape
     *     The shape
     */
    public void setShape(Shape shape) {
        this.shape = shape;
    }

    /**
     * 
     * @return
     *     The hasUnpaved
     */
    public Boolean getHasUnpaved() {
        return hasUnpaved;
    }

    /**
     * 
     * @param hasUnpaved
     *     The hasUnpaved
     */
    public void setHasUnpaved(Boolean hasUnpaved) {
        this.hasUnpaved = hasUnpaved;
    }

    /**
     * 
     * @return
     *     The hasHighway
     */
    public Boolean getHasHighway() {
        return hasHighway;
    }

    /**
     * 
     * @param hasHighway
     *     The hasHighway
     */
    public void setHasHighway(Boolean hasHighway) {
        this.hasHighway = hasHighway;
    }

    /**
     * 
     * @return
     *     The realTime
     */
    public Long getRealTime() {
        return realTime;
    }

    /**
     * 
     * @param realTime
     *     The realTime
     */
    public void setRealTime(Long realTime) {
        this.realTime = realTime;
    }

    /**
     * 
     * @return
     *     The boundingBox
     */
    public BoundingBox getBoundingBox() {
        return boundingBox;
    }

    /**
     * 
     * @param boundingBox
     *     The boundingBox
     */
    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    /**
     * 
     * @return
     *     The distance
     */
    public Double getDistance() {
        return distance;
    }

    /**
     * 
     * @param distance
     *     The distance
     */
    public void setDistance(Double distance) {
        this.distance = distance;
    }

    /**
     * 
     * @return
     *     The time
     */
    public Long getTime() {
        return time;
    }

    /**
     * 
     * @param time
     *     The time
     */
    public void setTime(Long time) {
        this.time = time;
    }

    /**
     * 
     * @return
     *     The locationSequence
     */
    public List<Long> getLocationSequence() {
        return locationSequence;
    }

    /**
     * 
     * @param locationSequence
     *     The locationSequence
     */
    public void setLocationSequence(List<Long> locationSequence) {
        this.locationSequence = locationSequence;
    }

    /**
     * 
     * @return
     *     The hasSeasonalClosure
     */
    public Boolean getHasSeasonalClosure() {
        return hasSeasonalClosure;
    }

    /**
     * 
     * @param hasSeasonalClosure
     *     The hasSeasonalClosure
     */
    public void setHasSeasonalClosure(Boolean hasSeasonalClosure) {
        this.hasSeasonalClosure = hasSeasonalClosure;
    }

    /**
     * 
     * @return
     *     The sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * 
     * @param sessionId
     *     The sessionId
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
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

    /**
     * 
     * @return
     *     The mapState
     */
    public MapState getMapState() {
        return mapState;
    }

    /**
     * 
     * @param mapState
     *     The mapState
     */
    public void setMapState(MapState mapState) {
        this.mapState = mapState;
    }

    /**
     * 
     * @return
     *     The hasCountryCross
     */
    public Boolean getHasCountryCross() {
        return hasCountryCross;
    }

    /**
     * 
     * @param hasCountryCross
     *     The hasCountryCross
     */
    public void setHasCountryCross(Boolean hasCountryCross) {
        this.hasCountryCross = hasCountryCross;
    }

    /**
     * 
     * @return
     *     The legs
     */
    public List<Leg> getLegs() {
        return legs;
    }

    /**
     * 
     * @param legs
     *     The legs
     */
    public void setLegs(List<Leg> legs) {
        this.legs = legs;
    }

    /**
     * 
     * @return
     *     The formattedTime
     */
    public String getFormattedTime() {
        return formattedTime;
    }

    /**
     * 
     * @param formattedTime
     *     The formattedTime
     */
    public void setFormattedTime(String formattedTime) {
        this.formattedTime = formattedTime;
    }

    /**
     * 
     * @return
     *     The routeError
     */
    public RouteError getRouteError() {
        return routeError;
    }

    /**
     * 
     * @param routeError
     *     The routeError
     */
    public void setRouteError(RouteError routeError) {
        this.routeError = routeError;
    }

    /**
     * 
     * @return
     *     The options
     */
    public Options getOptions() {
        return options;
    }

    /**
     * 
     * @param options
     *     The options
     */
    public void setOptions(Options options) {
        this.options = options;
    }

    /**
     * 
     * @return
     *     The hasFerry
     */
    public Boolean getHasFerry() {
        return hasFerry;
    }

    /**
     * 
     * @param hasFerry
     *     The hasFerry
     */
    public void setHasFerry(Boolean hasFerry) {
        this.hasFerry = hasFerry;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
