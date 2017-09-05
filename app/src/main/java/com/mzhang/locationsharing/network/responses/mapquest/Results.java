package com.mzhang.locationsharing.network.responses.mapquest;

/**
 * Created by v579294 on 9/1/17.
 */

public class Results {
    private Locations[] locations;

    private ProvidedLocation providedLocation;

    public Locations[] getLocations ()
    {
        return locations;
    }

    public void setLocations (Locations[] locations)
    {
        this.locations = locations;
    }

    public ProvidedLocation getProvidedLocation ()
    {
        return providedLocation;
    }

    public void setProvidedLocation (ProvidedLocation providedLocation)
    {
        this.providedLocation = providedLocation;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [locations = "+locations+", providedLocation = "+providedLocation+"]";
    }
}
