
package com.mzhang.locationsharing.network.responses.mapquest;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchResult implements Parcelable {

    private Integer resultNumber;
    private Double distance;
    private String sourceName;
    private String name;
    private List<Double> shapePoints = new ArrayList<Double>();
    private String distanceUnit;
    private String key;
    private Fields fields;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public SearchResult(){

    }

    /**
     * 
     * @return
     *     The resultNumber
     */
    public Integer getResultNumber() {
        return resultNumber;
    }

    /**
     * 
     * @param resultNumber
     *     The resultNumber
     */
    public void setResultNumber(Integer resultNumber) {
        this.resultNumber = resultNumber;
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
     *     The sourceName
     */
    public String getSourceName() {
        return sourceName;
    }

    /**
     * 
     * @param sourceName
     *     The sourceName
     */
    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
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
     *     The distanceUnit
     */
    public String getDistanceUnit() {
        return distanceUnit;
    }

    /**
     * 
     * @param distanceUnit
     *     The distanceUnit
     */
    public void setDistanceUnit(String distanceUnit) {
        this.distanceUnit = distanceUnit;
    }

    /**
     * 
     * @return
     *     The key
     */
    public String getKey() {
        return key;
    }

    /**
     * 
     * @param key
     *     The key
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * 
     * @return
     *     The fields
     */
    public Fields getFields() {
        return fields;
    }

    /**
     * 
     * @param fields
     *     The fields
     */
    public void setFields(Fields fields) {
        this.fields = fields;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public SearchResult(Parcel in){

        this.resultNumber = in.readInt();
        this.distance = in.readDouble();
        this.sourceName = in.readString();
        this.name = in.readString();
        this.shapePoints = (ArrayList<Double>)in.readSerializable();
        this.distanceUnit = in.readString();
        this.key = in.readString();
        this.fields = in.readParcelable(Fields.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeInt((this.resultNumber !=null)?this.resultNumber:0);
        dest.writeDouble((this.distance !=null)?this.distance:0);
        dest.writeString((this.sourceName !=null)?this.sourceName:"");
        dest.writeString((this.name !=null)?this.name:"");
        dest.writeSerializable((Serializable) this.shapePoints);
        dest.writeString((this.distanceUnit !=null)?this.distanceUnit:"");
        dest.writeString((this.key !=null)?this.key:"");
        dest.writeParcelable(fields,flags);
    }

    public static final Creator<SearchResult> CREATOR = new Creator<SearchResult>() {
        public SearchResult createFromParcel(Parcel in) {
            return new SearchResult(in);
        }

        public SearchResult[] newArray(int size) {
            return new SearchResult[size];
        }
    };
}
