package com.cypressworks.shadowtest;

import android.graphics.Outline;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewGroup layout = (ViewGroup) findViewById(R.id.layoutContent1);

        for (int i = 0; i < layout.getChildCount(); i++) {
            View v = layout.getChildAt(i);
            v.setOutlineProvider(new ViewOutlineProvider() {
                @Override
                public void getOutline(final View view, final Outline outline) {
                    outline.setRect(0, -128, view.getWidth(), view.getHeight());
                }
            });
        }

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

}
