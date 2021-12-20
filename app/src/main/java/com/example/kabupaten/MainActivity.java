package com.example.kabupaten;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Listener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


//    @Override
    public void itemClicked(long id) {
        Intent intent = new Intent(this, KabupatenListActivity.class);
        intent.putExtra("idProp", id);
        startActivity(intent);
    }
}