package com.mzhang.locationsharing.network;

import com.android.volley.Request;
import com.android.volley.Response;
import com.mzhang.locationsharing.MyApp;
import com.mzhang.locationsharing.network.responses.mapquest.AddressSearch;
import com.mzhang.locationsharing.network.responses.mapquest.Reverse;

import java.util.Map;

/**
 * Created by v579294 on 5/4/17.
 */

public class RequestController {
    private Request mRequest;
    private Constants.serviceName mServiceName;
    private Response.Listener mSuccessListener;
    private Response.ErrorListener mErrorListener;
    private Map<String, String> mHeaders;
    private Map<String, String> mParams;
    private String mPathParam;
    private String mJsonBody;
    private String mURI;

    public RequestController(Constants.serviceName serviceName, Map<String, String> headers,
                             Map<String, String> params, String pathParm,
                             Response.Listener listener, Response.ErrorListener errorListener) {
        this.mServiceName = serviceName;
        this.mHeaders = headers;
        this.mParams = params;
        this.mPathParam = pathParm;
        this.mSuccessListener = listener;
        this.mErrorListener = errorListener;
        setUpRequest();
    }

    private void setUpRequest() {

        switch (mServiceName) {
            case GEO_CODE:
                mURI = Constants.HOST_MAPQUEST_API + mPathParam;
                mRequest = new GsonRequest<AddressSearch>(Request.Method.GET, mURI, AddressSearch.class,
                        mHeaders, mParams, mSuccessListener, mErrorListener);
                break;
            case GEO_REVERSE:
                mURI = Constants.HOST_MAPQUEST_API + mPathParam;
                mRequest = new GsonRequest<Reverse>(Request.Method.GET, mURI, Reverse.class,
                        mHeaders, mParams, mSuccessListener, mErrorListener);
                break;

            default:
                break;
        }
    }

    public void execute() {
        if (mRequest != null) {
            MyApp.getInstance().addToRequestQueue(mRequest, mServiceName.name());
        }

    }
}
