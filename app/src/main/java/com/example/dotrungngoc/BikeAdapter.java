package com.example.dotrungngoc;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class BikeAdapter extends BaseAdapter {
    private Context context;
    private int idLayout;
    private List<Bike> list;

    public BikeAdapter(Context context, int idLayout, List<Bike> list) {
        this.context = context;
        this.idLayout = idLayout;
        this.list = list;
    }

    @Override
    public int getCount() {
        if (list!=null && !list.isEmpty())
            return list.size();
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = LayoutInflater.from(parent.getContext()).inflate(idLayout,parent,false);
        }

        Bike bike = list.get(position);
        TextView name = convertView.findViewById(R.id.textViewItemName);
        TextView priceOld = convertView.findViewById(R.id.textViewItemPriceOld);
        TextView priceNew = convertView.findViewById(R.id.textViewItemPriceNew);
        ImageView img = convertView.findViewById(R.id.imageViewItem);

        if (list!=null && !list.isEmpty()){
            name.setText(bike.getName());
            priceOld.setText(bike.getPriceOld());
            priceNew.setText(bike.getPriceNew());
            img.setImageResource(bike.getImg());
        }

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,ItemDetailActivity.class);
                intent.putExtra("bike",bike);
                context.startActivity(intent);
            }
        });

        return convertView;
    }
}
