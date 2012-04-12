package com.twansoftware.basedroid.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.github.rtyley.android.sherlock.roboguice.activity.RoboSherlockActivity;
import com.google.inject.Inject;
import com.twansoftware.basedroid.R;
import com.twansoftware.basedroid.singleton.BasedroidHttpClient;
import roboguice.util.Ln;

public class UnregisteredUserActivity extends RoboSherlockActivity {

  @Inject
  private SharedPreferences sharedPreferences;

  @Inject
  private BasedroidHttpClient client;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);

    Ln.v("Sample GET: %s", client.exampleJsonSearch());
  }
}