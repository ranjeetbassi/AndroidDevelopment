package jp.ac.u_ryukyu.ac.jp;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

public class WebViewerFragment extends Fragment {
	private static String TAG = "WebViewerFragment";
	@Override
	public void onCreate(Bundle savedInstanceState) {
		Log.d(TAG, "onCreate");
		super.onCreate(savedInstanceState);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		Log.d(TAG, "onActivityCreated");
		super.onActivityCreated(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Log.d(TAG, "onCreateView");
		View view = inflater.inflate(R.layout.web_viewer_layout, container, false);
		return view;
	}

	public void setNewPage(String url) {
		TextView view = (TextView) getView().findViewById(R.id.Url);
		view.setText(url);
		WebView webView = (WebView) getView().findViewById(R.id.webView);
		webView.loadUrl(url);
	}


	@Override
	public void onAttach(Activity act) {
		Log.d(TAG, "Fragment-onAttach");
		super.onAttach(act);
	}

	@Override
	public void onStart() {
		Log.d(TAG, "Fragment-onStart");
		super.onStart();
	}

	@Override
	public void onResume() {
		Log.d(TAG, "Fragment-onResume");
		super.onResume();
	}

	@Override
	public void onPause() {
		Log.d(TAG, "Fragment-onPause");
		super.onPause();
	}

	@Override
	public void onStop() {
		Log.d(TAG, "Fragment-onStop");
		super.onStop();
	}

	@Override
	public void onDestroyView() {
		Log.d(TAG, "Fragment-onDestroyView");
		super.onDestroyView();
	}
 
	@Override
	public void onDestroy() {
		Log.d(TAG, "Fragment-onDestroy");
		super.onDestroy();
	}

	@Override
	public void onDetach() {
		Log.d(TAG, "Fragment-onDetach");
		super.onDetach();
	}
	
	
}
