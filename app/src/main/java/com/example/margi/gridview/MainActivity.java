package com.example.margi.gridview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //String name1[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final String name1[] = getResources().getStringArray(R.array.name1);
        GridView gw = (GridView)findViewById(R.id.main_grid);
        ImageAdapter dataAdapter = new ImageAdapter(MainActivity.this);
        gw.setAdapter(dataAdapter);
         gw.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             @Override
             public void onItemClick(AdapterView<?> adapterView, View view, int position, long l)
             {

                     Intent intent = new Intent(MainActivity.this,PassingActivity.class);
                     intent.putExtra("position",position);
                     startActivity(intent);
                     Toast.makeText(MainActivity.this, "hello"+adapterView.getItemAtPosition(position), Toast.LENGTH_SHORT).show();

             }
         });
    }
}
