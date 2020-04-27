package net.androidbootcamp.personalphotoapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ImageAdapter extends BaseAdapter{
    private Context eContext;

    String[]names = {"Katera", "Gordino", "Sharill", "Michelle", "Paulette", "Damri", "Steve", "Chystelle and Gregory" };

    public ImageAdapter(Context c){
        this.eContext = c;

    }

    @Override
    public int getCount(){
        return fPics.length;
    }
    @Override
    public Object getItem(int position){
        return names[position];
    }
    @Override
    public long getItemId(int position){

        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        ImageView imageView;

        if(convertView == null){
            imageView = new ImageView(eContext);
            imageView.setLayoutParams(new GridView.LayoutParams(300, 300));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(15,25,15,25);
        }
        else
        {
            imageView = (ImageView) convertView;
        }
        TextView nametxt = (TextView) convertView.findViewById(R.id.txtName);
        nametxt.setText(names[position]);
        imageView.setImageResource(fPics[position]);

        return imageView;
    }
    public Integer[] fPics = {
            R.drawable.kkpicture_1, R.drawable.natpicture_2, R.drawable.mompicture_3,
            R.drawable.shellypicture_4, R.drawable.paulettepicture_5, R.drawable.maripicture_6,
            R.drawable.stevepicture_7, R.drawable.chrisypicture_8
    };

}
