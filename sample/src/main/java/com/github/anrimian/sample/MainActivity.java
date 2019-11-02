package com.github.anrimian.sample;

import android.app.Activity;
import android.os.Bundle;

import com.github.anrimian.acrareportdialog.sample.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_crash).setOnClickListener(v -> {
            throw new RuntimeException("hello acra");
        });
    }
}
