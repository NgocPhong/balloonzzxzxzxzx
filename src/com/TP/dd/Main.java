package com.TP.dd;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Main extends Activity {

	private final int CAMERA_WIDTH = 800;
	private final int CAMERA_HEIGHT = 480;
	private ResourcesManager resourcesManager;
	private Camera camera;
	private Scene splashScene;
	private Scene mainScene;
	
    private BitmapTextureAtlas splashTextureAtlas;
    private ITextureRegion splashTextureRegion;
    private Sprite splash;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
