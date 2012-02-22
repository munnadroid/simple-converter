package com.main;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LengthConverter extends Activity {
	
	private EditText valueText1,valueText2;
	private Button convertButton,resetButton;
	private double val1=0,val2=0;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        valueText1=(EditText) findViewById(R.id.value1);
        valueText2=(EditText) findViewById(R.id.value2);
        
        convertButton=(Button) findViewById(R.id.convert);
        resetButton=(Button) findViewById(R.id.reset);
        
        convertButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				convertValues();
				
			}

			public void convertValues() {
				// TODO Auto-generated method stub
				if(valueText1.getText().length()>0){
					val1=Double.parseDouble(valueText1.getText().toString());
					val2=InchToCm(val1);
				}
				
				if(valueText2.getText().length()>0){
					val2=Double.parseDouble(valueText2.getText().toString());
					val1=InchToCm(val2);
				}
				else {
					Toast.makeText(LengthConverter.this,"please enter a value",Toast.LENGTH_LONG).show();
					valueText1.setText(Double.toString(val1));
					valueText2.setText(Double.toString(val2));
				}
		
				
			}

			public double InchToCm(double val) {
				// TODO Auto-generated method stub
				return val*2.54;
			}
		});
        
      resetButton.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			resetValues();
			
		}

		public void resetValues() {
			// TODO Auto-generated method stub
			valueText1.setText("");
			valueText2.setText("");
			
		}
	});
      
      
     
        
    }
}