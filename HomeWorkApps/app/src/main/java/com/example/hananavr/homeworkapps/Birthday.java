package com.example.hananavr.homeworkapps;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;
import android.widget.EditText;
import java.util.Date;

@Entity(tableName = "birthday",primaryKeys = {"first_name","last_name"})
public class Birthday {
    @NonNull
    @ColumnInfo(name = "first_name")
    private String First_Name;
    @NonNull
    @ColumnInfo(name = "last_name")
    private String Last_Name;
    @NonNull
    @ColumnInfo(name = "date")
    private String date;

    public Birthday(){}

    public Birthday(String first_name ,String last_name ,String birth_date) {
        this.First_Name = first_name;
        this.Last_Name  = last_name;
        this.date       = birth_date;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }
    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }
    @NonNull
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
