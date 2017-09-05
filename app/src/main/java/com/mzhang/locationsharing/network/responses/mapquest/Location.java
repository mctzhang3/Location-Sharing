
package com.mzhang.locationsharing.network.responses.mapquest;


import java.util.HashMap;
import java.util.Map;

public class Location {

    private String street;
    private String adminArea6;
    private String adminArea6Type;
    private String adminArea5;
    private String adminArea5Type;
    private String adminArea4;
    private String adminArea4Type;
    private String adminArea3;
    private String adminArea3Type;
    private String adminArea1;
    private String adminArea1Type;
    private String postalCode;
    private String geocodeQualityCode;
    private String geocodeQuality;
    private Boolean dragPoint;
    private String sideOfStreet;
    private String linkId;
    private String unknownInput;
    private String type;
    private LatLng latLng;
    private LatLng displayLatLng;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     *     The street
     */
    public String getStreet() {
        return street;
    }

    /**
     *
     * @param street
     *     The street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     *
     * @return
     *     The adminArea6
     */
    public String getAdminArea6() {
        return adminArea6;
    }

    /**
     *
     * @param adminArea6
     *     The adminArea6
     */
    public void setAdminArea6(String adminArea6) {
        this.adminArea6 = adminArea6;
    }

    /**
     *
     * @return
     *     The adminArea6Type
     */
    public String getAdminArea6Type() {
        return adminArea6Type;
    }

    /**
     *
     * @param adminArea6Type
     *     The adminArea6Type
     */
    public void setAdminArea6Type(String adminArea6Type) {
        this.adminArea6Type = adminArea6Type;
    }

    /**
     *
     * @return
     *     The adminArea5
     */
    public String getAdminArea5() {
        return adminArea5;
    }

    /**
     *
     * @param adminArea5
     *     The adminArea5
     */
    public void setAdminArea5(String adminArea5) {
        this.adminArea5 = adminArea5;
    }

    /**
     *
     * @return
     *     The adminArea5Type
     */
    public String getAdminArea5Type() {
        return adminArea5Type;
    }

    /**
     *
     * @param adminArea5Type
     *     The adminArea5Type
     */
    public void setAdminArea5Type(String adminArea5Type) {
        this.adminArea5Type = adminArea5Type;
    }

    /**
     *
     * @return
     *     The adminArea4
     */
    public String getAdminArea4() {
        return adminArea4;
    }

    /**
     *
     * @param adminArea4
     *     The adminArea4
     */
    public void setAdminArea4(String adminArea4) {
        this.adminArea4 = adminArea4;
    }

    /**
     *
     * @return
     *     The adminArea4Type
     */
    public String getAdminArea4Type() {
        return adminArea4Type;
    }

    /**
     *
     * @param adminArea4Type
     *     The adminArea4Type
     */
    public void setAdminArea4Type(String adminArea4Type) {
        this.adminArea4Type = adminArea4Type;
    }

    /**
     *
     * @return
     *     The adminArea3
     */
    public String getAdminArea3() {
        return adminArea3;
    }

    /**
     *
     * @param adminArea3
     *     The adminArea3
     */
    public void setAdminArea3(String adminArea3) {
        this.adminArea3 = adminArea3;
    }

    /**
     *
     * @return
     *     The adminArea3Type
     */
    public String getAdminArea3Type() {
        return adminArea3Type;
    }

    /**
     *
     * @param adminArea3Type
     *     The adminArea3Type
     */
    public void setAdminArea3Type(String adminArea3Type) {
        this.adminArea3Type = adminArea3Type;
    }

    /**
     *
     * @return
     *     The adminArea1
     */
    public String getAdminArea1() {
        return adminArea1;
    }

    /**
     *
     * @param adminArea1
     *     The adminArea1
     */
    public void setAdminArea1(String adminArea1) {
        this.adminArea1 = adminArea1;
    }

    /**
     *
     * @return
     *     The adminArea1Type
     */
    public String getAdminArea1Type() {
        return adminArea1Type;
    }

    /**
     *
     * @param adminArea1Type
     *     The adminArea1Type
     */
    public void setAdminArea1Type(String adminArea1Type) {
        this.adminArea1Type = adminArea1Type;
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
     *     The postalCode
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     *
     * @return
     *     The geocodeQualityCode
     */
    public String getGeocodeQualityCode() {
        return geocodeQualityCode;
    }

    /**
     *
     * @param geocodeQualityCode
     *     The geocodeQualityCode
     */
    public void setGeocodeQualityCode(String geocodeQualityCode) {
        this.geocodeQualityCode = geocodeQualityCode;
    }

    /**
     *
     * @return
     *     The geocodeQuality
     */
    public String getGeocodeQuality() {
        return geocodeQuality;
    }

    /**
     *
     * @param geocodeQuality
     *     The geocodeQuality
     */
    public void setGeocodeQuality(String geocodeQuality) {
        this.geocodeQuality = geocodeQuality;
    }

    /**
     *
     * @return
     *     The dragPoint
     */
    public Boolean getDragPoint() {
        return dragPoint;
    }

    /**
     *
     * @param dragPoint
     *     The dragPoint
     */
    public void setDragPoint(Boolean dragPoint) {
        this.dragPoint = dragPoint;
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
     *     The sideOfStreet
     */
    public void setSideOfStreet(String sideOfStreet) {
        this.sideOfStreet = sideOfStreet;
    }

    /**
     *
     * @return
     *     The linkId
     */
    public String getLinkId() {
        return linkId;
    }

    /**
     *
     * @param linkId
     *     The linkId
     */
    public void setLinkId(String linkId) {
        this.linkId = linkId;
    }

    /**
     *
     * @return
     *     The unknownInput
     */
    public String getUnknownInput() {
        return unknownInput;
    }

    /**
     *
     * @param unknownInput
     *     The unknownInput
     */
    public void setUnknownInput(String unknownInput) {
        this.unknownInput = unknownInput;
    }

    /**
     *
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
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

    /**
     *
     * @return
     *     The displayLatLng
     */
    public LatLng getDisplayLatLng() {
        return displayLatLng;
    }

    /**
     *
     * @param displayLatLng
     *     The displayLatLng
     */
    public void setDisplayLatLng(LatLng displayLatLng) {
        this.displayLatLng = displayLatLng;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

