package com.mzhang.locationsharing.network.responses.mapquest;

/**
 * Created by v579294 on 9/1/17.
 */

public class Reverse {
    private Results[] results;

    private OptionsInfo options;

    private Info info;

    public Results[] getResults ()
    {
        return results;
    }

    public void setResults (Results[] results)
    {
        this.results = results;
    }

    public OptionsInfo getOptions ()
    {
        return options;
    }

    public void setOptions (OptionsInfo options)
    {
        this.options = options;
    }

    public Info getInfo ()
    {
        return info;
    }

    public void setInfo (Info info)
    {
        this.info = info;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [results = "+results+", options = "+options+", info = "+info+"]";
    }
}
