package net.androidbootcamp.personalphotoapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;




public class FamilyViewActivity extends Activity {


    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.family_view);


        Intent o = getIntent();

        int position = o.getExtras().getInt("id");
        final ImageAdapter imageAdapter = new ImageAdapter(this);

        final ImageView imageView = (ImageView) findViewById(R.id.FamilyView);
        final TextView names=(TextView)findViewById(R.id.txtName);
        imageView.setImageResource(imageAdapter.fPics[position]);
        names.setText(imageAdapter.names[position]);

    }
}
