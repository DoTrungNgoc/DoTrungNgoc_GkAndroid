package com.example.dotrungngoc;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class HomeMainActivity extends AppCompatActivity {
    private ListView listView;
    private BikeAdapter adapter;
    private List<Bike> listSource,listTemp;
    private Button btnT,btnP,btnW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_main);

        listView = findViewById(R.id.listview);
        btnT = findViewById(R.id.buttonT);
        btnP = findViewById(R.id.buttonP);
        btnW = findViewById(R.id.buttonW);

        listSource = new ArrayList<>();
        listTemp = new ArrayList<>();
        listSource.add(new Bike("Blue One","$ 950","$ 840","T",R.drawable.bifour__removebg_preview));
        listSource.add(new Bike("Blue One","$ 950","$ 840","T",R.drawable.bifour__removebg_preview));
        listSource.add(new Bike("Blue One","$ 950","$ 840","T",R.drawable.bifour__removebg_preview));

        listSource.add(new Bike("Blue One","$ 950","$ 840","P",R.drawable.bifour__removebg_preview));
        listSource.add(new Bike("Blue One","$ 950","$ 840","P",R.drawable.bifour__removebg_preview));
        listSource.add(new Bike("Blue One","$ 950","$ 840","P",R.drawable.bifour__removebg_preview));

        adapter = new BikeAdapter(HomeMainActivity.this,R.layout.item_layout,listTemp);

        listView.setAdapter(adapter);

        processBtn(btnT,btnP,btnW);

        btnT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processBtn(btnT,btnP,btnW);
            }
        });
        btnP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processBtn(btnP,btnT,btnW);
            }
        });
        btnW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processBtn(btnW,btnP,btnT);
            }
        });
    }

    private void processBtn(Button btn1, Button btn2, Button btn3){
        btn1.setBackgroundColor(Color.parseColor("#F7BA83"));
        btn2.setBackgroundColor(Color.parseColor("#FFFFFF"));
        btn3.setBackgroundColor(Color.parseColor("#FFFFFF"));

        String cate = "T";
        if (btn1 == btnP)
            cate = "P";
        if (btn1 == btnW)
            cate = "W";

        listTemp.clear();
        for (Bike bike:listSource){
            if (bike.getCategoty().equalsIgnoreCase(cate)){
                listTemp.add(bike);
            }
        }

        adapter.notifyDataSetChanged();
    }
}