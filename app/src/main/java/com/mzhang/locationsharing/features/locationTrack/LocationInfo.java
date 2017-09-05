package com.mzhang.locationsharing.features.locationTrack;

import java.util.Date;

/**
 * Created by v579294 on 5/24/17.
 */

public class LocationInfo {

    private String mLatLng;
    private String mName;
    private long messageTime;

    public LocationInfo(String mMessage, String mName) {
        this.mLatLng = mMessage;
        this.mName = mName;

        // Initialize to current time
        messageTime = new Date().getTime();
    }

    public LocationInfo(){

    }

    public void setmLatLng(String mLatLng) {
        this.mLatLng = mLatLng;
    }

    public String getmLatLng() {
        return mLatLng;
    }


    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public long getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(long messageTime) {
        this.messageTime = messageTime;
    }
}