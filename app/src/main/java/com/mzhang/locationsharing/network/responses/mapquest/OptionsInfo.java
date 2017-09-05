package com.mzhang.locationsharing.network.responses.mapquest;

/**
 * Created by v579294 on 9/1/17.
 */

public class OptionsInfo {
    private String ignoreLatLngInput;

    private String thumbMaps;

    private String maxResults;

    public String getIgnoreLatLngInput ()
    {
        return ignoreLatLngInput;
    }

    public void setIgnoreLatLngInput (String ignoreLatLngInput)
    {
        this.ignoreLatLngInput = ignoreLatLngInput;
    }

    public String getThumbMaps ()
    {
        return thumbMaps;
    }

    public void setThumbMaps (String thumbMaps)
    {
        this.thumbMaps = thumbMaps;
    }

    public String getMaxResults ()
    {
        return maxResults;
    }

    public void setMaxResults (String maxResults)
    {
        this.maxResults = maxResults;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [ignoreLatLngInput = "+ignoreLatLngInput+", thumbMaps = "+thumbMaps+", maxResults = "+maxResults+"]";
    }
}
