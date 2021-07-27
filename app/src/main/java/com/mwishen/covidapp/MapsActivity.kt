package com.mwishen.covidapp


import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.app.ActivityCompat
import com.google.android.gms.location.LocationServices

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)//map loads bit by bits
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    //for below you need api key
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        val kangemi = LatLng(-1.2708984,36.7072066)
        mMap.addMarker(MarkerOptions().position(kangemi).title("Kangemi, Nairobi")
                                                        .snippet("Cases: 100"))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(kangemi, 13f))


        //another place
        val kasarani = LatLng(-1.2257908,36.887666)
        mMap.addMarker(MarkerOptions().position(kasarani).title("Kasarani, Nairobi")
            .snippet("Cases: 20"))

        //another place
        val ruaka = LatLng(-1.2071341,36.7562908)
        mMap.addMarker(MarkerOptions().position(ruaka).title("Ruaka, Nairobi")
            .snippet("Cases: 80"))

        //another place
        val westlands = LatLng(-1.2681247,36.8012739)
        mMap.addMarker(MarkerOptions().position(westlands).title("Westlands, Nairobi")
            .snippet("Cases: 110"))
        //Next is Global System Positioning
        //Our code will read cordinates of current location from your phone
        //Make sure your GPS is ON in your settings
        setupGPS()
    }

//here
    //gps
    fun setupGPS(){
        val fusedLocationClient = LocationServices.getFusedLocationProviderClient(this)
        if (ActivityCompat.checkSelfPermission(this,
                android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED)
        {
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION),
                1)

        }//end if
        //GET user location if they allowed the permisions
        mMap.isMyLocationEnabled = true    //user need to activate GPS to ON on their settings
        fusedLocationClient.lastLocation.addOnSuccessListener(this) {
                location ->
            if (location!=null){
                val currentLocation = LatLng(location.latitude, location.longitude)  //this is your current location
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(currentLocation, 12f))
                mMap.addMarker(MarkerOptions().position(currentLocation).title("Am here"))
            }//end if

            else {
                Toast.makeText(applicationContext, "We can't retrieve your location", Toast.LENGTH_LONG).show()
            }//end else

        }//end fused successlistener

    }//end gps set up


}//last brace