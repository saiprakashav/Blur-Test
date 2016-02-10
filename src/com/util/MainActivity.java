package com.util;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.blur.blur.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		
		setContentView(R.layout.activity_main);
		
		//Locate the Banner Ad in activity_main.xml
				AdView adView = (AdView) this.findViewById(R.id.adView);
				
				
		 
				// Request for Ads
				AdRequest adRequest = new AdRequest.Builder().build();
		 
				// Add a test device to show Test Ads
				// .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
				// .addTestDevice("CC5F2C72DF2B356BBF0DA198")
					//	.build();
		 
				// Load ads into Banner Ads
				adView.loadAd(adRequest);

		final Button dummyButton = (Button) findViewById(R.id.dummy_button);

		dummyButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

				BlurBehind.getInstance().execute(MainActivity.this, new OnBlurCompleteListener() {
					@Override
					public void onBlurComplete() {
						Intent intent = new Intent(MainActivity.this, BlurredActivity.class);
						// intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);

						startActivity(intent);

					}
				});
			}
		});
	}
}
