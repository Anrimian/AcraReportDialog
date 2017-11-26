package com.github.anrimian.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.anrimian.acrareportdialog.sample.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        throw new RuntimeException("hello acra");
    }
}
