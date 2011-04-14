package com.example.highnoon;

import android.app.Application;

/**
 * HighNoon Application app singleton.
 * 
 * @author Marco Jahn <me@marco-jahn.info>
 * 
 */
public class HighNoonApplication
        extends Application {

    /**
     * instance Instanz der Applikation
     */
    private static HighNoonApplication instance;

    /**
     * 
     * Constructs a HighNoonApplication.
     * 
     */
    public HighNoonApplication() {

        HighNoonApplication.instance = this;
    }

    public void onCreate() {

    }

    /**
     * 
     * @return Applikationsinstanz
     */
    public static HighNoonApplication getInstance() {

        return instance;
    }
}
