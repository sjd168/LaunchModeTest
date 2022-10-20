package com.sz.launchmodetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SingleTopActivity extends AppCompatActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_single_top);
		findViewById(R.id.btn_start_single_instance).setOnClickListener(view -> {
			//Intent intent = new Intent(MainActivity.this, SingleTaskActivity.class);
			//intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			//startActivity(intent);
			LaunchUtil.toSingleInstance(SingleTopActivity.this, false);
		});
		findViewById(R.id.btn_start_single_top).setOnClickListener(view -> {
			//Intent intent = new Intent(MainActivity.this, SingleTopActivity.class);
			//intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			//startActivity(intent);
			LaunchUtil.toSingleTop(SingleTopActivity.this, false);
		});
		findViewById(R.id.btn_start_single_task).setOnClickListener(view -> {
			//Intent intent = new Intent(MainActivity.this, SingleTaskActivity.class);
			//intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			//startActivity(intent);
			LaunchUtil.toSingleTask(SingleTopActivity.this, false);
		});
		findViewById(R.id.btn_start_standard).setOnClickListener(view -> {
			//Intent intent = new Intent(MainActivity.this, SingleTaskActivity.class);
			//intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			//startActivity(intent);
			LaunchUtil.toStandard(SingleTopActivity.this, false);
		});
		findViewById(R.id.btn_start_single_top_2).setOnClickListener(view -> {
			//Intent intent = new Intent(MainActivity.this, SingleTaskActivity.class);
			//intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			//startActivity(intent);
			LaunchUtil.toSingleTop2(SingleTopActivity.this, false);
		});
	}
	
}
