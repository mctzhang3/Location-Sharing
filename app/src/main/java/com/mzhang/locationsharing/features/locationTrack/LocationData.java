package com.mzhang.locationsharing.features.locationTrack;

import com.mapbox.mapboxsdk.geometry.LatLng;

/**
<<<<<<< HEAD
 * Created by v579294 on 9/1/17.
=======
 * Created by v579294 on 8/25/17.
>>>>>>> c299ee3435754d0f51687fd412a043f7960c2f5d
 */

public class LocationData {
    private LatLng latLng;
<<<<<<< HEAD
    private float deviceSpeed;
    private String roadSpeedLimit;

    public LocationData() {
        this.latLng = new LatLng();
        deviceSpeed = 0;
        roadSpeedLimit = "";
=======
    private int speedLimit;
    private int currentSpeed;

    public LocationData() {
        this.latLng = new LatLng();
        this.speedLimit = 0;
        this.currentSpeed = 0;
>>>>>>> c299ee3435754d0f51687fd412a043f7960c2f5d
    }

    public LocationData(LatLng latLng) {
        this.latLng = latLng;
<<<<<<< HEAD
        deviceSpeed = 0;
        roadSpeedLimit = "";
    }

    public LocationData(LatLng latLng, float deviceSpeed, String roadSpeedLimit) {
        this.latLng = latLng;
        this.deviceSpeed = deviceSpeed;
        this.roadSpeedLimit = roadSpeedLimit;
=======
        this.speedLimit = 0;
        this.currentSpeed = 0;
    }

    public LocationData(LatLng latLng, int speedLimit, int currentSpeed) {
        this.latLng = latLng;
        this.speedLimit = speedLimit;
        this.currentSpeed = currentSpeed;
>>>>>>> c299ee3435754d0f51687fd412a043f7960c2f5d
    }

    public LatLng getLatLng() {
        return latLng;
    }

    public void setLatLng(LatLng latLng) {
        this.latLng = latLng;
    }

<<<<<<< HEAD
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
=======
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
>>>>>>> c299ee3435754d0f51687fd412a043f7960c2f5d
    }
}
