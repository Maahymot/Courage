package com.example.motevakel.courage;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BmiActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);


        final EditText editText = (EditText) findViewById(R.id.editText);
        final EditText editText2 = (EditText) findViewById(R.id.editText2);
        final Button button = (Button) findViewById(R.id.button);
        final TextView textView = (TextView) findViewById(R.id.textView3);


        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                float a = Float.parseFloat(editText.getText().toString());
                float b = Float.parseFloat(editText2.getText().toString());
                float c = ((b)/((a/100)*(a/100)));
                int d = Math.round(c);
                String str = String.valueOf(d);

                // textView.setText("Your BMI is ="+" "+str+"\r\n"+"Your Weight Should Be"+" "+NormalWeight(a));

                if (d<=19) {
                    textView.setText("Your BMI is ="+" "+str+"\r\n"+"You Are Underweight"+"\r\n"+"Your Weight Should Be"+" "+NormalWeight(a));
                } else if (19<d & d<=25) {
                    textView.setText("Your BMI is ="+" "+str+"\r\n"+"You Are Normal"+"\r\n"+"Your Weight Should Be"+" "+NormalWeight(a));
                } else if (25<d & d<=30) {
                    textView.setText("Your BMI is ="+" "+str+"\r\n"+"You Are Overweight"+"\r\n"+"Your Weight Should Be"+" "+NormalWeight(a));
                } else if (30<d & d<=35) {
                    textView.setText("Your BMI is ="+" "+str+"\r\n"+"You Are Obese"+"\r\n"+"Your Weight Should Be"+" "+NormalWeight(a));
                } else if (d>35) {
                    textView.setText("Your BMI is ="+" "+str+"\r\n"+"You Are Extremly Obese"+"\r\n"+"Your Weight Should Be"+" "+NormalWeight(a));
                }

            }
        });
    }

    public int NormalWeight(float a) {

        float e = 25*((a/100)*(a/100));
        int f = Math.round(e);
        return f;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
