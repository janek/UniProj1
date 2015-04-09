package com.pwr.swim.janek.firstapp2;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;


public class Act2 extends ActionBarActivity {

    private Switch switch1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);

        switch1 = (Switch) findViewById(R.id.switch1);

        View mojeOkno2 = (View) findViewById(R.id.mojeOkno2);

        mojeOkno2.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                finish();
                return false;
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity2, menu);
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
        if (switch1.isChecked()){
            str = "Włączone!";
        } else {
            str = "Wyłączone!";
        }


        Toast mojToast = new Toast (getApplicationContext());
        mojToast.makeText(Act2.this, str, mojToast.LENGTH_SHORT).show();

    }


}
