package com.hatenablog.techium.daynightsample;

import android.app.UiModeManager;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private UiModeManager mUiModeManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mUiModeManager = (UiModeManager) getSystemService(Context.UI_MODE_SERVICE);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mUiModeManager.getNightMode() == UiModeManager.MODE_NIGHT_NO){
                    mUiModeManager.setNightMode(UiModeManager.MODE_NIGHT_YES);
                } else {
                    mUiModeManager.setNightMode(UiModeManager.MODE_NIGHT_NO);
                }
            }
        });
    }
}
