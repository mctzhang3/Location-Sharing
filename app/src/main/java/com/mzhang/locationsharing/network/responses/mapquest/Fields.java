
package com.mzhang.locationsharing.network.responses.mapquest;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;
import java.util.Map;

public class Fields implements Parcelable {

    private String phone;
    private String sideOfStreet;
    private String groupSicCode;
    private String state;
    private Double lng;
    private String groupSicCodeName;
    private String city;
    private String country;
    private String groupSicCodeNameExt;
    private String id;
    private MqapGeography mqapGeography;
    private String address;
    private String postalCode;
    private String name;
    private String mqapId;
    private String groupSicCodeExt;
    private Double dispLat;
    private Double lat;
    private Double dispLng;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Fields(){

    }

    /**
     * 
     * @return
     *     The phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 
     * @param phone
     *     The phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 
     * @return
     *     The sideOfStreet
     */
    public String getSideOfStreet() {
        return sideOfStreet;
    }

    /**
     * 
     * @param sideOfStreet
     *     The side_of_street
     */
    public void setSideOfStreet(String sideOfStreet) {
        this.sideOfStreet = sideOfStreet;
    }

    /**
     * 
     * @return
     *     The groupSicCode
     */
    public String getGroupSicCode() {
        return groupSicCode;
    }

    /**
     * 
     * @param groupSicCode
     *     The group_sic_code
     */
    public void setGroupSicCode(String groupSicCode) {
        this.groupSicCode = groupSicCode;
    }

    /**
     * 
     * @return
     *     The state
     */
    public String getState() {
        return state;
    }

    /**
     * 
     * @param state
     *     The state
     */
    public void setState(String state) {
        this.state = state;
    }

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
     *     The groupSicCodeName
     */
    public String getGroupSicCodeName() {
        return groupSicCodeName;
    }

    /**
     * 
     * @param groupSicCodeName
     *     The group_sic_code_name
     */
    public void setGroupSicCodeName(String groupSicCodeName) {
        this.groupSicCodeName = groupSicCodeName;
    }

    /**
     * 
     * @return
     *     The city
     */
    public String getCity() {
        return city;
    }

    /**
     * 
     * @param city
     *     The city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 
     * @return
     *     The country
     */
    public String getCountry() {
        return country;
    }

    /**
     * 
     * @param country
     *     The country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 
     * @return
     *     The groupSicCodeNameExt
     */
    public String getGroupSicCodeNameExt() {
        return groupSicCodeNameExt;
    }

    /**
     * 
     * @param groupSicCodeNameExt
     *     The group_sic_code_name_ext
     */
    public void setGroupSicCodeNameExt(String groupSicCodeNameExt) {
        this.groupSicCodeNameExt = groupSicCodeNameExt;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The mqapGeography
     */
    public MqapGeography getMqapGeography() {
        return mqapGeography;
    }

    /**
     * 
     * @param mqapGeography
     *     The mqap_geography
     */
    public void setMqapGeography(MqapGeography mqapGeography) {
        this.mqapGeography = mqapGeography;
    }

    /**
     * 
     * @return
     *     The address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 
     * @param address
     *     The address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 
     * @return
     *     The postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * 
     * @param postalCode
     *     The postal_code
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
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
     *     The mqapId
     */
    public String getMqapId() {
        return mqapId;
    }

    /**
     * 
     * @param mqapId
     *     The mqap_id
     */
    public void setMqapId(String mqapId) {
        this.mqapId = mqapId;
    }

    /**
     * 
     * @return
     *     The groupSicCodeExt
     */
    public String getGroupSicCodeExt() {
        return groupSicCodeExt;
    }

    /**
     * 
     * @param groupSicCodeExt
     *     The group_sic_code_ext
     */
    public void setGroupSicCodeExt(String groupSicCodeExt) {
        this.groupSicCodeExt = groupSicCodeExt;
    }

    /**
     * 
     * @return
     *     The dispLat
     */
    public Double getDispLat() {
        return dispLat;
    }

    /**
     * 
     * @param dispLat
     *     The disp_lat
     */
    public void setDispLat(Double dispLat) {
        this.dispLat = dispLat;
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

    /**
     * 
     * @return
     *     The dispLng
     */
    public Double getDispLng() {
        return dispLng;
    }

    /**
     * 
     * @param dispLng
     *     The disp_lng
     */
    public void setDispLng(Double dispLng) {
        this.dispLng = dispLng;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Fields(Parcel in){

        this.phone = in.readString();
        this.sideOfStreet = in.readString();
        this.groupSicCode = in.readString();
        this.state = in.readString();
        this.lng = in.readDouble();
        this.groupSicCodeName = in.readString();
        this.city = in.readString();
        this.country = in.readString();
        this.groupSicCodeNameExt = in.readString();
        this.id = in.readString();
        this.mqapGeography = in.readParcelable(MqapGeography.class.getClassLoader());
        this.address = in.readString();
        this.postalCode = in.readString();
        this.name = in.readString();
        this.mqapId = in.readString();
        this.groupSicCodeExt = in.readString();
        this.dispLat = in.readDouble();
        this.lat = in.readDouble();
        this.dispLng = in.readDouble();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString((this.phone!=null)? this.phone : "");
        dest.writeString((this.sideOfStreet!=null)? this.sideOfStreet : "");
        dest.writeString((this.groupSicCode!=null)? this.groupSicCode : "");
        dest.writeString((this.state!=null)? this.state : "");
        dest.writeDouble((this.lng!=null)? this.lng : 0.0);
        dest.writeString((this.groupSicCodeName!=null)? this.groupSicCodeName : "");
        dest.writeString((this.city!=null)? this.city:"");
        dest.writeString((this.country!=null)?this.country:"");
        dest.writeString((this.groupSicCodeNameExt!=null)?this.groupSicCodeNameExt:"");
        dest.writeString((this.id!=null)?this.id:"");
        dest.writeParcelable(mqapGeography,flags);
        dest.writeString((this.address!=null)?this.address:"");
        dest.writeString((this.postalCode!=null)?this.postalCode:"");
        dest.writeString((this.name!=null)?this.name:"");
        dest.writeString((this.mqapId!=null)?this.mqapId:"");
        dest.writeString((this.groupSicCodeExt!=null)?this.groupSicCodeExt:"");
        dest.writeDouble((this.dispLat!=null)?this.dispLat:0.0);
        dest.writeDouble((this.lat!=null)?this.lat:0.0);
        dest.writeDouble((this.dispLng!=null)?this.dispLng:0.0);

    }

    public static final Creator<Fields> CREATOR = new Creator<Fields>() {
        public Fields createFromParcel(Parcel in) {
            return new Fields(in);
        }

        public Fields[] newArray(int size) {
            return new Fields[size];
        }
    };
}
