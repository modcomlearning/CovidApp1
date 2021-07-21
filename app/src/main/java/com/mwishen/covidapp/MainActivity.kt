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

        //set click listeners
        cardabout.setOnClickListener {  }
        cardcauses.setOnClickListener {  }
        cardsymptoms.setOnClickListener {  }
        cardprevention.setOnClickListener {  }
        cardtollfree.setOnClickListener {  }
        cardlocation.setOnClickListener {
        }
        //Tomorrow load content
    }


}