package com.example.kabupaten;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        DetailFragment frag = (DetailFragment)
                getSupportFragmentManager().findFragmentById(R.id.detail_frag);
//        frag.setWorkout(1);
        int kabId = (int) getIntent().getExtras().get("idKab");
        int propId = (int) getIntent().getExtras().get("idProp");
        frag.setKab(propId,kabId);
    }
}