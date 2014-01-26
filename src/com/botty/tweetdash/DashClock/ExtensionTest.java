package com.botty.tweetdash.DashClock;

import android.content.Intent;

import com.botty.tweetdash.R;
import com.google.android.apps.dashclock.api.DashClockExtension;
import com.google.android.apps.dashclock.api.ExtensionData;

/**
 * Created by ivan on 26/01/14.
 */
public class ExtensionTest extends DashClockExtension {
        protected void onInitialize(boolean isReconnect){
            setUpdateWhenScreenOn(true);
        }

    @Override
    protected void onUpdateData(int i) {
        Intent extensionClickIntent = null;
        ExtensionData extensionData = new ExtensionData();
        extensionData.visible(true);
        extensionData.icon(R.drawable.ic_launcher);
        extensionData.status("TweetDash");
        extensionData.expandedTitle("TweetDash");
        extensionData.expandedBody("Let you Tweet from DashClock.");
        extensionData.clickIntent(new Intent(this, com.botty.tweetdash.MainActivity.class));
        publishUpdate(extensionData);
    }

  /*  public void extensionClickIntent(){
        Intent our = new Intent(this, com.botty.tweetdash.MainActivity.class);
        our.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(our);
    } */
}
