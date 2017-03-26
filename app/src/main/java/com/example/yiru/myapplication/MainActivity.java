package com.example.yiru.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.content.Intent;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        //MenuInflater info = getMenuInflater();
        //info.inflate(R.menu.menu1, menu);
        getMenuInflater().inflate(R.menu.menu1, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item01:
                Intent i1 = new Intent();
                i1.setClass(MainActivity.this, Activity1.class);
                startActivity(i1);
                break;
            case R.id.item02:
                Intent i2 = new Intent();
                i2.setClass(MainActivity.this, Activity2.class);
                startActivity(i2);
                break;
        }
        return true;
    }

}
