package com.example.shr.database;


import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Travelline_data {
    @PrimaryKey(autoGenerate = true)
    private  int id=0;

    public Travelline_data(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}


