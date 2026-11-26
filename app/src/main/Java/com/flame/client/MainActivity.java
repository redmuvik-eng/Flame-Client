package com.flame.client;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try {
            WebView web = new WebView(this);
            WebSettings settings = web.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);

            web.setWebViewClient(new WebViewClient());
            web.loadUrl("file:///android_asset/index.html");

            setContentView(web);
        } catch (Exception e) {
            Toast.makeText(this, e.toString(),
                Toast.LENGTH_LONG).show();
        }
    }
}
