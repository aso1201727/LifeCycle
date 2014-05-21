package com.example.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {
	private static final String TAG = "LifeCycle";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.v(TAG,"onCreate is Called");
		setContentView(R.layout.activity_main);
	}

	@Override
	protected void onStart() {
		super.onStart();
		Log.v(TAG,"onStart is Called");
	}

	@Override
	protected void onRestart() {
		super.onStart();
		Log.v(TAG,"onRestart is Called");
	}

	@Override
	protected void onResume() {
		super.onStart();
		Log.v(TAG,"onResume is Called");
	}
	
	@Override
	protected void onPause() {
		super.onStart();
		Log.v(TAG,"onPause is Called");
	}
	
	@Override
	protected void onStop() {
		super.onStart();
		Log.v(TAG,"onStop is Called");
	}
	
	@Override
	protected void onDestroy() {
		super.onStart();
		Log.v(TAG,"onDestroy is Called");
	}

}
