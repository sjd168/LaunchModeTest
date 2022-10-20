package com.sz.launchmodetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SingleTaskActivity extends AppCompatActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_single_task);
		findViewById(R.id.btn_start_single_instance).setOnClickListener(view -> {
			//Intent intent = new Intent(MainActivity.this, SingleTaskActivity.class);
			//intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			//startActivity(intent);
			LaunchUtil.toSingleInstance(SingleTaskActivity.this, false);
		});
		findViewById(R.id.btn_start_single_top).setOnClickListener(view -> {
			//Intent intent = new Intent(MainActivity.this, SingleTopActivity.class);
			//intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			//startActivity(intent);
			LaunchUtil.toSingleTop(SingleTaskActivity.this, false);
		});
		findViewById(R.id.btn_start_single_task).setOnClickListener(view -> {
			//Intent intent = new Intent(MainActivity.this, SingleTaskActivity.class);
			//intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			//startActivity(intent);
			LaunchUtil.toSingleTask(SingleTaskActivity.this, false);
		});
		findViewById(R.id.btn_start_standard).setOnClickListener(view -> {
			//Intent intent = new Intent(MainActivity.this, SingleTaskActivity.class);
			//intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			//startActivity(intent);
			LaunchUtil.toStandard(SingleTaskActivity.this, false);
		});
		findViewById(R.id.btn_start_single_task2).setOnClickListener(view -> {
			//Intent intent = new Intent(MainActivity.this, SingleTaskActivity.class);
			//intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			//startActivity(intent);
			LaunchUtil.toSingleTask2(SingleTaskActivity.this, false);
		});
	}
	
}
