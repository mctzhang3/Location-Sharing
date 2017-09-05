package com.mzhang.locationsharing.network;

import android.util.Log;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/**
 * Created by v579294 on 2/23/16.
 */
public class GsonRequest<T> extends Request<T> {
    private String TAG = this.getClass().getSimpleName();
    private final Gson gson = new Gson();
    private final Class<T> clazz;
    private final Map<String, String> headers;
    private final Map<String, String> params;
    private final Response.Listener<T> listener;

    private final String url;

    public GsonRequest(int method, String url, Class<T> clazz, Map<String, String> headers,
                       Map<String, String> params, Response.Listener<T> listener, Response.ErrorListener errorListener) {
        super(method, url, errorListener);
        this.clazz = clazz;
        this.headers = headers;
        this.listener = listener;
        this.params = params;
        this.url = url;
    }

    @Override
    public Map<String, String> getHeaders() throws AuthFailureError {
        return headers != null ? headers : super.getHeaders();
    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return params != null ? params : super.getParams();
    }

    @Override
    protected Response<T> parseNetworkResponse(NetworkResponse response) {
        try {
            displayServiceLog(response);

            String json = new String(response.data, HttpHeaderParser.parseCharset(response.headers));
//            String from = ""
//            String temp=json.replace("\"long\"", "\"Long\"");
            return Response.success(gson.fromJson(json, clazz),
                    HttpHeaderParser.parseCacheHeaders(response));
        } catch (UnsupportedEncodingException e) {
            return Response.error(new ParseError(e));
        } catch (JsonSyntaxException e) {
            return Response.error(new ParseError(e));
        }
    }

    @Override
    protected void deliverResponse(T response) {
        listener.onResponse(response);
    }

    private void displayServiceLog(NetworkResponse response) throws UnsupportedEncodingException {
        String json = new String(response.data, HttpHeaderParser.parseCharset(response.headers));
        Log.d(TAG, "=========================== Start Service Log =================");
        Log.d(TAG, "Request URL      : " + url);
        Log.d(TAG, "Request HEADER   : " + (headers != null ? headers : "null"));
        Log.d(TAG, "Request BODY     : " + (params != null ? params.toString() : "null"));
        Log.d(TAG, "Response HEADER  : " + response.headers.toString());
        Log.d(TAG, "Response BODY    : " + json);
        Log.d(TAG, "=========================== End Service Log =================");
    }

}