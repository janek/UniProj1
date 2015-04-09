package com.pwr.swim.janek.firstapp2;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class Act3 extends ActionBarActivity {


    private EditText txt1;
    private EditText txt2;
    private EditText txt3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act3);

        txt1 = (EditText) findViewById(R.id.txt1);
        txt2 = (EditText) findViewById(R.id.txt2);
        txt3 = (EditText) findViewById(R.id.txt3);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_act3, menu);
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

    public void goBack(View view) {
        final Intent intencja = new Intent(this,Act1.class);
        startActivity(intencja);
    }




    public void podsumuj(View view) {
        System.out.print("hey");
        String str = txt1.getText().toString() + " " + txt2.getText().toString() + " " + txt3.getText().toString();
        System.out.println("heyo"+str);

        Toast mojToast = new Toast (getApplicationContext());
        mojToast.makeText(Act3.this, str, mojToast.LENGTH_SHORT).show();

    }
}
