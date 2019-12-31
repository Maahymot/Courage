package com.example.motevakel.courage;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final Button button = (Button) findViewById(R.id.button);
        final Button button2 = (Button) findViewById(R.id.button2);


        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                try {
                    Intent k = new Intent(MainActivity.this, TempratureActivity.class);
                    startActivity(k);
                } catch(Exception e) {
                    e.printStackTrace();
                }


            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v2) {

                try {
                    Intent k2 = new Intent(MainActivity.this, BmiActivity.class);
                    startActivity(k2);
                } catch(Exception e2) {
                    e2.printStackTrace();
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
