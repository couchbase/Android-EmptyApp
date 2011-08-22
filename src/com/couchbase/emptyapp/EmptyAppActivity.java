package com.couchbase.emptyapp;

import android.app.Activity;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.util.Log;

import com.couchbase.libcouch.CouchbaseMobile;
import com.couchbase.libcouch.ICouchClient;

public class EmptyAppActivity extends Activity {

	@SuppressWarnings("unused")
	private ServiceConnection couchServiceConnection;

	protected static final String TAG = "EmptyApp";

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		CouchbaseMobile couch = new CouchbaseMobile(getBaseContext(), mCallback);
		couchServiceConnection = couch.startCouchbase();
    }

	private final ICouchClient mCallback = new ICouchClient.Stub() {
		@Override
		public void couchStarted(String host, int port) {
			Log.v(TAG, "Couchbase has started");
		}

		@Override
		public void installing(int completed, int total) {
		}

		@Override
		public void exit(String error) {
		}
	};
}