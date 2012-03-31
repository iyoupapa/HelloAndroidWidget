package com.iyoupapa.hellowandroidwidget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
//import android.graphics.Bitmap;
import android.util.Log;

public class HelloAndroidWidgetProvider extends AppWidgetProvider {
	@Override
	public void onEnabled(Context context) {
		Log.v("HelloAndroidWidget", "onEnabled");
		super.onEnabled(context);
	}
	
	@Override
	public void onUpdate(Context context, AppWidgetManager appWidgetManager,
			int[] appWidgetIds) {
		Log.v("HelloAndroidWidget", "onUpdate");
/*		Bitmap bitmap = Bitmap.createBitmap(72, 72, Bitmap.Config.ARGB_8888);
		Canvas canvas = new Canvas(bitmap);

		// ��������ACanvas �ɑ΂��āA�����A�~�A��`�A�h��Ԃ��A��]�E�E�E�Ȃǂ̌Ăяo��������ƁA
		// �`�挋�ʂ́ABitmap �ɔ��f�����
		// �ȉ��́A�p�X��`�悷���
		Paint paint = new Paint();

		paint.setAntiAlias(true);
		paint.setColor(Color.BLACK);
		paint.setStyle(Paint.Style.FILL);

		Path path = new Path();

		path.moveTo();
		path.lineTo();
		// ...
		path.close();

		canvas.drawPath(path, paint);
		imageView1.
		super.onUpdate(context, appWidgetManager, appWidgetIds);
		*/
	}
	
	@Override
	public void onDeleted(Context context, int[] appWidgetIds) {
		Log.v("HelloAndroidWidget", "onDeleted");
		super.onDeleted(context, appWidgetIds);
	}
	
	@Override
	public void onDisabled(Context context) {
		Log.v("HelloAndroidWidget", "onDisabled");
		super.onDisabled(context);
	}
	
	@Override
	public void onReceive(Context context, Intent intent) {
		Log.v("HelloAndroidWidget", "onReceive");
		super.onReceive(context, intent);
	}
}
