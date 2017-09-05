package com.mzhang.locationsharing.network.responses.mapquest;

/**
 * Created by v579294 on 9/1/17.
 */

public class Locations {
    private String unknownInput;

    private LatLng latLng;

    private String adminArea5Type;

    private String adminArea4;

    private String adminArea5;

    private String adminArea4Type;

    private String adminArea6;

    private String street;

    private String nearestIntersection;

    private String adminArea1;

    private String adminArea3;

    private String type;

    private LatLng displayLatLng;

    private String linkId;

    private String postalCode;

    private String sideOfStreet;

    private String dragPoint;

    private RoadMetadata roadMetadata;

    private String adminArea1Type;

    private String geocodeQuality;

    private String adminArea6Type;

    private String geocodeQualityCode;

    private String mapUrl;

    private String adminArea3Type;

    public String getUnknownInput ()
    {
        return unknownInput;
    }

    public void setUnknownInput (String unknownInput)
    {
        this.unknownInput = unknownInput;
    }

    public LatLng getLatLng ()
    {
        return latLng;
    }

    public void setLatLng (LatLng latLng)
    {
        this.latLng = latLng;
    }

    public String getAdminArea5Type ()
    {
        return adminArea5Type;
    }

    public void setAdminArea5Type (String adminArea5Type)
    {
        this.adminArea5Type = adminArea5Type;
    }

    public String getAdminArea4 ()
    {
        return adminArea4;
    }

    public void setAdminArea4 (String adminArea4)
    {
        this.adminArea4 = adminArea4;
    }

    public String getAdminArea5 ()
    {
        return adminArea5;
    }

    public void setAdminArea5 (String adminArea5)
    {
        this.adminArea5 = adminArea5;
    }

    public String getAdminArea4Type ()
    {
        return adminArea4Type;
    }

    public void setAdminArea4Type (String adminArea4Type)
    {
        this.adminArea4Type = adminArea4Type;
    }

    public String getAdminArea6 ()
    {
        return adminArea6;
    }

    public void setAdminArea6 (String adminArea6)
    {
        this.adminArea6 = adminArea6;
    }

    public String getStreet ()
    {
        return street;
    }

    public void setStreet (String street)
    {
        this.street = street;
    }

    public String getNearestIntersection ()
    {
        return nearestIntersection;
    }

    public void setNearestIntersection (String nearestIntersection)
    {
        this.nearestIntersection = nearestIntersection;
    }

    public String getAdminArea1 ()
    {
        return adminArea1;
    }

    public void setAdminArea1 (String adminArea1)
    {
        this.adminArea1 = adminArea1;
    }

    public String getAdminArea3 ()
    {
        return adminArea3;
    }

    public void setAdminArea3 (String adminArea3)
    {
        this.adminArea3 = adminArea3;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public LatLng getDisplayLatLng ()
    {
        return displayLatLng;
    }

    public void setDisplayLatLng (LatLng displayLatLng)
    {
        this.displayLatLng = displayLatLng;
    }

    public String getLinkId ()
    {
        return linkId;
    }

    public void setLinkId (String linkId)
    {
        this.linkId = linkId;
    }

    public String getPostalCode ()
    {
        return postalCode;
    }

    public void setPostalCode (String postalCode)
    {
        this.postalCode = postalCode;
    }

    public String getSideOfStreet ()
    {
        return sideOfStreet;
    }

    public void setSideOfStreet (String sideOfStreet)
    {
        this.sideOfStreet = sideOfStreet;
    }

    public String getDragPoint ()
    {
        return dragPoint;
    }

    public void setDragPoint (String dragPoint)
    {
        this.dragPoint = dragPoint;
    }

    public RoadMetadata getRoadMetadata ()
    {
        return roadMetadata;
    }

    public void setRoadMetadata (RoadMetadata roadMetadata)
    {
        this.roadMetadata = roadMetadata;
    }

    public String getAdminArea1Type ()
    {
        return adminArea1Type;
    }

    public void setAdminArea1Type (String adminArea1Type)
    {
        this.adminArea1Type = adminArea1Type;
    }

    public String getGeocodeQuality ()
    {
        return geocodeQuality;
    }

    public void setGeocodeQuality (String geocodeQuality)
    {
        this.geocodeQuality = geocodeQuality;
    }

    public String getAdminArea6Type ()
    {
        return adminArea6Type;
    }

    public void setAdminArea6Type (String adminArea6Type)
    {
        this.adminArea6Type = adminArea6Type;
    }

    public String getGeocodeQualityCode ()
    {
        return geocodeQualityCode;
    }

    public void setGeocodeQualityCode (String geocodeQualityCode)
    {
        this.geocodeQualityCode = geocodeQualityCode;
    }

    public String getMapUrl ()
    {
        return mapUrl;
    }

    public void setMapUrl (String mapUrl)
    {
        this.mapUrl = mapUrl;
    }

    public String getAdminArea3Type ()
    {
        return adminArea3Type;
    }

    public void setAdminArea3Type (String adminArea3Type)
    {
        this.adminArea3Type = adminArea3Type;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [unknownInput = "+unknownInput+", latLng = "+latLng+", adminArea5Type = "+adminArea5Type+", adminArea4 = "+adminArea4+", adminArea5 = "+adminArea5+", adminArea4Type = "+adminArea4Type+", adminArea6 = "+adminArea6+", street = "+street+", nearestIntersection = "+nearestIntersection+", adminArea1 = "+adminArea1+", adminArea3 = "+adminArea3+", type = "+type+", displayLatLng = "+displayLatLng+", linkId = "+linkId+", postalCode = "+postalCode+", sideOfStreet = "+sideOfStreet+", dragPoint = "+dragPoint+", roadMetadata = "+roadMetadata+", adminArea1Type = "+adminArea1Type+", geocodeQuality = "+geocodeQuality+", adminArea6Type = "+adminArea6Type+", geocodeQualityCode = "+geocodeQualityCode+", mapUrl = "+mapUrl+", adminArea3Type = "+adminArea3Type+"]";
    }
}
