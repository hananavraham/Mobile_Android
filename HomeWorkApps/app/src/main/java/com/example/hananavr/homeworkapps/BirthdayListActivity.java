package com.example.hananavr.homeworkapps;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class BirthdayListActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Button button;
    List<Birthday> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday_list);
        items = new ArrayList<>();

        // creating database instnace
        DataBase db = Room.databaseBuilder(getApplicationContext(), DataBase.class,"room")
                .allowMainThreadQueries()
                .build();
        items = db.birthdayDao().getAllBirthdays();     // get allItems

        recyclerView = (RecyclerView) findViewById(R.id.Birthdayrecyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new BirthdayAdapter(this,items));

        button = findViewById(R.id.add_birthday);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BirthdayListActivity.this,AddBirthday.class));

            }
        });
    }
}
