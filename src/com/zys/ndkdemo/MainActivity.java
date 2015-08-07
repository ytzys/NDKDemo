package com.zys.ndkdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView textView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		textView = (TextView) findViewById(R.id.text);
		// textView.setText(native_Get_String());
		// 直接放在这里，调试的时候，在test.c中断点断不住，改成放在onTouchEvent()中执行

	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		textView.setText(native_Get_String());
		return super.onTouchEvent(event);
	}

	static {
		System.loadLibrary("native_lib");
	}

	private native String native_Get_String();

}
