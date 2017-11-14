package com.example.dabso.lab31appbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        WebView webView=(WebView)findViewById(R.id.webViewAbout);
        webView.loadUrl("https://bait2073.000webhostapp.com/welcome.html");

    }
}
