package com.mzhang.locationsharing.features.locationTrack;

import com.mapbox.mapboxsdk.geometry.LatLng;

/**
 * Created by v579294 on 8/25/17.
 */

public class LocationData {
    private LatLng latLng;
    private int speedLimit;
    private int currentSpeed;

    public LocationData() {
        this.latLng = new LatLng();
        this.speedLimit = 0;
        this.currentSpeed = 0;
    }

    public LocationData(LatLng latLng) {
        this.latLng = latLng;
        this.speedLimit = 0;
        this.currentSpeed = 0;
    }

    public LocationData(LatLng latLng, int speedLimit, int currentSpeed) {
        this.latLng = latLng;
        this.speedLimit = speedLimit;
        this.currentSpeed = currentSpeed;
    }

    public LatLng getLatLng() {
        return latLng;
    }

    public void setLatLng(LatLng latLng) {
        this.latLng = latLng;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
}
