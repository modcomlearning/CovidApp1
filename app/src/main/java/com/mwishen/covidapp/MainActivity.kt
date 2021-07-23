package com.mwishen.covidapp

import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.core.app.ActivityCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //find your cards
        val cardabout = findViewById<CardView>(R.id.cardabout)
        val cardcauses = findViewById<CardView>(R.id.cardcauses)
        val cardsymptoms = findViewById<CardView>(R.id.cardsymptoms)
        val cardprevention = findViewById<CardView>(R.id.cardprevention)
        val cardtollfree = findViewById<CardView>(R.id.cardtollfree)
        val cardlocation = findViewById<CardView>(R.id.cardlocation)
        cardlocation.setOnClickListener {
            //right click on app - new - Google - Maps Activity
            val i = Intent(this, MapsActivity::class.java)
            startActivity(i)

        }//end




        //set click listeners
        cardabout.setOnClickListener {
            val i = Intent(this, About::class.java)
            startActivity(i)
        }//end
        cardcauses.setOnClickListener {
            val i = Intent(this, Causes::class.java)
            startActivity(i)
        }//end
        cardsymptoms.setOnClickListener {
            val i = Intent(this, Symptoms::class.java)
            startActivity(i)
        }//end
        cardprevention.setOnClickListener {
            val i = Intent(this, Prevention::class.java)
            startActivity(i)
        }
        cardtollfree.setOnClickListener { }


        //Tomorrow load content
    }
}