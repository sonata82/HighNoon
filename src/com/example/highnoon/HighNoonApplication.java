package com.example.highnoon;

import android.app.Application;

public class HighNoonApplication extends Application {

	private static HighNoonApplication instance;
	
	public HighNoonApplication() {
		HighNoonApplication.instance = this;
	}
	
	@Override
	public void onCreate() {
		
	}
	
	public static HighNoonApplication getInstance() {
		return instance;
	}
}
