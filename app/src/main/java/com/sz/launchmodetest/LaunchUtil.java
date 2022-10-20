package com.sz.launchmodetest;

import android.app.Activity;
import android.content.Intent;

public class LaunchUtil {
	
	static public void toSingleTop(Activity srcActivity, boolean addTaskFlag) {
		Intent intent = new Intent();
		intent.setClass(srcActivity, SingleTopActivity.class);
		if (addTaskFlag) {
			intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		}
		srcActivity.startActivity(intent);
	}
	static public void toSingleTop2(Activity srcActivity, boolean addTaskFlag) {
		Intent intent = new Intent();
		intent.setClass(srcActivity, SingleTop2Activity.class);
		if (addTaskFlag) {
			intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		}
		srcActivity.startActivity(intent);
	}
	
	static public void toSingleTask(Activity srcActivity, boolean addTaskFlag) {
		Intent intent = new Intent();
		intent.setClass(srcActivity, SingleTaskActivity.class);
		if (addTaskFlag) {
			intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		}
		srcActivity.startActivity(intent);
	}
	
	static public void toSingleInstance(Activity srcActivity, boolean addTaskFlag) {
		Intent intent = new Intent();
		intent.setClass(srcActivity, SingleInstanceActivity.class);
		if (addTaskFlag) {
			intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		}
		srcActivity.startActivity(intent);
	}
	
	static public void toSingleTask2(Activity srcActivity, boolean addTaskFlag) {
		Intent intent = new Intent();
		intent.setClass(srcActivity, SingleTask2Activity.class);
		if (addTaskFlag) {
			intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		}
		srcActivity.startActivity(intent);
	}
	
	static public void toStandard(Activity srcActivity, boolean addTaskFlag) {
		Intent intent = new Intent();
		intent.setClass(srcActivity, StandardActivity.class);
		if (addTaskFlag) {
			intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		}
		srcActivity.startActivity(intent);
	}
}
