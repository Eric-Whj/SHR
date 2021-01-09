package com.example.shr.database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class GPS_data {
    @PrimaryKey(autoGenerate = true)
    private  int id=0;

    @ColumnInfo(name = "longitude")
    private String longitude;
    @ColumnInfo(name = "latitude")
    private String latitude;


    public GPS_data(String longitude, String latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public int getId() {
        return id;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
}
