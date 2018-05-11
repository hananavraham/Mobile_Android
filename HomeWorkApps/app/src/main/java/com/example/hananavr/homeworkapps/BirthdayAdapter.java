package com.example.hananavr.homeworkapps;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class BirthdayAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    FloatingActionButton button;
    Context context;
    List<Birthday> items;

    public BirthdayAdapter(Context context,List<Birthday> items){
        this.context = context;
        this.items = items;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View row = inflater.inflate(R.layout.birthday_item, parent, false);
        Item item = new Item(row);
        return item;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        ((Item)holder).name.setText(items.get(position).getFirst_Name()
                + " " +(items.get(position).getLast_Name()));
        ((Item)holder).date.setText(items.get(position).getDate());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class Item extends RecyclerView.ViewHolder{
        public TextView name;
        public TextView date;
        public Item(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.first_name);
            date = itemView.findViewById(R.id.birthdate);
        }
    }
}
