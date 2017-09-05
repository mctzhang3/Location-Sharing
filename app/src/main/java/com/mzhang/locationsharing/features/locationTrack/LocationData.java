package com.mzhang.locationsharing.features.locationTrack;

import com.mapbox.mapboxsdk.geometry.LatLng;

/**
 * Created by v579294 on 9/1/17.
 */

public class LocationData {
    private LatLng latLng;
    private float deviceSpeed;
    private String roadSpeedLimit;

    public LocationData() {
        this.latLng = new LatLng();
        deviceSpeed = 0;
        roadSpeedLimit = "";
    }

    public LocationData(LatLng latLng) {
        this.latLng = latLng;
        deviceSpeed = 0;
        roadSpeedLimit = "";
    }

    public LocationData(LatLng latLng, float deviceSpeed, String roadSpeedLimit) {
        this.latLng = latLng;
        this.deviceSpeed = deviceSpeed;
        this.roadSpeedLimit = roadSpeedLimit;
    }

    public LatLng getLatLng() {
        return latLng;
    }

    public void setLatLng(LatLng latLng) {
        this.latLng = latLng;
    }

    public float getDeviceSpeed() {
        return deviceSpeed;
    }

    public void setDeviceSpeed(float deviceSpeed) {
        this.deviceSpeed = deviceSpeed;
    }

    public String getRoadSpeedLimit() {
        return roadSpeedLimit;
    }

    public void setRoadSpeedLimit(String roadSpeedLimit) {
        this.roadSpeedLimit = roadSpeedLimit;
    }
}
