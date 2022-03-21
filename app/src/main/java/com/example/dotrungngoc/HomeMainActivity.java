package com.example.dotrungngoc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class HomeMainActivity extends AppCompatActivity {
    private ListView listView;
    private BikeAdapter adapter;
    private List<Bike> listSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_main);

        listView = findViewById(R.id.listview);
        listSource = new ArrayList<>();
        listSource.add(new Bike("Blue One","$ 950","$ 840","t",R.drawable.bifour__removebg_preview));
        listSource.add(new Bike("Blue One","$ 950","$ 840","t",R.drawable.bifour__removebg_preview));
        listSource.add(new Bike("Blue One","$ 950","$ 840","t",R.drawable.bifour__removebg_preview));

        adapter = new BikeAdapter(HomeMainActivity.this,R.layout.item_layout,listSource);

        listView.setAdapter(adapter);
    }
}