package com.wolf.practicaltest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.wolf.practicaltest.R;

import static android.R.id.input;
import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {
    float a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    void convertFeetTometer()
    {  EditText feet= (EditText) findViewById(R.id.toFeet);
        feet.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText  meter=(EditText) findViewById(R.id.ToMeter);
        meter.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a=Integer.parseInt(feet.getText().toString());
        double result=a/3.280844;
        feet.setText(String.valueOf(result));

    }

    void convertMeterToFeet()
    {  EditText feet= (EditText) findViewById(R.id.toFeet);
        feet.setInputType(InputType.TYPE_CLASS_NUMBER);
        EditText  meter=(EditText) findViewById(R.id.ToMeter);
        meter.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a=Integer.parseInt(meter.getText().toString());
        double result=a*3.280844;
        feet.setText(String.valueOf(result));
    }

    public void click(View view)
    {
        convertFeetTometer();
        Button b2=(Button) findViewById(R.id.submitToMeter);
        b2.setEnabled(true);
    }

    public void reset(View view)
    {
        Button b1=(Button) findViewById(R.id.submitTofeet
        );
        b1.setEnabled(true);
        Button b2=(Button) findViewById(R.id.submitToMeter);
        b2.setEnabled(true);
        EditText feet= (EditText) findViewById(R.id.toFeet);
        EditText  meter=(EditText) findViewById(R.id.ToMeter);
        feet.setText("");
        meter.setText("");

    }

    public void click2(View view)
    {
        Button b1=(Button) findViewById(R.id.submitTofeet);
        b1.setEnabled(false);
        convertMeterToFeet();
    }



}






