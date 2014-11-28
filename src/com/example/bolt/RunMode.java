package com.example.bolt;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Chronometer;

public class RunMode extends Activity implements OnClickListener {
	Button startChrono;
	Button pauseChrono;
	Chronometer chrono;
	long time = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.run_mode);
		startChrono = (Button)findViewById(R.id.start);
		pauseChrono = (Button)findViewById(R.id.pause);
		chrono = (Chronometer)findViewById(R.id.runningTime);
		startChrono.setOnClickListener(this);
		pauseChrono.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.run_mode, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()) {
			case R.id.start:
				chrono.setBase(SystemClock.elapsedRealtime() + time);
				chrono.start();
				break;
				
			case R.id.pause:
				time = chrono.getBase() - SystemClock.elapsedRealtime();
				chrono.stop();
				break;
		}
	}
}
