package com.mwishen.covidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Symptoms : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_symptoms)

        val websymptoms = findViewById<WebView>(R.id.websymptoms)
        websymptoms.loadUrl("file:///android_asset/symptoms.html")
    }
}