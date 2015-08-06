package com.zys.ndkdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		TextView textView = (TextView) findViewById(R.id.text);
		textView.setText(native_Get_String());

	}

	static {
		System.loadLibrary("native_lib");
	}

	private native String native_Get_String();

}
