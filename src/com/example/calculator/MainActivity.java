package com.example.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import com.example.calculator.Operations;


public class MainActivity extends Activity implements OnClickListener  {
	
	TextView textview1;
	TextView textview2;
	EditText edittext1;
	EditText edittext2;
	CheckBox checkbox1;
	int btn_pressed=0;
	int editTextChoice=0;
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		textview1 = (TextView) findViewById(R.id.TextView1);
		textview2 = (TextView) findViewById(R.id.TextView2);
		edittext1 = (EditText) findViewById(R.id.EditText1);
		edittext2 = (EditText) findViewById(R.id.EditText2);
		checkbox1 = (CheckBox) findViewById(R.id.checkBox1);
		
		findViewById(R.id.button1).setOnClickListener(this);
		findViewById(R.id.button2).setOnClickListener(this);
		findViewById(R.id.button3).setOnClickListener(this);
		findViewById(R.id.button4).setOnClickListener(this);
		findViewById(R.id.button5).setOnClickListener(this);
		findViewById(R.id.button6).setOnClickListener(this);
		findViewById(R.id.button7).setOnClickListener(this);
		findViewById(R.id.button8).setOnClickListener(this);
		findViewById(R.id.button9).setOnClickListener(this);
		findViewById(R.id.button10).setOnClickListener(this);
		findViewById(R.id.button11).setOnClickListener(this);
		findViewById(R.id.button12).setOnClickListener(this);
		findViewById(R.id.button13).setOnClickListener(this);
		findViewById(R.id.button14).setOnClickListener(this);
		findViewById(R.id.button15).setOnClickListener(this);
		
	}
	@Override
	public void onClick(View v) {
        // TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.button6:
			if (editTextChoice==1)
				edittext2.setText(edittext2.getText()+"1"); else
				edittext1.setText(edittext1.getText()+"1");
			break;
		case R.id.button7:
			if (editTextChoice==1)
				edittext2.setText(edittext2.getText()+"2"); else
				edittext1.setText(edittext1.getText()+"2");
			break;
		case R.id.button8:
			if (editTextChoice==1)
				edittext2.setText(edittext2.getText()+"3"); else
				edittext1.setText(edittext1.getText()+"3");
			break;
		case R.id.button9:
			if (editTextChoice==1)
				edittext2.setText(edittext2.getText()+"4"); else
				edittext1.setText(edittext1.getText()+"4");
			break;
		case R.id.button10:
			if (editTextChoice==1)
				edittext2.setText(edittext2.getText()+"5"); else
				edittext1.setText(edittext1.getText()+"5");
			break;
		case R.id.button11:
			if (editTextChoice==1)
				edittext2.setText(edittext2.getText()+"6"); else
				edittext1.setText(edittext1.getText()+"6");
			break;
		case R.id.button12:
			if (editTextChoice==1)
				edittext2.setText(edittext2.getText()+"7"); else
				edittext1.setText(edittext1.getText()+"7");
			break;
		case R.id.button13:
			if (editTextChoice==1)
				edittext2.setText(edittext2.getText()+"8"); else
				edittext1.setText(edittext1.getText()+"8");
			break;
		case R.id.button14:
			if (editTextChoice==1)
				edittext2.setText(edittext2.getText()+"9"); else
				edittext1.setText(edittext1.getText()+"9");
			break;
		case R.id.button15:
			if (editTextChoice==1)
				edittext2.setText(edittext2.getText()+"0"); else
				edittext1.setText(edittext1.getText()+"0");
			break;
		case R.id.button1:
			Operations.setA(Double.parseDouble(edittext1.getText().toString()));
			//textview2.setText("");
			btn_pressed=1;
			editTextChoice=1;
			break;
		case R.id.button2:
			Operations.setA(Double.parseDouble(edittext1.getText().toString()));
			//textview2.setText("");
			btn_pressed=2;
			editTextChoice=1;
			break;
		case R.id.button3:
			Operations.setA(Double.parseDouble(edittext1.getText().toString()));
			//textview2.setText("");
			btn_pressed=3;
			editTextChoice=1;
			break;
		case R.id.button4:
			Operations.setA(Double.parseDouble(edittext1.getText().toString()));
			//textview2.setText("");
			btn_pressed=4;
			editTextChoice=1;
			break;	
		case R.id.button5:
			switch (btn_pressed) {
			case 1:
				textview2.setText(String.valueOf(Operations.getA()+Double.parseDouble(edittext2.getText().toString())));
				edittext1.setText("");
				edittext2.setText("");
				btn_pressed=0;
				editTextChoice=0;
				break;
			case 2:
				textview2.setText(String.valueOf(Operations.getA()-Double.parseDouble(edittext2.getText().toString())));
				edittext1.setText("");
				edittext2.setText("");
				btn_pressed=0;
				editTextChoice=0;
				break;
			case 3:
				textview2.setText(String.valueOf(Operations.getA()*Double.parseDouble(edittext2.getText().toString())));
				edittext1.setText("");
				edittext2.setText("");
				btn_pressed=0;
				editTextChoice=0;
				break;
			case 4:
				if (Integer.parseInt(edittext2.getText().toString())==0)
					textview2.setText("Õ≈À‹«ﬂ!"); else
					textview2.setText(String.valueOf(Operations.getA()/Double.parseDouble(edittext2.getText().toString())));
				edittext1.setText("");
				edittext2.setText("");
				btn_pressed=0;
				editTextChoice=0;
				break;	
			default:
				break;
			}
		default:
			break;
		}   
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
