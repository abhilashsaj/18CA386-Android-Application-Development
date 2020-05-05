package com.example.webview2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView simpleWebView = (WebView) findViewById(R.id.simpleWebView);

// set web view client
        simpleWebView.setWebViewClient(new MyWebViewClient());

// string url which you have to load into a web view
        String url = "https://google.com/";
        simpleWebView.getSettings().setJavaScriptEnabled(true);
        simpleWebView.loadUrl(url);
    }
}
