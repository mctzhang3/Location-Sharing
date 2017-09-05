
package com.mzhang.locationsharing.network.responses.mapquest;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;
import java.util.Map;

public class StartPoint implements Parcelable{

    private Double lng;
    private Double lat;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The lng
     */
    public Double getLng() {
        return lng;
    }

    /**
     * 
     * @param lng
     *     The lng
     */
    public void setLng(Double lng) {
        this.lng = lng;
    }

    /**
     * 
     * @return
     *     The lat
     */
    public Double getLat() {
        return lat;
    }

    /**
     * 
     * @param lat
     *     The lat
     */
    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public StartPoint(Parcel in){
        this.lat = in.readDouble();
        this.lng = in.readDouble();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeDouble((this.lat !=null)?this.lat:0);
        dest.writeDouble((this.lng !=null)?this.lng:0);
    }

    public static final Creator<StartPoint> CREATOR = new Creator<StartPoint>() {
        public StartPoint createFromParcel(Parcel in) {
            return new StartPoint(in);
        }

        public StartPoint[] newArray(int size) {
            return new StartPoint[size];
        }
    };
}
