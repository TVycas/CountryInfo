package com.tvycas.countyinfo.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.tvycas.countyinfo.model.CountryBase;

import java.util.List;

@Dao
public interface CountryBaseDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertCountry(CountryBase countryBase);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAllCountries(List<CountryBase> countryList);

    @Query("SELECT * FROM country_base")
    LiveData<List<CountryBase>> getAllCountries();
}
