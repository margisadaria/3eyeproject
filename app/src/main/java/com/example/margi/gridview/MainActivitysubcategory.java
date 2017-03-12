package com.example.margi.gridview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

/**
 * Created by Margi on 08-Mar-17.
 */
public class MainActivitysubcategory extends AppCompatActivity {

    // public Integer[] callingimage = { R.drawable.call, R.drawable.back_arrow};
    //public String[] callingnames = {"Call logs",  "Go to back"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

//        GridView gridviewcalling = (GridView) findViewById(R.id.main_call);
//        Context con = null;
//        gridviewcalling.setAdapter(new subCallAdapter(this, callingimage, callingnames,con));
//        gridviewcalling.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                if (position == 1) {
//                    Toast.makeText(MainActivitysubcategory.this,"yu r successfully enter in the subcategory",Toast.LENGTH_LONG);
//                    {
//                        if(position==0)
//                        {
//                            GridView gridView = (GridView) findViewById(R.id.main_call);
//                            subCallAdapter dataAdapter = new subCallAdapter(this);
//                            gridView.setAdapter(dataAdapter);
//                        }
//                        else {
//                            Toast.makeText(MainActivitysubcategory.this,"yu r not successfully entered in subcategory",Toast.LENGTH_LONG);
//                        }LENGTH_LONG
        Intent intent = getIntent();
        int position = intent.getIntExtra("position1", -1);
        GridView gw = (GridView) findViewById(R.id.main_call);
        ImageAdapter dataAdapter = new ImageAdapter(MainActivitysubcategory.this);
        gw.setAdapter(dataAdapter);
        gw.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Intent intent = new Intent(MainActivitysubcategory.this, subcall.class);
                intent.putExtra("position1", position);
                startActivity(intent);
                Toast.makeText(MainActivitysubcategory.this, "hello" + adapterView.getItemAtPosition(position), Toast.LENGTH_SHORT).show();

            }


        });
    }
}