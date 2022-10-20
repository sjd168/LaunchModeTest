package com.sz.launchmodetest;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class StandardActivity extends AppCompatActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_standard);
		findViewById(R.id.btn_start_single_instance).setOnClickListener(view -> {
			//Intent intent = new Intent(MainActivity.this, SingleTaskActivity.class);
			//intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			//startActivity(intent);
			LaunchUtil.toSingleInstance(StandardActivity.this, false);
		});
		findViewById(R.id.btn_start_single_top).setOnClickListener(view -> {
			//Intent intent = new Intent(MainActivity.this, SingleTopActivity.class);
			//intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			//startActivity(intent);
			LaunchUtil.toSingleTop(StandardActivity.this, false);
		});
		findViewById(R.id.btn_start_single_task).setOnClickListener(view -> {
			//Intent intent = new Intent(MainActivity.this, SingleTaskActivity.class);
			//intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			//startActivity(intent);
			LaunchUtil.toSingleTask(StandardActivity.this, false);
		});
		findViewById(R.id.btn_start_standard).setOnClickListener(view -> {
			//Intent intent = new Intent(MainActivity.this, SingleTaskActivity.class);
			//intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			//startActivity(intent);
			LaunchUtil.toStandard(StandardActivity.this, false);
		});
	}
	
}
