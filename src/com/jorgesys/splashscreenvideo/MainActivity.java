package com.jorgesys.splashscreenvideo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);

		ImageView imageView1 = (ImageView)findViewById(R.id.imageView1);
		Animation animRotate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
		imageView1.setAnimation(animRotate);
		
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
