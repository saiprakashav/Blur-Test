package com.util;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.blur.blur.R;

public class BlurredActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_blurred);

		BlurBehind.getInstance().withAlpha(80).withFilterColor(Color.parseColor("#000000")).setBackground(this);
	}
}
