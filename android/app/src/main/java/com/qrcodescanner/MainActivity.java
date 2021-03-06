package com.qrcodescanner;

import android.app.Activity;
import android.os.Bundle;

import com.facebook.react.ReactActivity;
import com.veridiumid.sdk.VeridiumSDK;
import com.veridiumid.sdk.activities.DefaultVeridiumSDKModelFactory;
import com.veridiumid.sdk.defaultdata.VeridiumSDKDataInitializer;
import com.veridiumid.sdk.fourfexport.VeridiumSDKFourExportFInitializer;

public class MainActivity extends ReactActivity {

  private static Activity mCurrentActivity = null;

  protected void onCreate(Bundle savedInstanceState) {
    SplashScreen.show(this);  // here
    super.onCreate(savedInstanceState);
    mCurrentActivity = this;

//    String fourfLicence = ".........";
//    VeridiumSDK.init(getBaseContext(),
//            new DefaultVeridiumSDKModelFactory(getBaseContext()),
//            new VeridiumSDKFourExportFInitializer(fourfLicence),
//            new VeridiumSDKDataInitializer()
//    );

  }

  /**
   * Returns the name of the main component registered from JavaScript. This is used to schedule
   * rendering of the component.
   */
  @Override
  protected String getMainComponentName() {
    return "qrcodescanner";
  }

  public static Activity getActivity(){
    Activity activity = new Activity();
    activity = mCurrentActivity;
    return activity;
  }
}
