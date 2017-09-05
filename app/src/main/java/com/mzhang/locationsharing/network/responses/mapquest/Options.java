
package com.mzhang.locationsharing.network.responses.mapquest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Options {

    private List<Object> mustAvoidLinkIds = new ArrayList<Object>();
    private Long drivingStyle;
    private Boolean countryBoundaryDisplay;
    private Long generalize;
    private String narrativeType;
    private String locale;
    private Boolean avoidTimedConditions;
    private Boolean destinationManeuverDisplay;
    private Boolean enhancedNarrative;
    private Long filterZoneFactor;
    private Long timeType;
    private Long maxWalkingDistance;
    private String routeType;
    private Long transferPenalty;
    private Boolean stateBoundaryDisplay;
    private Long walkingSpeed;
    private Long maxLinkId;
    private List<Object> arteryWeights = new ArrayList<Object>();
    private List<Object> tryAvoidLinkIds = new ArrayList<Object>();
    private String unit;
    private Long routeNumber;
    private String shapeFormat;
    private Long maneuverPenalty;
    private Boolean useTraffic;
    private Boolean returnLinkDirections;
    private List<Object> avoidTripIds = new ArrayList<Object>();
    private String manmaps;
    private Long highwayEfficiency;
    private Boolean sideOfStreetDisplay;
    private Long cyclingRoadFactor;
    private Long urbanAvoidFactor;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The mustAvoidLinkIds
     */
    public List<Object> getMustAvoidLinkIds() {
        return mustAvoidLinkIds;
    }

    /**
     * 
     * @param mustAvoidLinkIds
     *     The mustAvoidLinkIds
     */
    public void setMustAvoidLinkIds(List<Object> mustAvoidLinkIds) {
        this.mustAvoidLinkIds = mustAvoidLinkIds;
    }

    /**
     * 
     * @return
     *     The drivingStyle
     */
    public Long getDrivingStyle() {
        return drivingStyle;
    }

    /**
     * 
     * @param drivingStyle
     *     The drivingStyle
     */
    public void setDrivingStyle(Long drivingStyle) {
        this.drivingStyle = drivingStyle;
    }

    /**
     * 
     * @return
     *     The countryBoundaryDisplay
     */
    public Boolean getCountryBoundaryDisplay() {
        return countryBoundaryDisplay;
    }

    /**
     * 
     * @param countryBoundaryDisplay
     *     The countryBoundaryDisplay
     */
    public void setCountryBoundaryDisplay(Boolean countryBoundaryDisplay) {
        this.countryBoundaryDisplay = countryBoundaryDisplay;
    }

    /**
     * 
     * @return
     *     The generalize
     */
    public Long getGeneralize() {
        return generalize;
    }

    /**
     * 
     * @param generalize
     *     The generalize
     */
    public void setGeneralize(Long generalize) {
        this.generalize = generalize;
    }

    /**
     * 
     * @return
     *     The narrativeType
     */
    public String getNarrativeType() {
        return narrativeType;
    }

    /**
     * 
     * @param narrativeType
     *     The narrativeType
     */
    public void setNarrativeType(String narrativeType) {
        this.narrativeType = narrativeType;
    }

    /**
     * 
     * @return
     *     The locale
     */
    public String getLocale() {
        return locale;
    }

    /**
     * 
     * @param locale
     *     The locale
     */
    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * 
     * @return
     *     The avoidTimedConditions
     */
    public Boolean getAvoidTimedConditions() {
        return avoidTimedConditions;
    }

    /**
     * 
     * @param avoidTimedConditions
     *     The avoidTimedConditions
     */
    public void setAvoidTimedConditions(Boolean avoidTimedConditions) {
        this.avoidTimedConditions = avoidTimedConditions;
    }

    /**
     * 
     * @return
     *     The destinationManeuverDisplay
     */
    public Boolean getDestinationManeuverDisplay() {
        return destinationManeuverDisplay;
    }

    /**
     * 
     * @param destinationManeuverDisplay
     *     The destinationManeuverDisplay
     */
    public void setDestinationManeuverDisplay(Boolean destinationManeuverDisplay) {
        this.destinationManeuverDisplay = destinationManeuverDisplay;
    }

    /**
     * 
     * @return
     *     The enhancedNarrative
     */
    public Boolean getEnhancedNarrative() {
        return enhancedNarrative;
    }

    /**
     * 
     * @param enhancedNarrative
     *     The enhancedNarrative
     */
    public void setEnhancedNarrative(Boolean enhancedNarrative) {
        this.enhancedNarrative = enhancedNarrative;
    }

    /**
     * 
     * @return
     *     The filterZoneFactor
     */
    public Long getFilterZoneFactor() {
        return filterZoneFactor;
    }

    /**
     * 
     * @param filterZoneFactor
     *     The filterZoneFactor
     */
    public void setFilterZoneFactor(Long filterZoneFactor) {
        this.filterZoneFactor = filterZoneFactor;
    }

    /**
     * 
     * @return
     *     The timeType
     */
    public Long getTimeType() {
        return timeType;
    }

    /**
     * 
     * @param timeType
     *     The timeType
     */
    public void setTimeType(Long timeType) {
        this.timeType = timeType;
    }

    /**
     * 
     * @return
     *     The maxWalkingDistance
     */
    public Long getMaxWalkingDistance() {
        return maxWalkingDistance;
    }

    /**
     * 
     * @param maxWalkingDistance
     *     The maxWalkingDistance
     */
    public void setMaxWalkingDistance(Long maxWalkingDistance) {
        this.maxWalkingDistance = maxWalkingDistance;
    }

    /**
     * 
     * @return
     *     The routeType
     */
    public String getRouteType() {
        return routeType;
    }

    /**
     * 
     * @param routeType
     *     The routeType
     */
    public void setRouteType(String routeType) {
        this.routeType = routeType;
    }

    /**
     * 
     * @return
     *     The transferPenalty
     */
    public Long getTransferPenalty() {
        return transferPenalty;
    }

    /**
     * 
     * @param transferPenalty
     *     The transferPenalty
     */
    public void setTransferPenalty(Long transferPenalty) {
        this.transferPenalty = transferPenalty;
    }

    /**
     * 
     * @return
     *     The stateBoundaryDisplay
     */
    public Boolean getStateBoundaryDisplay() {
        return stateBoundaryDisplay;
    }

    /**
     * 
     * @param stateBoundaryDisplay
     *     The stateBoundaryDisplay
     */
    public void setStateBoundaryDisplay(Boolean stateBoundaryDisplay) {
        this.stateBoundaryDisplay = stateBoundaryDisplay;
    }

    /**
     * 
     * @return
     *     The walkingSpeed
     */
    public Long getWalkingSpeed() {
        return walkingSpeed;
    }

    /**
     * 
     * @param walkingSpeed
     *     The walkingSpeed
     */
    public void setWalkingSpeed(Long walkingSpeed) {
        this.walkingSpeed = walkingSpeed;
    }

    /**
     * 
     * @return
     *     The maxLinkId
     */
    public Long getMaxLinkId() {
        return maxLinkId;
    }

    /**
     * 
     * @param maxLinkId
     *     The maxLinkId
     */
    public void setMaxLinkId(Long maxLinkId) {
        this.maxLinkId = maxLinkId;
    }

    /**
     * 
     * @return
     *     The arteryWeights
     */
    public List<Object> getArteryWeights() {
        return arteryWeights;
    }

    /**
     * 
     * @param arteryWeights
     *     The arteryWeights
     */
    public void setArteryWeights(List<Object> arteryWeights) {
        this.arteryWeights = arteryWeights;
    }

    /**
     * 
     * @return
     *     The tryAvoidLinkIds
     */
    public List<Object> getTryAvoidLinkIds() {
        return tryAvoidLinkIds;
    }

    /**
     * 
     * @param tryAvoidLinkIds
     *     The tryAvoidLinkIds
     */
    public void setTryAvoidLinkIds(List<Object> tryAvoidLinkIds) {
        this.tryAvoidLinkIds = tryAvoidLinkIds;
    }

    /**
     * 
     * @return
     *     The unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 
     * @param unit
     *     The unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * 
     * @return
     *     The routeNumber
     */
    public Long getRouteNumber() {
        return routeNumber;
    }

    /**
     * 
     * @param routeNumber
     *     The routeNumber
     */
    public void setRouteNumber(Long routeNumber) {
        this.routeNumber = routeNumber;
    }

    /**
     * 
     * @return
     *     The shapeFormat
     */
    public String getShapeFormat() {
        return shapeFormat;
    }

    /**
     * 
     * @param shapeFormat
     *     The shapeFormat
     */
    public void setShapeFormat(String shapeFormat) {
        this.shapeFormat = shapeFormat;
    }

    /**
     * 
     * @return
     *     The maneuverPenalty
     */
    public Long getManeuverPenalty() {
        return maneuverPenalty;
    }

    /**
     * 
     * @param maneuverPenalty
     *     The maneuverPenalty
     */
    public void setManeuverPenalty(Long maneuverPenalty) {
        this.maneuverPenalty = maneuverPenalty;
    }

    /**
     * 
     * @return
     *     The useTraffic
     */
    public Boolean getUseTraffic() {
        return useTraffic;
    }

    /**
     * 
     * @param useTraffic
     *     The useTraffic
     */
    public void setUseTraffic(Boolean useTraffic) {
        this.useTraffic = useTraffic;
    }

    /**
     * 
     * @return
     *     The returnLinkDirections
     */
    public Boolean getReturnLinkDirections() {
        return returnLinkDirections;
    }

    /**
     * 
     * @param returnLinkDirections
     *     The returnLinkDirections
     */
    public void setReturnLinkDirections(Boolean returnLinkDirections) {
        this.returnLinkDirections = returnLinkDirections;
    }

    /**
     * 
     * @return
     *     The avoidTripIds
     */
    public List<Object> getAvoidTripIds() {
        return avoidTripIds;
    }

    /**
     * 
     * @param avoidTripIds
     *     The avoidTripIds
     */
    public void setAvoidTripIds(List<Object> avoidTripIds) {
        this.avoidTripIds = avoidTripIds;
    }

    /**
     * 
     * @return
     *     The manmaps
     */
    public String getManmaps() {
        return manmaps;
    }

    /**
     * 
     * @param manmaps
     *     The manmaps
     */
    public void setManmaps(String manmaps) {
        this.manmaps = manmaps;
    }

    /**
     * 
     * @return
     *     The highwayEfficiency
     */
    public Long getHighwayEfficiency() {
        return highwayEfficiency;
    }

    /**
     * 
     * @param highwayEfficiency
     *     The highwayEfficiency
     */
    public void setHighwayEfficiency(Long highwayEfficiency) {
        this.highwayEfficiency = highwayEfficiency;
    }

    /**
     * 
     * @return
     *     The sideOfStreetDisplay
     */
    public Boolean getSideOfStreetDisplay() {
        return sideOfStreetDisplay;
    }

    /**
     * 
     * @param sideOfStreetDisplay
     *     The sideOfStreetDisplay
     */
    public void setSideOfStreetDisplay(Boolean sideOfStreetDisplay) {
        this.sideOfStreetDisplay = sideOfStreetDisplay;
    }

    /**
     * 
     * @return
     *     The cyclingRoadFactor
     */
    public Long getCyclingRoadFactor() {
        return cyclingRoadFactor;
    }

    /**
     * 
     * @param cyclingRoadFactor
     *     The cyclingRoadFactor
     */
    public void setCyclingRoadFactor(Long cyclingRoadFactor) {
        this.cyclingRoadFactor = cyclingRoadFactor;
    }

    /**
     * 
     * @return
     *     The urbanAvoidFactor
     */
    public Long getUrbanAvoidFactor() {
        return urbanAvoidFactor;
    }

    /**
     * 
     * @param urbanAvoidFactor
     *     The urbanAvoidFactor
     */
    public void setUrbanAvoidFactor(Long urbanAvoidFactor) {
        this.urbanAvoidFactor = urbanAvoidFactor;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
