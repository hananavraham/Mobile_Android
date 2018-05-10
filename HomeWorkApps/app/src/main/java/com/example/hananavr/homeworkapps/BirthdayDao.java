package com.example.hananavr.homeworkapps;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface BirthdayDao {
    @Query("SELECT * FROM birthday")
    List<Birthday> getAllBirthdays();

    @Insert
    public void insertItem(Birthday birthday);
}