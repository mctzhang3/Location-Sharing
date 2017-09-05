package com.mzhang.locationsharing.network.responses.mapquest;

/**
 * Created by v579294 on 9/1/17.
 */

public class RoadMetadata
{
    private String speedLimit;

    private String speedLimitUnits;

    private String tollRoad;

    public String getSpeedLimit ()
    {
        return speedLimit;
    }

    public void setSpeedLimit (String speedLimit)
    {
        this.speedLimit = speedLimit;
    }

    public String getSpeedLimitUnits ()
    {
        return speedLimitUnits;
    }

    public void setSpeedLimitUnits (String speedLimitUnits)
    {
        this.speedLimitUnits = speedLimitUnits;
    }

    public String getTollRoad ()
{
    return tollRoad;
}

    public void setTollRoad (String tollRoad)
    {
        this.tollRoad = tollRoad;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [speedLimit = "+speedLimit+", speedLimitUnits = "+speedLimitUnits+", tollRoad = "+tollRoad+"]";
    }
}
