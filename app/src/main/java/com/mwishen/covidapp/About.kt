package com.mwishen.covidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class About : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val webabout = findViewById<WebView>(R.id.webabout)
        webabout.loadUrl("file:///android_asset/about.html")
        //Next we go to android assets folder and put the html there
    }
}