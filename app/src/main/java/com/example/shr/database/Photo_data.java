package com.example.shr.database;


import android.graphics.Bitmap;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
@Entity
public class Photo_data {
    @PrimaryKey(autoGenerate = true)
    private  int id=0;

    @ColumnInfo(name = "Address")//the address of taking photo
    private String address;
    @ColumnInfo(name = "time")////the time of taking photo
    private String time;
    @ColumnInfo(name = "longitude")
    private String longitude;
    @ColumnInfo(name = "latitude")
    private String latitude;
    @ColumnInfo(name = "pictureInfo")
    private byte[] abyte;

    public Photo_data(String address, String time, String longitude, String latitude, byte[] abyte) {
        this.address = address;
        this.time = time;
        this.longitude = longitude;
        this.latitude = latitude;
        this.abyte = abyte;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getTime() {
        return time;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public byte[] getAbyte() {
        return abyte;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setAbyte(byte[] abyte) {
        this.abyte = abyte;
    }
}