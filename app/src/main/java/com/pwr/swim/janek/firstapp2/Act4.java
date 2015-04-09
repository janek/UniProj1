package com.pwr.swim.janek.firstapp2;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class Act4 extends ActionBarActivity {

    private RadioButton r1;
    private RadioButton r2;

//    private RadioGroup rg = (RadioGroup) findViewById(R.id.rg);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act4);
        r1 = (RadioButton) findViewById(R.id.r1);
        r2 = (RadioButton) findViewById(R.id.r2);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_act4, menu);
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
        String str;
        if (r1.isChecked() == true) {
            str = r1.getText().toString();
        } else {
            str = r2.getText().toString();
        }

        Toast mojToast = new Toast (getApplicationContext());
        mojToast.makeText(Act4.this, str, mojToast.LENGTH_SHORT).show();

    }

}
