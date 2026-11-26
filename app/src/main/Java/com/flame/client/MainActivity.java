package com.flame.client;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView text = new TextView(this);
        text.setText("FLAME CLIENT WORKS!");
        text.setTextSize(25);
        text.setPadding(30, 50, 30, 50);

        setContentView(text);
    }
}
