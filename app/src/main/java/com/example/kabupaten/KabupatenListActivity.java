package com.example.kabupaten;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.content.Intent;
import android.os.Bundle;

public class KabupatenListActivity extends AppCompatActivity implements Listener{
    long propId ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kabupaten_list);
        ListKabFragment frag =
                (ListKabFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_kab);
//        frag.setWorkout(1);
        propId = (long)getIntent().getExtras().get("idProp");
        System.out.println("Terima Prop id dari intent"+propId);
        frag.setPropId(propId);
        System.out.println("Kirim prop id ke frament"+propId);
    }

    public void itemClicked(long id) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("idKab", (int)id);
        intent.putExtra("idProp", (int)propId);
        startActivity(intent);
    }
}