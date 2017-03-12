package com.example.margi.gridview;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.GridView;
import android.widget.Toast;

public class PassingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing);

        Intent intent = getIntent();
        int position = intent.getIntExtra("position", -1);
        if (position == 0)
        {
            Intent i = new Intent(PassingActivity.this, MainActivitysubcategory.class);
            intent.putExtra("position1", position);
            startActivity(intent);
            Toast.makeText(PassingActivity.this, "hello yu r enter in subcateory", Toast.LENGTH_SHORT).show();
            GridView gridView = (GridView) findViewById(R.id.gw1);
            Imageadaptersms dataAdapter = new Imageadaptersms(this);
            gridView.setAdapter(dataAdapter);


        }

        if (position == 1) {
            GridView gridView = (GridView) findViewById(R.id.gw1);
            Imageadaptercall dataAdaptercall = new Imageadaptercall(this);
            gridView.setAdapter(dataAdaptercall);
        }
        if (position == 2) {
            GridView gridView = (GridView) findViewById(R.id.gw1);
            Imageadaptercontact dacon = new Imageadaptercontact(this);
            gridView.setAdapter(dacon);
        }
        if (position == 3) {
            GridView gridView = (GridView) findViewById(R.id.gw1);
            Imageadaptermusic dataAdapter = new Imageadaptermusic(this);
            gridView.setAdapter(dataAdapter);
        }

        if (position == 4) {
            GridView gridView = (GridView) findViewById(R.id.gw1);
            ImageAdapteralarm dataAdapteralarm = new ImageAdapteralarm(this);
            gridView.setAdapter(dataAdapteralarm);

        }
        if (position == 5) {
            GridView gridView = (GridView) findViewById(R.id.gw1);
            ImageAdapterrecoder dataAdapterrecoder = new ImageAdapterrecoder(this);
            gridView.setAdapter(dataAdapterrecoder);
        }
        if (position == 6) {
            GridView gridView = (GridView) findViewById(R.id.gw1);
            ImageAdapterettigs dataAdapter = new ImageAdapterettigs(this);
            gridView.setAdapter(dataAdapter);
        }
        if (position == 7) {
            GridView gridView = (GridView) findViewById(R.id.gw1);
            ImageAdapterstatus dataAdapter = new ImageAdapterstatus(this);
            gridView.setAdapter(dataAdapter);

        }
    }
}




