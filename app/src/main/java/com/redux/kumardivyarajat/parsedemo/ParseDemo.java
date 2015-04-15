package com.redux.kumardivyarajat.parsedemo;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by kumardivyarajat on 09/04/15.
 */
public class ParseDemo extends Application {

    public void onCreate() {
        super.onCreate();

        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "wR2JRt8IIJOYzPmYU8mOOIUVd3uu4L3EHxNzvzZA", "9jFohR85fuDaLgwcdDuDCdZBvW10QsThEop7MfvU");
    }
}
