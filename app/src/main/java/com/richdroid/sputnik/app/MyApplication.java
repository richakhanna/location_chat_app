package com.richdroid.sputnik.app;

import android.app.Application;

import com.richdroid.sputnik.helper.MyPreferenceManager;

/**
 * Created by richa.khanna on 3/26/16.
 * This is a singleton class needs to be added to AndroidManifest.xml file.
 */
public class MyApplication extends Application {

    public static final String TAG = MyApplication.class
            .getSimpleName();
    private static MyApplication mInstance;
    private MyPreferenceManager pref;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }

    public static synchronized MyApplication getInstance() {
        return mInstance;
    }


    public MyPreferenceManager getPrefManager() {
        if (pref == null) {
            pref = new MyPreferenceManager(this);
        }
        return pref;
    }
}
