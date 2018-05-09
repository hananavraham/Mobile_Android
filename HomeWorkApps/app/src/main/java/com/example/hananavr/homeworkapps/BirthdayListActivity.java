package com.example.hananavr.homeworkapps;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

public class BirthdayListActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Button button;
    Context context;
    String []items = {"Hanan Avraham 1.10.1982", "Eva Miller 13.7.1983"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday_list);

        recyclerView = (RecyclerView) findViewById(R.id.Birthdayrecyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new BirthdayAdapter(this,items));

        button = findViewById(R.id.add_birthday);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AddBirthday = new Intent(context,AddBirthday.class);
                context.startActivity(AddBirthday);
            }
        });
    }
}
