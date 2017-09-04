package com.example.owner.fhictcompanion;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

/**
 * Created by owner on 8/31/2017.
 */

public class MenuActivity extends Activity{

    String[] values = {
            "Icons",
            "Icons",
            "Icons",
            "Icons",
            "Icons",
            "Icons",
            "Icons"
    };
    int[] images = {
            R.drawable.calendar_icon,
            R.drawable.calendar_icon,
            R.drawable.calendar_icon,
            R.drawable.calendar_icon,
            R.drawable.calendar_icon,
            R.drawable.calendar_icon,
            R.drawable.calendar_icon
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView gridView = (GridView) findViewById(R.id.gridview);

        ImageAdapter imageAdapter = new ImageAdapter(this, images);

        gridView.setAdapter(imageAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(MenuActivity.this, "" + position, Toast.LENGTH_SHORT).show();
                if(position == 0){
                    Intent intent = new Intent(MenuActivity.this, CalendarActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

}
