package com.example.xlgame;

import Views.MainGamePanel;
import android.util.Log;
import android.view.SurfaceHolder;

public class MainThread extends Thread{

	private boolean running;
	private SurfaceHolder surfaceHolder;
	private MainGamePanel gamePanel;
	private static final String TAG = MainThread.class.getSimpleName();


	public boolean isRunning() {
		return running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}
	
	public void run()
	{
		long tickCount = 0L;
		  Log.d(TAG, "Starting game loop");
		  while (running) {
		   tickCount++;
		   // update game state
		   // render state to the screen
		  }
		  Log.d(TAG, "Game loop executed " + tickCount + " times");

	}
	
	public MainThread(SurfaceHolder surfaceHolder, MainGamePanel gamePanel)
	{
		super();
		this.surfaceHolder = surfaceHolder;
		this.gamePanel = gamePanel;
	}
}
