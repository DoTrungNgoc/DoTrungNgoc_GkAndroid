package com.example.dotrungngoc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemDetailActivity extends AppCompatActivity {
    private  TextView name,priceOld,priceNew;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);

        name = findViewById(R.id.textViewDetailName);
        priceOld = findViewById(R.id.textViewDetailOld);
        priceNew = findViewById(R.id.textViewDetailNew);
        img = findViewById(R.id.imageViewDetail);

        Bike bike = (Bike) getIntent().getSerializableExtra("bike");

        name.setText(bike.getName());
        img.setImageResource(bike.getImg());
        priceNew.setText("15% OFF I " + bike.getPriceNew());
        priceOld.setText(bike.getPriceOld());

    }
}