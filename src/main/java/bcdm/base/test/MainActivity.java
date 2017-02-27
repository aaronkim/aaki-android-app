package bcdm.base.test;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import bcdm.base.data.value.ValueLong;
import bcdm.base.log.BaseLog;
import bcdm.base.log.LogLevel;

/**
 * Created by aaron on 10/31/16.
 */

public class MainActivity extends Activity {

	static {
		BaseLog.setLoggable(LogLevel.Verbose);
		BaseLog.setPlugin(null, new BaseLog.Plugin() {
			@Override
			public void message(String _tag, String _message) {
				Log.e(_tag, _message);
			}
		});

		BaseLog.setPlugin(LogLevel.Error, new BaseLog.Plugin() {
			@Override
			public void message(String _tag, String _message) {
				Log.e(_tag, _message);
			}
		});

		BaseLog.setPlugin(LogLevel.Debug, new BaseLog.Plugin() {
			@Override
			public void message(String _tag, String _message) {
				Log.d(_tag, _message);
			}
		});

		BaseLog.setPlugin(LogLevel.Warning, new BaseLog.Plugin() {
			@Override
			public void message(String _tag, String _message) {
				Log.w(_tag, _message);
			}
		});

		BaseLog.setPlugin(LogLevel.Info, new BaseLog.Plugin() {
			@Override
			public void message(String _tag, String _message) {
				Log.i(_tag, _message);
			}
		});

		BaseLog.setPlugin(LogLevel.Verbose, new BaseLog.Plugin() {
			@Override
			public void message(String _tag, String _message) {
				Log.v(_tag, _message);
			}
		});
	}


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		BaseLog.debug("onCreate()");
		ValueLong valueLong = new ValueLong("Hello", (Long) null);
		BaseLog.debug(valueLong.toString());

		setContentView(R.layout.main_activity);

	}

	@Override
	public View onCreateView(String name, Context context, AttributeSet attrs) {



		return super.onCreateView(name, context, attrs);
	}

}
