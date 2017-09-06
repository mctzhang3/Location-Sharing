package com.mzhang.locationsharing.features.locationTrack;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.SettingsClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.mapbox.mapboxsdk.annotations.Marker;
import com.mapbox.mapboxsdk.annotations.MarkerOptions;
import com.mapbox.mapboxsdk.annotations.Polyline;
import com.mapbox.mapboxsdk.annotations.PolylineOptions;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.camera.CameraUpdateFactory;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapquest.mapping.maps.MapView;
import com.mapquest.mapping.maps.MapboxMap;
import com.mapquest.mapping.maps.OnMapReadyCallback;
import com.mzhang.locationsharing.R;
import com.mzhang.locationsharing.network.Constants;
import com.mzhang.locationsharing.network.RequestController;
import com.mzhang.locationsharing.network.responses.mapquest.Locations;
import com.mzhang.locationsharing.network.responses.mapquest.Results;
import com.mzhang.locationsharing.network.responses.mapquest.Reverse;
//import com.mapquest.mapping.MapQuestAccountManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.google.android.gms.location.LocationServices.getFusedLocationProviderClient;
//import static com.mapbox.mapboxsdk.Mapbox.getApplicationContext;
//import static com.mapzen.android.lost.api.LocationServices.FusedLocationApi;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MapFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MapFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MapFragment extends Fragment implements LocationListener,
        GoogleApiClient.ConnectionCallbacks, MapboxMap.OnInfoWindowClickListener,
        MapboxMap.OnMarkerClickListener, MapView.OnMapChangedListener,
        Response.Listener, Response.ErrorListener {
    private static final String TAG = "MapFragment";
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    protected Activity mActivity;
    private MapView mMapView;
    private MapboxMap mMapboxMap;
    public Location mCurrentLocation;
    private LocationManager mLocationManager;

    private DatabaseReference mRef;
    private DatabaseReference mLocationRef;

    private FirebaseRecyclerAdapter<LocationInfo, InfoViewHolder> mAdapter;
    private static int SIGN_IN_REQUEST_CODE = 1001;
    private static int REQUEST_LOCATION = 1002;
    private RecyclerView mMessages;
    private LinearLayoutManager mManager;
    private boolean bUserLoggedin = false;
    private final Gson gson = new Gson();
//    private List<LatLng> mRoutePoints = new ArrayList<LatLng>();
    private Map<String, List<LatLng>> mRoutePoints = new HashMap<>();

//    private GoogleApiClient mGoogleApiClient;

    private OnFragmentInteractionListener mListener;

    private LocationRequest mLocationRequest;
    private boolean bUserInteraction = false;

    private long UPDATE_INTERVAL = 10 * 1000;  /* 10 secs */
    private long FASTEST_INTERVAL = 2000; /* 2 sec */

    private static final int EDIT_MENU_ITEM_ID = 6;
    private boolean isTrackable = false;
    private boolean isSharing = false;
    private Menu menu;

    // current speed
//    private String mCurrentSpeed = "";
    private String mSpeedLimit = "";
    private Map<String, Marker> mMarkers = new HashMap<>();
    private Marker mMarker = null;
    private boolean bIsMarkerClicked = false;

    public MapFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MapFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MapFragment newInstance(String param1, String param2) {
        MapFragment fragment = new MapFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        MapQuestAccountManager.start(getApplicationContext());
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_map, container, false);

        setHasOptionsMenu(true);
        if (checkPermissions()) {
            getLastLocation();
            startLocationUpdates();
        }
//        buildGoogleApiClient();
//        mCurrentLocation = FusedLocationApi.getLastLocation();
        mMapView = (MapView) rootView.findViewById(R.id.mapquest_mapFragment);
        mMapView.onCreate(savedInstanceState);
        mMapView.getMapAsync(onMapReadyCallback);
//        mMapView.addOnMapChangedListener(MapFragment.this);
        mMapView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (!bUserInteraction) {
                    addOptionMenuItem(R.string.center_curr_loc);
                    bUserInteraction = true;
                }
                return false;
            }
        });
