package com.jorgesys.splashscreenvideo;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.VideoView;

public class SplashScreenActivity extends Activity {

private static final String TAG = "SplashScreenActivity";	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_screen);
		try {
			VideoView videoHolder = (VideoView)this.findViewById(R.id.videoView1);
 			Uri video = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.splash_video);
			videoHolder.setVideoURI(video);
			videoHolder.setOnCompletionListener(new OnCompletionListener() {
				public void onCompletion(MediaPlayer mp) {
					loadMain();
				}
			});
			videoHolder.start();
		} catch (Exception ex) {
			Log.e(TAG, ex.getMessage());
			loadMain();
		}
	}

	protected void loadMain() { 
	   Intent  intent = new Intent(this, MainActivity.class);
	   startActivity(intent);
	   finish();
	}
}
