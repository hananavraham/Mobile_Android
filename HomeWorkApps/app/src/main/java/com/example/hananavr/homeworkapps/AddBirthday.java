package com.example.hananavr.homeworkapps;

import android.app.DatePickerDialog;
import android.arch.persistence.room.Room;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class AddBirthday extends AppCompatActivity{
    EditText firstName;
    EditText lastName;
    Button button;
    DatePicker date;

    @Override
    protected void onCreate(Bundle saveInstance){
        super.onCreate(saveInstance);
        setContentView(R.layout.addbirthday);

        final DataBase db = Room.databaseBuilder(getApplicationContext(), DataBase.class,"room")
                .allowMainThreadQueries()
                .build();

        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        date = findViewById(R.id.date);
        button = findViewById(R.id.addDate);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // add to room
                int day   = date.getDayOfMonth();
                int month = date.getMonth() + 1;
                int year  = date.getYear();
                String birth_date = day + "/" + month + "/" + year;

                db.birthdayDao().insertItem(new Birthday(firstName.getText().toString(),lastName.getText().toString(),birth_date));
                startActivity(new Intent(AddBirthday.this,BirthdayListActivity.class));
            }
        });
    }



}