//        setLocationServices();

        //        Set up location sharing channel
        mRef = FirebaseDatabase.getInstance().getReference();
        mLocationRef = mRef;
        mManager = new LinearLayoutManager(mActivity);
        mManager.setReverseLayout(false);

        mMessages = (RecyclerView) rootView.findViewById(R.id.messagesList);
        mMessages.setHasFixedSize(false);
        mMessages.setLayoutManager(mManager);

        if (FirebaseAuth.getInstance().getCurrentUser() == null) {
            // Start sign in/sign up activity
            startActivityForResult(
                    AuthUI.getInstance()
                            .createSignInIntentBuilder()
                            .build(),
                    SIGN_IN_REQUEST_CODE
            );
        } else {
            // User is already signed in. Therefore, display
            displayLocationMessages();
        }

        return rootView;
    }

    private OnMapReadyCallback onMapReadyCallback = new OnMapReadyCallback() {

        @Override
        public void onMapReady(MapboxMap mapboxMap) {
            mMapboxMap = mapboxMap;
            mMapboxMap.getUiSettings().setRotateGesturesEnabled(false);
            mMapboxMap.getUiSettings().setTiltGesturesEnabled(false);
            mMapboxMap.setMyLocationEnabled(true);
            mMapboxMap.setOnMapClickListener(mapClickListener);
            if (mCurrentLocation != null) {
                displayLocation(mCurrentLocation);
            }
            mMapboxMap.setOnInfoWindowClickListener(MapFragment.this);
//            mMapboxMap.setOnMarkerClickListener(MapFragment.this);
        }
    };

    public void displayLocation(Location location) {
        CameraPosition position = new CameraPosition.Builder()
                .target(new LatLng(location.getLatitude(), location.getLongitude())) // Sets the new camera position
                .zoom(12) // Sets the zoom
                .build(); // Creates a CameraPosition from the builder
        if ((mMapboxMap != null) && !bUserInteraction) {
            mMapboxMap.animateCamera(CameraUpdateFactory.newCameraPosition(position), 2000);
        }

    }

    private void setLocationServices() {
        Context context = mActivity.getApplicationContext();

        if (ActivityCompat.checkSelfPermission(context,
                Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED
                && ActivityCompat.checkSelfPermission(context,
                Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            ActivityCompat.requestPermissions(mActivity,
                    new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                    REQUEST_LOCATION);
            return;
        }

        mLocationManager = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
        mLocationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 0, 0, this);
        mLocationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, this);
//        mCurrentLocation = LocationServices.FusedLocationApi.getLastLocation(mGoogleApiClient);

    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mActivity = getActivity();

//        if (context instanceof OnFragmentInteractionListener) {
////            mListener = (OnFragmentInteractionListener) context;
//        } else {
//            throw new RuntimeException(context.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    com.mapbox.mapboxsdk.maps.MapboxMap.OnMapClickListener mapClickListener =
            new com.mapbox.mapboxsdk.maps.MapboxMap.OnMapClickListener() {
        @Override
        public void onMapClick(@NonNull LatLng latLng) {
            if (!bUserInteraction) {
                addOptionMenuItem(R.string.center_curr_loc);
                bUserInteraction = true;
            }
        }
    };

    //    private synchronized void buildGoogleApiClient() {
//        mGoogleApiClient = new GoogleApiClient.Builder(mActivity)
//                .addConnectionCallbacks(this).addApi(LocationServices.API)
//                .build();
//        mGoogleApiClient.connect();
//    }

    @SuppressWarnings({"MissingPermission"})
    public void getLastLocation() {
        // Get last known recent location using new Google Play Services SDK (v11+)
        Context context = mActivity.getApplicationContext();
        FusedLocationProviderClient locationClient = getFusedLocationProviderClient(context);

        locationClient.getLastLocation()
                .addOnSuccessListener(new OnSuccessListener<Location>() {
                    @Override
                    public void onSuccess(Location location) {
                        // GPS location can be null if GPS is switched off
                        if (location != null) {
                            onLocationChanged(location);
                        }
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.d("MapDemoActivity", "Error trying to get last GPS location");
                        e.printStackTrace();
                    }
                });
    }

    // Trigger new location updates at interval
    @SuppressWarnings({"MissingPermission"})
    protected void startLocationUpdates() {
        Context context = mActivity.getApplicationContext();

        // Create the location request to start receiving updates
        mLocationRequest = new LocationRequest();
        mLocationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
        mLocationRequest.setInterval(UPDATE_INTERVAL);
        mLocationRequest.setFastestInterval(FASTEST_INTERVAL);

        // Create LocationSettingsRequest object using location request
        LocationSettingsRequest.Builder builder = new LocationSettingsRequest.Builder();
        builder.addLocationRequest(mLocationRequest);
        LocationSettingsRequest locationSettingsRequest = builder.build();

        // Check whether location settings are satisfied
        // https://developers.google.com/android/reference/com/google/android/gms/location/SettingsClient
        SettingsClient settingsClient = LocationServices.getSettingsClient(context);
        settingsClient.checkLocationSettings(locationSettingsRequest);

        // new Google API SDK v11 uses getFusedLocationProviderClient(this)
//        if (ActivityCompat.checkSelfPermission(context,
//                Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED
//                && ActivityCompat.checkSelfPermission(context,
//                Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
//            // TODO: Consider calling
//            //    ActivityCompat#requestPermissions
//            // here to request the missing permissions, and then overriding
//            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
//            //                                          int[] grantResults)
//            // to handle the case where the user grants the permission. See the documentation
//            // for ActivityCompat#requestPermissions for more details.
//            return;
//        }
        if (checkPermissions()) {
            getFusedLocationProviderClient(context).requestLocationUpdates(mLocationRequest, new LocationCallback() {
                        @Override
                        public void onLocationResult(LocationResult locationResult) {
                            // do work here
                            onLocationChanged(locationResult.getLastLocation());
                        }
                    },
                    Looper.myLooper());
        }
    }

    private boolean checkPermissions() {
        Context context = mActivity.getApplicationContext();
        if (ActivityCompat.checkSelfPermission(context,
                Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            requestPermissions();
            return false;
        }
    }

    private void requestPermissions() {
        ActivityCompat.requestPermissions(mActivity,
                new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                REQUEST_LOCATION);
    }

    @Override
    public void onLocationChanged(Location location) {
        mCurrentLocation = location;
        LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
        sendSpeedLimitRequest(latLng);
        float speed = location.getSpeed() * 3600 / 1609;
        speed = ((int) (speed * 10)) / 10;
        LocationData locationData = new LocationData(latLng, speed, mSpeedLimit);
        String locString = gson.toJson(locationData);
        if (isSharing) {
            sendLocationMsg(locString);
        }
        displayLocation(location);
    }

    private void sendSpeedLimitRequest(LatLng latLng) {
        StringBuffer pathParam = new StringBuffer("");
        String latLngStr = Double.toString(latLng.getLatitude()) + ","
                + Double.toString(latLng.getLongitude());

        Map<String, String> headers = new HashMap<String, String>();
        headers.put("Content-Type", "application/json");
        headers.put("Accept", "application/json");

        pathParam.append("/geocoding/v1/reverse?key=")
                .append(getResources().getString(R.string.mapquest_key))
                .append("&location=")
                .append(latLngStr)
                .append("&includeRoadMetadata=true&includeNearestIntersection=true");

        RequestController geocodeRequest = new RequestController(Constants.serviceName.GEO_REVERSE, headers, null,
                pathParam.toString(), this, this);

        geocodeRequest.execute();

    }

    @Override
    public void onErrorResponse(VolleyError error) {

    }

    @Override
    public void onResponse(Object response) {
        if (response instanceof Reverse) {
            Reverse reverse = (Reverse) response;
            Results[] results = reverse.getResults();
            Locations[] locations = results[0].getLocations();
//            Results results1 = results[0];
            mSpeedLimit = locations[0].getRoadMetadata().getSpeedLimit();

        }

    }


    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }

    private void displayLocationMessages() {
        bUserLoggedin = true;
        Query lastFifty = mLocationRef.limitToLast(6);
        mAdapter = new FirebaseRecyclerAdapter<LocationInfo, InfoViewHolder>(
                LocationInfo.class, R.layout.message_b, InfoViewHolder.class, lastFifty) {
            @Override
            public void populateViewHolder(InfoViewHolder holder, LocationInfo info, int position) {
                long timeStamp = info.getMessageTime();
                String msgUser = info.getName();
                String msgText = info.getmLatLng();

                Log.d(TAG, "received msg position: " + position);
                Log.d(TAG, "received from: " + msgUser);
                Log.d(TAG, "received msg: " + msgText);

//                String currentUser = FirebaseAuth.getInstance().getCurrentUser().getDisplayName();

                if ((msgText != null) && isSharing) {
                    addMarker(info);
                }
            }

        };

        // Scroll to bottom on new messages
        mAdapter.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() {
            @Override
            public void onItemRangeInserted(int positionStart, int itemCount) {
                mManager.smoothScrollToPosition(mMessages, null, mAdapter.getItemCount());
            }
        });

        mMessages.setAdapter(mAdapter);
    }

    private void addMarker(LocationInfo info) {
        String msgUser = info.getName();
        String msgText = info.getmLatLng();
//        List<LatLng> points = new ArrayList<LatLng>();

        Log.d(TAG, "received msg msgText: " + msgText);
        LocationData locationData;
        LatLng latLng;

        try {
            locationData = gson.fromJson(msgText, LocationData.class);
        } catch (IllegalStateException | JsonSyntaxException exception) {
            Log.d(TAG, "exception msg: " + msgText);
            exception.printStackTrace();
            return;
        }

        latLng = locationData.getLatLng();
        String currentUser = FirebaseAuth.getInstance().getCurrentUser().getDisplayName();
        if (currentUser.equalsIgnoreCase(msgUser)) {
//            return;
        }

        boolean bIsInfoWindowShown = false;
        Marker marker = mMarkers.get(msgUser);

        if (mMapboxMap != null) {
            if (marker != null) {
                bIsInfoWindowShown = marker.isInfoWindowShown();
                mMapboxMap.removeAnnotation(marker);
            }

            if (isTrackable) {
                List<LatLng> points = mRoutePoints.get(msgUser);
                if (points == null) {
                    points = new ArrayList<LatLng>();
                }

                points.add(latLng);
                mPolyLine = mPolyLines.get(msgUser);
                if (mPolyLine != null) {
                    mMapboxMap.removeAnnotation(mPolyLine);
                }
                mRoutePoints.put(msgUser, points);
                drawPolylines(points);
                mPolyLines.put(msgUser, mPolyLine);
            }

            mMarker = mMapboxMap.addMarker(new MarkerOptions().position(latLng).title(msgUser));

            mMarker.setTitle(msgUser + "\n" + "Current Speed: " + locationData.getDeviceSpeed()
                    + "\nRoad Speed Limit: " + locationData.getRoadSpeedLimit());

            mMarkers.put(msgUser, mMarker);

            if (bIsInfoWindowShown) {
                mMarker.showInfoWindow(mMapboxMap, mMapView);
            }
        }
    }

