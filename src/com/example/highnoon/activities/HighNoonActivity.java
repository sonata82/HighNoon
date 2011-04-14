package com.example.highnoon.activities;

import android.app.Activity;
import android.os.Bundle;

import com.example.highnoon.R;

/**
 * HighNoon Start activity
 * 
 * @author Marco Jahn <me@marco-jahn.info>
 * 
 */
public class HighNoonActivity
        extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}