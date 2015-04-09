package com.pwr.swim.janek.firstapp2;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Act1 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity1);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity1, menu);
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

    public void uruchomDwa(View view) {
        final Intent intencja2 = new Intent(this,Act2.class);
        startActivity(intencja2);
    }

    public void uruchomTrzy(View view) {
        final Intent intencja3 = new Intent(this,Act3.class);
        startActivity(intencja3);
    }

    public void uruchomCztery(View view) {
        final Intent intencja4 = new Intent(this,Act4.class);
        startActivity(intencja4);
    }

    public void uruchomPiec(View view) {
        final Intent intencja5 = new Intent(this,Act5.class);
        startActivity(intencja5);
    }


}
