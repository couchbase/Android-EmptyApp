package com.couchbase.emptyapp;

import java.io.IOException;

import android.app.Activity;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.util.Log;

import com.couchbase.android.CouchbaseMobile;
import com.couchbase.android.ICouchbaseDelegate;

public class EmptyAppActivity extends Activity {

	@SuppressWarnings("unused")
	private ServiceConnection couchServiceConnection;

	protected static final String TAG = "EmptyApp";

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		CouchbaseMobile couch = new CouchbaseMobile(getBaseContext(), mDelegate);

		try {
			couch.copyIniFile("emptyapp.ini");
		} catch (IOException e) {
			e.printStackTrace();
		}

		couchServiceConnection = couch.startCouchbase();
    }

	private final ICouchbaseDelegate mDelegate = new ICouchbaseDelegate() {
		@Override
		public void couchbaseStarted(String host, int port) {
			Log.v(TAG, "Couchbase has started");
		}

		@Override
		public void exit(String error) {
		}
	};
}