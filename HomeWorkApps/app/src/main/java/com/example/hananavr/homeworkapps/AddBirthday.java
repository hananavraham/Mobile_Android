package com.example.hananavr.homeworkapps;

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
    DatePicker birthDate;
    Button button;

    @Override
    protected void onCreate(@Nullable Bundle saveInstance){
        super.onCreate(saveInstance);
        setContentView(R.layout.addbirthday);

        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        //birthDate = findViewById(R.id.birthDate);
        button = findViewById(R.id.AddBirthday);


        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // add to room
            }
        });
    }

}
