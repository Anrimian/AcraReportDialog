package com.github.anrimian.sample;

import android.app.Application;

import com.github.anrimian.acrareportdialog.AcraReportDialog;
import com.github.anrimian.acrareportdialog.sample.BuildConfig;

import org.acra.ACRA;
import org.acra.ReportingInteractionMode;
import org.acra.config.ConfigurationBuilder;

/**
 * Created on 26.11.2017.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            initAcra();
        }
    }

    private void initAcra() {
        ConfigurationBuilder configurationBuilder = new ConfigurationBuilder(this);
        configurationBuilder
                .setReportDialogClass(AcraReportDialog.class)
                .setReportingInteractionMode(ReportingInteractionMode.DIALOG);
        ACRA.init(this, configurationBuilder);
    }
}
