package com.pwr.swim.janek.firstapp2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;


public class Act5 extends ActionBarActivity {

    private CheckBox c1;
    private CheckBox c2;
    private CheckBox c3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act5);

        c1 = (CheckBox) findViewById(R.id.checkBox);
        c2 = (CheckBox) findViewById(R.id.checkBox2);
        c3 = (CheckBox) findViewById(R.id.checkBox3);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_act5, menu);
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

        StringBuilder stB = new StringBuilder();
        stB.append("Wybrano następujace opcje: ");



        if (c1.isChecked()) {
            stB.append(c1.getText().toString()+" ");
        }
        if (c2.isChecked()) {
            stB.append(c2.getText().toString()+" ");
        }
        if (c3.isChecked()) {
            stB.append(c3.getText().toString()+" ");
        }


        Toast mojToast = new Toast (getApplicationContext());
        mojToast.makeText(Act5.this, stB.toString(), mojToast.LENGTH_SHORT).show();

    }


    public void przekaz(View view) {
        int suma = 0;
        if (c1.isChecked()) {
            suma += Integer.parseInt(c1.getText().toString());
        }
        if (c2.isChecked()) {
            suma += Integer.parseInt(c2.getText().toString());
        }
        if (c3.isChecked()) {
            suma += Integer.parseInt(c3.getText().toString());
        }

        Intent iii = new Intent(this, Act6.class);

        Bundle dane = new Bundle();
        dane.putInt("suma", suma);

        iii.putExtras(dane);

        startActivityForResult(iii, 123);



    }


    @Override
    protected void onActivityResult(int reqID,
                                    int resC,
                                    Intent ii) {
        if (resC == Activity.RESULT_OK && reqID == 123) {
            Bundle dane = new Bundle();
            dane = ii.getExtras();
            int wynik = dane.getInt("wynik");

            Toast mojToast = new Toast (getApplicationContext());
            mojToast.makeText(Act5.this, "wynik to "+wynik, mojToast.LENGTH_SHORT).show();
        }
        else {
            
        }
    }


}
