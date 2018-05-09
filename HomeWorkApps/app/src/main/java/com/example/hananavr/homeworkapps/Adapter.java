package com.example.hananavr.homeworkapps;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.example.hananavr.homeworkapps.*;

public class Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context context;
    String []items;
    public Adapter(Context context,String[] items ){
        this.context = context;
        this.items = items;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View row = inflater.inflate(R.layout.costume_item, parent,false);
        Item item = new Item(row);
        return item;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((Item)holder).textView.setText(items[position]);
        ((Item)holder).button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch(position)    // checking what homework has chosen...
                {
                    case 0:
                        Intent Calculatorintent = new Intent(context,CalculatorActivity.class);
                        context.startActivity(Calculatorintent);
                        break;

                    case 1:
                        Intent Birthdayintent = new Intent(context,BirthdayListActivity.class);
                        context.startActivity(Birthdayintent);
                        break;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.length;
    }

    public class Item extends RecyclerView.ViewHolder{
        TextView textView;
        Button button;
        public Item(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.item);
            button   = (Button) itemView.findViewById(R.id.button);
        }
    }
}
