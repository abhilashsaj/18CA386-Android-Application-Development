package com.example.simplewebview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

class MyWebViewClient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url); // load the url
        return true;
    }
}
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

        WebView webView = (WebView) findViewById(R.id.simpleWebView2);

        String customHtml = "<html><body><h1>This is Abhilash</h1>" +
                "<h1>Hi</h1>"+
                "<p>This is a sample paragraph of static HTML In Web view</p>" +
                "</body></html>";

        webView.loadData(customHtml, "text/html", "UTF-8");
    }
}
