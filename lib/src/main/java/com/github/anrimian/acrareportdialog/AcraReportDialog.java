package com.github.anrimian.acrareportdialog;

import android.app.Application;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.acra.ACRA;
import org.acra.ReportingInteractionMode;
import org.acra.config.ConfigurationBuilder;
import org.acra.dialog.BaseCrashReportDialog;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Created on 07.04.2017.
 */

public class AcraReportDialog extends BaseCrashReportDialog {

    public static void setupCrashDialog(Application application) {
        ConfigurationBuilder configurationBuilder = new ConfigurationBuilder(application);
        configurationBuilder
                .setReportDialogClass(AcraReportDialog.class)
                .setReportingInteractionMode(ReportingInteractionMode.DIALOG);
        ACRA.init(application, configurationBuilder);
    }

    @Override
    protected void init(@Nullable Bundle savedInstanceState) {
        super.init(savedInstanceState);
        setContentView(R.layout.activity_acra_report);

        TextView textView = findViewById(R.id.tv_message);

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        //noinspection ThrowableResultOfMethodCallIgnored
        getException().printStackTrace(pw);
        String stackTrace = sw.toString();
        Log.e(getClass().getSimpleName(), stackTrace);
        textView.setText(stackTrace);

        View btnClose = findViewById(R.id.btn_close);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

}
