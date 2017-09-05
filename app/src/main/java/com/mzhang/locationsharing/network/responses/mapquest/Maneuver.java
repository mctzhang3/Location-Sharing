
package com.mzhang.locationsharing.network.responses.mapquest;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maneuver implements Parcelable {

    private List<Object> signs = new ArrayList<Object>();
    private Long index;
    private List<Object> maneuverNotes = new ArrayList<Object>();
    private Long direction;
    private String narrative;
    private String iconUrl;
    private Double distance;
    private Long time;
    private List<Object> linkIds = new ArrayList<Object>();
    private List<Object> streets = new ArrayList<Object>();
    private Long attributes;
    private String transportMode;
    private String formattedTime;
    private String directionName;
    private StartPoint startPoint;
    private Long turnType;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The signs
     */
    public List<Object> getSigns() {
        return signs;
    }

    /**
     * 
     * @param signs
     *     The signs
     */
    public void setSigns(List<Object> signs) {
        this.signs = signs;
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
     *     The maneuverNotes
     */
    public List<Object> getManeuverNotes() {
        return maneuverNotes;
    }

    /**
     * 
     * @param maneuverNotes
     *     The maneuverNotes
     */
    public void setManeuverNotes(List<Object> maneuverNotes) {
        this.maneuverNotes = maneuverNotes;
    }

    /**
     * 
     * @return
     *     The direction
     */
    public Long getDirection() {
        return direction;
    }

    /**
     * 
     * @param direction
     *     The direction
     */
    public void setDirection(Long direction) {
        this.direction = direction;
    }

    /**
     * 
     * @return
     *     The narrative
     */
    public String getNarrative() {
        return narrative;
    }

    /**
     * 
     * @param narrative
     *     The narrative
     */
    public void setNarrative(String narrative) {
        this.narrative = narrative;
    }

    /**
     * 
     * @return
     *     The iconUrl
     */
    public String getIconUrl() {
        return iconUrl;
    }

    /**
     * 
     * @param iconUrl
     *     The iconUrl
     */
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
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
     *     The linkIds
     */
    public List<Object> getLinkIds() {
        return linkIds;
    }

    /**
     * 
     * @param linkIds
     *     The linkIds
     */
    public void setLinkIds(List<Object> linkIds) {
        this.linkIds = linkIds;
    }

    /**
     * 
     * @return
     *     The streets
     */
    public List<Object> getStreets() {
        return streets;
    }

    /**
     * 
     * @param streets
     *     The streets
     */
    public void setStreets(List<Object> streets) {
        this.streets = streets;
    }

    /**
     * 
     * @return
     *     The attributes
     */
    public Long getAttributes() {
        return attributes;
    }

    /**
     * 
     * @param attributes
     *     The attributes
     */
    public void setAttributes(Long attributes) {
        this.attributes = attributes;
    }

    /**
     * 
     * @return
     *     The transportMode
     */
    public String getTransportMode() {
        return transportMode;
    }

    /**
     * 
     * @param transportMode
     *     The transportMode
     */
    public void setTransportMode(String transportMode) {
        this.transportMode = transportMode;
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
     *     The directionName
     */
    public String getDirectionName() {
        return directionName;
    }

    /**
     * 
     * @param directionName
     *     The directionName
     */
    public void setDirectionName(String directionName) {
        this.directionName = directionName;
    }

    /**
     * 
     * @return
     *     The startPoint
     */
    public StartPoint getStartPoint() {
        return startPoint;
    }

    /**
     * 
     * @param startPoint
     *     The startPoint
     */
    public void setStartPoint(StartPoint startPoint) {
        this.startPoint = startPoint;
    }

    /**
     * 
     * @return
     *     The turnType
     */
    public Long getTurnType() {
        return turnType;
    }

    /**
     * 
     * @param turnType
     *     The turnType
     */
    public void setTurnType(Long turnType) {
        this.turnType = turnType;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Maneuver(Parcel in){

        this.index = in.readLong();
        this.direction = in.readLong();
        this.narrative = in.readString();
        this.iconUrl = in.readString();
        this.distance = in.readDouble();
        this.time = in.readLong();
        this.attributes = in.readLong();
        this.transportMode = in.readString();
        this.formattedTime = in.readString();
        this.directionName = in.readString();
        this.startPoint = in.readParcelable(StartPoint.class.getClassLoader());
        this.turnType = in.readLong();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeLong((this.index !=null)?this.index:0);
        dest.writeLong((this.direction !=null)?this.direction:0);
        dest.writeString((this.narrative !=null)?this.narrative:"");
        dest.writeString((this.iconUrl !=null)?this.iconUrl:"");
        dest.writeDouble((this.distance !=null)?this.distance:0);
        dest.writeLong((this.time !=null)?this.time:0);
        dest.writeLong((this.attributes !=null)?this.attributes:0);
        dest.writeString((this.transportMode !=null)?this.transportMode:"");
        dest.writeString((this.formattedTime !=null)?this.formattedTime:"");
        dest.writeString((this.directionName !=null)?this.directionName:"");
        dest.writeParcelable(startPoint,flags);
        dest.writeLong((this.turnType !=null)?this.turnType:0);

    }

    public static final Creator<Maneuver> CREATOR = new Creator<Maneuver>() {
        public Maneuver createFromParcel(Parcel in) {
            return new Maneuver(in);
        }

        public Maneuver[] newArray(int size) {
            return new Maneuver[size];
        }
    };
}
