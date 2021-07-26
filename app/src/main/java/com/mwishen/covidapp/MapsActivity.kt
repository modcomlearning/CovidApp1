package com.mwishen.covidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

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








    }
}