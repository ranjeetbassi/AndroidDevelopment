package jp.ac.u_ryukyu.ac.jp;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.widget.TextView;

public class WebViewerActivity extends Activity {
	private static String TAG = "WebViewerActivity";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.d(TAG, "onCreate");
		super.onCreate(savedInstanceState);
		if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
			finish();
			return;
		}

		setContentView(R.layout.webviewer_activity_layout);
		Bundle extras = getIntent().getExtras();
		if (extras != null) {
			String s = extras.getString("url");
			TextView view = (TextView) findViewById(R.id.Url);
			view.setText(s);
			WebView webView = (WebView) findViewById(R.id.webView);
			webView.loadUrl(s);
		}
	}
	@Override
	protected void onDestroy() {
		Log.d(TAG, "onDestroy");
		super.onDestroy();
	}

	@Override
	protected void onRestart() {
		Log.d(TAG, "onRestart");
		super.onRestart();
	}

	@Override
	protected void onResume() {
		Log.d(TAG, "onResume");
		super.onResume();
	}

	@Override
	protected void onStart() {
		Log.d(TAG, "onStart");
		super.onStart();
	}

	@Override
	protected void onStop() {
		Log.d(TAG, "onStop");
		super.onStop();
	}

	@Override
	protected void onPause() {
		Log.d(TAG, "onPause");
		super.onStop();
	}
	
}
