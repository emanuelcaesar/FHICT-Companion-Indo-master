package com.example.owner.fhictcompanion;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by owner on 8/30/2017.
 */

public class ImageAdapter extends BaseAdapter {
    Context mContxt;
//    private final String [] values;
    private final int [] images;
    View view;
    LayoutInflater layoutInflater;

    public ImageAdapter(Context c, int[] images){
        this.mContxt = c;
//        this.values = values;
        this.images = images;

    }
    public int getCount(){
        return images.length;
    }
    public Object getItem(int position){
        return null;
    }
    public long getItemId(int position){
        return 0;
    }
    public View getView(int position, View convertView, ViewGroup parent){
        layoutInflater = (LayoutInflater) mContxt.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if(convertView == null){
            view = new View(mContxt);
            view = layoutInflater.inflate(R.layout.singel_item, null);
            ImageView imageView = (ImageView) view.findViewById(R.id.imageview);
//            TextView textview = (TextView) view.findViewById(R.id.textview);
            imageView.setImageResource(images[position]);
//            textview.setText(values[position]);

        }
        return view;
    }
}
