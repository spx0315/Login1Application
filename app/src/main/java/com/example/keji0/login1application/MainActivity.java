package com.example.keji0.login1application;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);
        getWindow().setBackgroundDrawableResource(R.drawable.bg_main);
    }
}
