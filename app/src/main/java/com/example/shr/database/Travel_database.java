package com.example.shr.database;


import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {Photo_data.class,GPS_data.class,Travelline_data.class},version = 1,exportSchema = false)
public abstract class Travel_database extends RoomDatabase {
    public abstract Travel_DAO getTravel_DAO();
}
