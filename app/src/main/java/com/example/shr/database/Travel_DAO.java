package com.example.shr.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface Travel_DAO {
    @Insert
    void insertPicture(Photo_data...Photo_datas);

    @Delete
    void deletePicture(Photo_data...Photo_datas);

    @Query("SELECT * FROM Photo_data ORDER BY ID DESC")
    List<Photo_data> getAllPicture();

    @Insert
    void insertGPS(GPS_data...gps_datas);
}
