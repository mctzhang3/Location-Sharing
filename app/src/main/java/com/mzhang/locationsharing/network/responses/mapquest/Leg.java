
package com.mzhang.locationsharing.network.responses.mapquest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leg {

    private Boolean hasTollRoad;
    private Long index;
    private List<List<Object>> roadGradeStrategy = new ArrayList<List<Object>>();
    private Boolean hasHighway;
    private Boolean hasUnpaved;
    private Double distance;
    private Long time;
    private Long origIndex;
    private Boolean hasSeasonalClosure;
    private String origNarrative;
    private Boolean hasCountryCross;
    private String formattedTime;
    private String destNarrative;
    private Long destIndex;
    private List<Maneuver> maneuvers = new ArrayList<Maneuver>();
    private Boolean hasFerry;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
     *     The index
     */
    public Long getIndex() {
        return index;
    }

    /**
     * 
     * @param index
     *     The index
     */
    public void setIndex(Long index) {
        this.index = index;
    }

    /**
     * 
     * @return
     *     The roadGradeStrategy
     */
    public List<List<Object>> getRoadGradeStrategy() {
        return roadGradeStrategy;
    }

    /**
     * 
     * @param roadGradeStrategy
     *     The roadGradeStrategy
     */
    public void setRoadGradeStrategy(List<List<Object>> roadGradeStrategy) {
        this.roadGradeStrategy = roadGradeStrategy;
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
     *     The origIndex
     */
    public Long getOrigIndex() {
        return origIndex;
    }

    /**
     * 
     * @param origIndex
     *     The origIndex
     */
    public void setOrigIndex(Long origIndex) {
        this.origIndex = origIndex;
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
     *     The origNarrative
     */
    public String getOrigNarrative() {
        return origNarrative;
    }

    /**
     * 
     * @param origNarrative
     *     The origNarrative
     */
    public void setOrigNarrative(String origNarrative) {
        this.origNarrative = origNarrative;
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
     *     The destNarrative
     */
    public String getDestNarrative() {
        return destNarrative;
    }

    /**
     * 
     * @param destNarrative
     *     The destNarrative
     */
    public void setDestNarrative(String destNarrative) {
        this.destNarrative = destNarrative;
    }

    /**
     * 
     * @return
     *     The destIndex
     */
    public Long getDestIndex() {
        return destIndex;
    }

    /**
     * 
     * @param destIndex
     *     The destIndex
     */
    public void setDestIndex(Long destIndex) {
        this.destIndex = destIndex;
    }

    /**
     * 
     * @return
     *     The maneuvers
     */
    public List<Maneuver> getManeuvers() {
        return maneuvers;
    }

    /**
     * 
     * @param maneuvers
     *     The maneuvers
     */
    public void setManeuvers(List<Maneuver> maneuvers) {
        this.maneuvers = maneuvers;
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
