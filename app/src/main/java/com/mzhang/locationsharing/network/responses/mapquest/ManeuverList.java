package com.mzhang.locationsharing.network.responses.mapquest;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kondura on 4/25/16.
 */
public class ManeuverList implements Parcelable{

    private List<Maneuver> maneuver = new ArrayList<Maneuver>();

    public List<Maneuver> getManeuver() {
        return maneuver;
    }

    public void setManeuver(List<Maneuver> maneuver) {
        this.maneuver = maneuver;
    }

    public ManeuverList(){

    }

    public ManeuverList(Parcel in){

        this.maneuver = new ArrayList<Maneuver>();
        in.readTypedList(maneuver, Maneuver.CREATOR);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeTypedList(maneuver);
    }

    public static final Creator<ManeuverList> CREATOR = new Creator<ManeuverList>() {
        public ManeuverList createFromParcel(Parcel in) {
            return new ManeuverList(in);
        }

        public ManeuverList[] newArray(int size) {
            return new ManeuverList[size];
        }
    };
}
