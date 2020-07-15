package com.colourstab.androidwithlucky;

import androidx.appcompat.app.AppCompatActivity;

import android.os.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.util.*;
import android.animation.*;

import java.util.*;

import android.widget.LinearLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Timer;
import java.util.TimerTask;
import android.view.View;
import android.graphics.Typeface;

public class MainActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private double position = 0;
	private double position2 = 0;
	
	private LinearLayout linear1;
	private LinearLayout linear4;
	private LinearLayout target;
	private LinearLayout base;
	private LinearLayout linear2;
	private ImageView imageview2;
	private TextView textview1;
	private ImageView imageview1;
	private LinearLayout tab_tab1;
	private LinearLayout tab_tab2;
	private LinearLayout tab_tab3;
	private LinearLayout tab_tab4;
	private ImageView img_tab1;
	private ImageView img_tab2;
	private ImageView img_tab3;
	private ImageView img_tab4;
	private ImageView target_img;
	private TextView target_tt;
	private TextView textview6;
	
	private TimerTask timer;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		target = (LinearLayout) findViewById(R.id.target);
		base = (LinearLayout) findViewById(R.id.base);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		textview1 = (TextView) findViewById(R.id.textview1);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		tab_tab1 = (LinearLayout) findViewById(R.id.tab_tab1);
		tab_tab2 = (LinearLayout) findViewById(R.id.tab_tab2);
		tab_tab3 = (LinearLayout) findViewById(R.id.tab_tab3);
		tab_tab4 = (LinearLayout) findViewById(R.id.tab_tab4);
		img_tab1 = (ImageView) findViewById(R.id.img_tab1);
		img_tab2 = (ImageView) findViewById(R.id.img_tab2);
		img_tab3 = (ImageView) findViewById(R.id.img_tab3);
		img_tab4 = (ImageView) findViewById(R.id.img_tab4);
		target_img = (ImageView) findViewById(R.id.target_img);
		target_tt = (TextView) findViewById(R.id.target_tt);
		textview6 = (TextView) findViewById(R.id.textview6);
		
		tab_tab1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_targetMover(0);
				_Non_Select_Tab_Mover(img_tab1, 0);
				_Non_Select_Tab_Mover(img_tab2, 2);
				_Non_Select_Tab_Mover(img_tab3, 1);
				_Layout(50, 50, 50, 50, "#79BC31", target);
				_SET_SHADOW(10, target);
				timer = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								_Layout(0, 50, 50, 0, "#79BC31", target);
								img_tab1.setVisibility(View.GONE);
							}
						});
					}
				};
				_timer.schedule(timer, (int)(200));
				img_tab2.setVisibility(View.VISIBLE);
				img_tab3.setVisibility(View.VISIBLE);
				img_tab4.setVisibility(View.VISIBLE);
				target_img.setImageResource(R.drawable.tab_1);
				img_tab2.setImageResource(R.drawable.colortab_2);
				img_tab3.setImageResource(R.drawable.colortab_3);
				img_tab4.setImageResource(R.drawable.colortab_4);
				target_tt.setText("TAB 1");
				textview6.setText("TAB 1");
				textview1.setTextColor(0xFF79BC31);
				textview6.setTextColor(0xFF79BC31);
			}
		});
		
		tab_tab2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_targetMover(1);
				_Non_Select_Tab_Mover(img_tab1, -1);
				_Non_Select_Tab_Mover(img_tab2, 0);
				_Non_Select_Tab_Mover(img_tab3, 2);
				_Layout(50, 50, 50, 50, "#3DB4F8", target);
				_SET_SHADOW(10, target);
				img_tab1.setVisibility(View.VISIBLE);
				timer = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								img_tab2.setVisibility(View.GONE);
							}
						});
					}
				};
				_timer.schedule(timer, (int)(200));
				img_tab3.setVisibility(View.VISIBLE);
				img_tab4.setVisibility(View.VISIBLE);
				img_tab1.setImageResource(R.drawable.colortab_1);
				target_img.setImageResource(R.drawable.tab_2);
				img_tab3.setImageResource(R.drawable.colortab_3);
				img_tab4.setImageResource(R.drawable.colortab_4);
				target_tt.setText("TAB 2");
				textview6.setText("TAB 2");
				textview1.setTextColor(0xFF3DB4F8);
				textview6.setTextColor(0xFF3DB4F8);
			}
		});
		
		tab_tab3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_targetMover(2);
				_Non_Select_Tab_Mover(img_tab2, -2);
				_Non_Select_Tab_Mover(img_tab3, 0);
				_Non_Select_Tab_Mover(img_tab4, 1);
				_Layout(50, 50, 50, 50, "#F89900", target);
				_SET_SHADOW(10, target);
				img_tab1.setVisibility(View.VISIBLE);
				img_tab2.setVisibility(View.VISIBLE);
				timer = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								img_tab3.setVisibility(View.GONE);
							}
						});
					}
				};
				_timer.schedule(timer, (int)(200));
				img_tab4.setVisibility(View.VISIBLE);
				img_tab1.setImageResource(R.drawable.colortab_1);
				img_tab2.setImageResource(R.drawable.colortab_2);
				target_img.setImageResource(R.drawable.tab_3);
				img_tab4.setImageResource(R.drawable.colortab_4);
				target_tt.setText("TAB 3");
				textview6.setText("TAB 3");
				textview1.setTextColor(0xFFF89900);
				textview6.setTextColor(0xFFF89900);
			}
		});
		
		tab_tab4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_targetMover(3);
				_Non_Select_Tab_Mover(img_tab2, -1);
				_Non_Select_Tab_Mover(img_tab3, -2);
				_Non_Select_Tab_Mover(img_tab4, 0);
				_Layout(50, 50, 50, 50, "#EDA0A3", target);
				_SET_SHADOW(10, target);
				timer = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								_Layout(50, 0, 0, 50, "#EDA0A3", target);
								img_tab4.setVisibility(View.GONE);
							}
						});
					}
				};
				_timer.schedule(timer, (int)(200));
				img_tab1.setVisibility(View.VISIBLE);
				img_tab2.setVisibility(View.VISIBLE);
				img_tab3.setVisibility(View.VISIBLE);
				img_tab1.setImageResource(R.drawable.colortab_1);
				img_tab2.setImageResource(R.drawable.colortab_2);
				img_tab3.setImageResource(R.drawable.colortab_3);
				target_img.setImageResource(R.drawable.tab_4);
				target_tt.setText("TAB 4");
				textview6.setText("TAB 4");
				textview1.setTextColor(0xFFEDA0A3);
				textview6.setTextColor(0xFFEDA0A3);
			}
		});
	}
	private void initializeLogic() {
		_ON_CREATE();
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	private void _ON_CREATE () {
		_TEXT_STYLE();
		_LINEARLAYOUT_CODES();
		target_img.setImageResource(R.drawable.tab_1);
		img_tab2.setImageResource(R.drawable.colortab_2);
		img_tab3.setImageResource(R.drawable.colortab_3);
		img_tab4.setImageResource(R.drawable.colortab_4);
		target_tt.setText("TAB 1");
		textview6.setText("TAB 1");
		textview1.setTextColor(0xFF79BC31);
		textview6.setTextColor(0xFF79BC31);
	}
	
	
	private void _TEXT_STYLE () {
		textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/darktube_font.ttf"), 0);
		textview6.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/darktube_font.ttf"), 0);
		target_tt.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/darktube_font.ttf"), 0);
	}
	
	
	private void _LINEARLAYOUT_CODES () {
		_Layout(0, 50, 50, 0, "#79BC31", target);
		_SET_SHADOW(10, linear1);
		_SET_SHADOW(10, target);
		_Non_Select_Tab_Mover(img_tab1, 0);
		_Non_Select_Tab_Mover(img_tab2, 2);
		_Non_Select_Tab_Mover(img_tab3, 1);
	}
	
	
	private void _SET_SHADOW (final double _n, final View _view) {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) { _view.setElevation((int)_n);}
	}
	
	
	private void _Layout (final double _r1, final double _r2, final double _r3, final double _r4, final String _color, final View _layout) {
		Double tlr = _r1;
		Double trr = _r2;
		Double blr = _r3;
		Double brr = _r4;
		android.graphics.drawable.GradientDrawable s = new android.graphics.drawable.GradientDrawable();
		s.setShape(android.graphics.drawable.GradientDrawable.RECTANGLE);
		s.setCornerRadii(new float[] {tlr.floatValue(),tlr.floatValue(), trr.floatValue(),trr.floatValue(), blr.floatValue(),blr.floatValue(), brr.floatValue(),brr.floatValue()});
		s.setColor(Color.parseColor(_color));
		_layout.setBackground(s);
	}
	
	
	private void _Animator (final View _view, final String _propertyName, final double _value, final double _duration) {
		ObjectAnimator anim = new ObjectAnimator();
		anim.setTarget(_view);
		anim.setPropertyName(_propertyName);
		anim.setFloatValues((float)_value);
		anim.setDuration((long)_duration);
		anim.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
		anim.start();
	}
	
	
	private void _targetMover (final double _position) {
		position = 95 * _position;
		_Animator(target, "translationX", ColorsTabUtil.getDip(getApplicationContext(), (int)(position)), 200);
		timer = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						_Animator(target_img, "scaleX", 1, 100);
						_Animator(target_img, "scaleY", 1, 100);
					}
				});
			}
		};
		_timer.schedule(timer, (int)(100));
		_Animator(target_img, "scaleX", 0, 100);
		_Animator(target_img, "scaleY", 0, 100);
	}
	
	
	private void _Non_Select_Tab_Mover (final View _view, final double _position) {
		position2 = 10 * _position;
		_Animator(_view, "translationX", ColorsTabUtil.getDip(getApplicationContext(), (int)(position2)), 200);
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}
