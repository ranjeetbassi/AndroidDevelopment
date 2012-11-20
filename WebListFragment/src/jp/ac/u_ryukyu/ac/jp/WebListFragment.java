package jp.ac.u_ryukyu.ac.jp;

import android.app.Activity;
import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class WebListFragment extends ListFragment {
	public static String TAG = "ListFragment";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		Log.d(TAG, "Fragment-onCreate");
		super.onCreate(savedInstanceState);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		Log.d(TAG, "Fragment-onActivityCreated");
		super.onActivityCreated(savedInstanceState);
        setListAdapter(ArrayAdapter.createFromResource(getActivity()
                .getApplicationContext(), R.array.Webpage_titles,
                android.R.layout.simple_list_item_1));		
	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
        String[] links = getResources().getStringArray(R.array.Webpage_links);
        String url = links[position];
		WebViewerFragment fragment = (WebViewerFragment) getFragmentManager()
				.findFragmentById(R.id.detailFragment);
		if (fragment != null && fragment.isInLayout()) {
			fragment.setNewPage(url);
		} else {
			Intent intent = new Intent(getActivity().getApplicationContext(),
					WebViewerActivity.class);
			intent.putExtra("url", url);
			startActivity(intent);
		}
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
