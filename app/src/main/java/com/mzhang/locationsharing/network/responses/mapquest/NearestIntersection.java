package com.mzhang.locationsharing.network.responses.mapquest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by v579294 on 9/6/17.
 */

public class NearestIntersection {

    @SerializedName("streetDisplayName")
    @Expose
    private String streetDisplayName;
    @SerializedName("distanceMeters")
    @Expose
    private String distanceMeters;
    @SerializedName("latLng")
    @Expose
    private LatLng latLng;
    @SerializedName("label")
    @Expose
    private String label;

    public String getStreetDisplayName() {
        return streetDisplayName;
    }

    public void setStreetDisplayName(String streetDisplayName) {
        this.streetDisplayName = streetDisplayName;
    }

    public String getDistanceMeters() {
        return distanceMeters;
    }

    public void setDistanceMeters(String distanceMeters) {
        this.distanceMeters = distanceMeters;
    }

    public LatLng getLatLng() {
        return latLng;
    }

    public void setLatLng(LatLng latLng) {
        this.latLng = latLng;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

}