package net.androidbootcamp.personalphotoapp;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView family = (GridView) findViewById(R.id.family);
        family.setAdapter(new ImageAdapter(this));


        family.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, position, Toast.LENGTH_LONG).show();
                Intent o = new Intent(getApplicationContext(), FamilyViewActivity.class);
                o.putExtra("id", position);

                startActivity(o);
            }
        });
    }
}





