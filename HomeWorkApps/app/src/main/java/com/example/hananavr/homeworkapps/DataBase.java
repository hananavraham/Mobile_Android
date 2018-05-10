package com.example.hananavr.homeworkapps;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.Room;

@Database(entities = {Birthday.class} , version = 1)
public abstract class DataBase extends RoomDatabase {
    public abstract BirthdayDao birthdayDao();
}
