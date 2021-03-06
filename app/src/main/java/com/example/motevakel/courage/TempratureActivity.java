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


public class TempratureActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temprature);



        final EditText editText = (EditText) findViewById(R.id.editText);
        final EditText editText2 = (EditText) findViewById(R.id.editText2);
        final Button button = (Button) findViewById(R.id.button);
        final EditText editText3 = (EditText) findViewById(R.id.editText3);
        final EditText editText4 = (EditText) findViewById(R.id.editText4);
        final Button button2 = (Button) findViewById(R.id.button2);



        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (hasFocus) {

                    editText2.getText().clear();
                    button.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            float f = Float.parseFloat(editText.getText().toString());
                            int c = Math.round((f-32)*5/9);
                            String str = String.valueOf(c);
                            editText2.setText(str);
                        }
                    });

                } else {
                    editText.getText().clear();
                    button.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            float c = Float.parseFloat(editText2.getText().toString());
                            int f = Math.round((c*9/5)+32);
                            String str = String.valueOf(f);
                            editText.setText(str);
                        }
                    });
                }
            }
        });



        editText3.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (hasFocus) {

                    editText4.getText().clear();
                    button2.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            float k = Float.parseFloat(editText3.getText().toString());
                            int c2 = Math.round(k-273);
                            String str2 = String.valueOf(c2);
                            editText4.setText(str2);
                        }
                    });

                } else {
                    editText3.getText().clear();
                    button2.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            float c2 = Float.parseFloat(editText4.getText().toString());
                            int k = Math.round(c2+273);
                            String str2 = String.valueOf(k);
                            editText3.setText(str2);
                        }
                    });
                }
            }
        });



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
