package Views;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import com.example.xlgame.MainThread;

public class MainGamePanel extends SurfaceView implements SurfaceHolder.Callback{

	private MainThread thread;
	public MainGamePanel(Context context)
	{
		super(context);
		getHolder().addCallback(this);
		setFocusable(true);
		
		thread = new MainThread(getHolder(), this);
		
	}
	public void surfaceChanged(SurfaceHolder holder, int format, int width,
			int height) {
		// TODO Auto-generated method stub
		
	}

	public void surfaceCreated(SurfaceHolder holder) {
		thread.setRunning(true);
		thread.start();
	}

	public void surfaceDestroyed(SurfaceHolder holder) {
		boolean retry = true;
		while (retry)
		{
			try {
				thread.join();
				retry = false;
			}
			catch (InterruptedException ex)
			{
				
			}
		}
		
	}
	
	public boolean onTouchEvent(MotionEvent event)
	{
		switch (event.getAction())
		{
			case MotionEvent.ACTION_DOWN:
				//Handle action start
			break;
			
			case MotionEvent.ACTION_POINTER_DOWN:
				//Handle pointer down
			break;
			
			case MotionEvent.ACTION_MOVE:
				//Handle movement
			break;
			
			case MotionEvent.ACTION_POINTER_UP:
				//Handle pointer up
			break;
			
			case MotionEvent.ACTION_UP:
				//Handle action end
			break;
		}
		return super.onTouchEvent(event);
	}
	
	protected void onDraw(Canvas canvas)
	{
		
	}

}
