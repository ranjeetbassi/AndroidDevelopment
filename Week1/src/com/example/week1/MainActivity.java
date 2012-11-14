package com.example.week1;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

	public static final String LOG_TAG = "MY APP";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        int mInt = 130;
        Log.i(LOG_TAG, "Mint value: "+mInt);
        Log.v(LOG_TAG, "Mint value: "+mInt);
        Log.e(LOG_TAG, "Mint value: "+mInt);
        Log.w(LOG_TAG, "Mint value: "+mInt);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
