package com.mwishen.covidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Prevention : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prevention)

        val webprev = findViewById<WebView>(R.id.webprev)
        webprev.loadUrl("file:///android_asset/prevention.html")
    }
}