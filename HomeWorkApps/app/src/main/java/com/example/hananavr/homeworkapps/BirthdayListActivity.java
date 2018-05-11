package com.example.hananavr.homeworkapps;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.content.Context;
import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
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

        items = sortByDate(items);

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

    private List<Birthday> sortByDate(List<Birthday> items) {
        Collections.sort(items, new Comparator<Birthday>() {

            public int compare(Birthday o1, Birthday o2) {
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                Date convertedDate1 = new Date();
                Date convertedDate2 = new Date();
                try {
                    convertedDate1 = dateFormat.parse(o1.getDate());
                    convertedDate2 = dateFormat.parse(o2.getDate());
                } catch (ParseException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                return convertedDate1.compareTo(convertedDate2);
            }
        });
        return items;
    }
}
