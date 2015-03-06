package com.example.victor.barce_tabhost;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TabHost;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Va en el metodo de OnCreate
        //Para crear un tabhost
        TabHost th = (TabHost)findViewById(R.id.tabHost);

        //Para inicir el configurador del tabhost
        th.setup();

        //El tab spect representa una pestaña del tabhost
        //El metodo de newtabsepect es para crear una nueva pestaña y su identificador
        TabHost.TabSpec ts1 = th.newTabSpec("Identificador 1");

        //Este sera el identificador de la pestaña (O lo que el usuario podra ver)
        ts1.setIndicator("Tab #1");

        //En esta parte ahora si asignamos ya el contenedor al tabhost (Es como si le asignaramos un div al tabhost)
        ts1.setContent(R.id.tab1);

        //Ahora para ya terminar (Con el primer tab) lo que tenemos que hacer es asignarle al TabHost un elemento (una pestaña)
        th.addTab(ts1);




        //Tab2
        TabHost.TabSpec ts2 = th.newTabSpec("Identificador 2");
        ts2.setIndicator("Tab #2");
        ts2.setContent(R.id.tab2);
        th.addTab(ts2);




        //Tab 3
        TabHost.TabSpec ts3 = th.newTabSpec("Identificador 3");
        ts3.setIndicator("Tab #3");
        ts3.setContent(R.id.tab3);
        th.addTab(ts3);
    }


    public void Radio(View v)
    {
        RadioButton rb = (RadioButton)findViewById(R.id.rb1);
        // isChecked es el metodo para saber si está activo el
        //RadioButton
        if(rb.isChecked())
        {
            Toast.makeText(this, "Radio Activo...", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Radio Inactivo...", Toast.LENGTH_SHORT).show();
        }
    }



    public void Chek(View v)
    {
        CheckBox ch = (CheckBox)findViewById(R.id.casilla);
        if(ch.isChecked())
        {
            Toast.makeText(this, "Check Activo...", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Check Activo...", Toast.LENGTH_SHORT).show();
        }
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