//    private void displayMarkerInfoWindow() {
//            mMarker.showInfoWindow(mMapboxMap, mMapView);
//    }

    private void sendLocationMsg(String message) {
        if (!bUserLoggedin) {
            return;
        }

        String user = FirebaseAuth.getInstance().getCurrentUser().getDisplayName();
        String msg = message;

        if (msg.isEmpty()) {
            return;
        }

        mLocationRef.push()
                .setValue(new LocationInfo(msg, user));
    }

    @Override
    public void onConnected(@Nullable Bundle bundle) {

    }

    @Override
    public void onConnectionSuspended(int i) {

    }

    private Map<String, Polyline> mPolyLines = new HashMap<>();
    private Polyline mPolyLine;

    public void drawPolylines(List<LatLng> points) {
        if (points.size() > 1) {
            LatLng[] pointsArray = points.toArray(new LatLng[points.size()]);
            // Draw Points on MapView
            if (mMapboxMap != null) {
                if (mPolyLine != null) {
//                    mMapboxMap.removeAnnotation(mPolyLine);
                    mPolyLine.remove();
                    mPolyLine = null;
                }

                mPolyLine = mMapboxMap.addPolyline(new PolylineOptions()
                        .add(pointsArray)
                        .color(Color.parseColor("#564EFC"))
                        .width(6));
            }
        }

    }

    @Override
    public boolean onMarkerClick(@NonNull Marker marker) {
//        bIsMarkerClicked = true;
//        marker.showInfoWindow(mMapboxMap, mMapView);
//        mMarker = marker;
        return false;
    }

    @Override
    public boolean onInfoWindowClick(@NonNull Marker marker) {
        if (marker == null) return false;

        if (marker.isInfoWindowShown()) {
            marker.hideInfoWindow();
//            bIsMarkerClicked = false;
        } else {
            marker.showInfoWindow(mMapboxMap, mMapView);
        }

        return true;
    }

    @Override
    public void onMapChanged(int i) {
//        if ((mMarker != null) && bIsMarkerClicked) {
//            mMarker.showInfoWindow(mMapboxMap, mMapView);
//        }
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    private void addOptionMenuItem(int item) {
        menu.add(0, R.id.menu_center_loc, 0, item);
    }

    private void removeMenuItem() {
        menu.removeItem(R.id.menu_center_loc);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
//        super.onCreateOptionsMenu(menu, inflater);
        this.menu = menu;
        menu.clear();
        inflater.inflate(R.menu.main_menu, menu);
        menu.removeItem(R.id.menu_center_loc);
//        menu.add(0, EDIT_MENU_ITEM_ID, 0, R.string.enable_tracking);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menu_sign_out:
                AuthUI.getInstance().signOut((FragmentActivity)mActivity)
                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                Toast.makeText(mActivity,
                                        "You have been signed out.",
                                        Toast.LENGTH_LONG)
                                        .show();

                                // Close activity
//                                mActivity.finish();
                            }
                        });
                return true;
            case R.id.menu_enable_share:
                if (isSharing) {
                    isSharing = false;
                    isTrackable = false;
                    mRoutePoints.clear();
                    if (mMapboxMap != null) {
                        mMapboxMap.clear();
                    }
                    menu.getItem(1).setTitle(R.string.enable_sharing);
                } else {
                    isSharing = true;
                    menu.getItem(1).setTitle(R.string.disable_sharing);
                }
                return true;
            case R.id.menu_enable_track:
                if (isTrackable) {
                    isTrackable = false;
                    mRoutePoints.clear();
                    menu.getItem(2).setTitle(R.string.enable_tracking);
                } else {
                    if(isSharing) {
                        isTrackable = true;
                        menu.getItem(2).setTitle(R.string.disable_tracking);
                    } else {
                        Toast.makeText(mActivity, "Please share location before enable tracking",
                                Toast.LENGTH_SHORT);
                    }
                }
                return true;
            case R.id.menu_center_loc:
                bUserInteraction = false;
                menu.removeItem(R.id.menu_center_loc);
                if (mCurrentLocation != null) {
                    displayLocation(mCurrentLocation);
                }
                return true;

            default:
                return false;
        }
    }

}
