package com.thelastcitadel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.widget.RemoteViews;

public class Kilosecond extends AppWidgetProvider {
	  @Override
	  public void onUpdate( Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds )
	  {
		  RemoteViews remoteViews;
		  ComponentName watchWidget;
		  DateFormat format = SimpleDateFormat.getTimeInstance( SimpleDateFormat.MEDIUM, Locale.getDefault() );
		  
		  remoteViews = new RemoteViews( context.getPackageName(), R.layout.main );
		  watchWidget = new ComponentName( context, Kilosecond.class );
		  remoteViews.setTextViewText( R.id.TextView01, "Time = " + format.format( new Date()));
		  appWidgetManager.updateAppWidget( watchWidget, remoteViews );
	  }
}
