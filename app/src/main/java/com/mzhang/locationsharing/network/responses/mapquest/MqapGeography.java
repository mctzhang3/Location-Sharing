
package com.mzhang.locationsharing.network.responses.mapquest;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;
import java.util.Map;

public class MqapGeography implements Parcelable {

    private LatLng latLng;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public MqapGeography(){

    }
    /**
     * 
     * @return
     *     The latLng
     */
    public LatLng getLatLng() {
        return latLng;
    }

    /**
     * 
     * @param latLng
     *     The latLng
     */
    public void setLatLng(LatLng latLng) {
        this.latLng = latLng;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public MqapGeography(Parcel in){

        this.latLng = in.readParcelable(LatLng.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeParcelable(latLng,flags);
    }

    public static final Creator<MqapGeography> CREATOR = new Creator<MqapGeography>() {
        public MqapGeography createFromParcel(Parcel in) {
            return new MqapGeography(in);
        }

        public MqapGeography[] newArray(int size) {
            return new MqapGeography[size];
        }
    };
}
