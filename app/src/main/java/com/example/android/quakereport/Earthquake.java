package com.example.android.quakereport;


public class Earthquake{
    private String mMagntude;

    private String mLocation;

    private String mDate;

    public Earthquake(String magnitude,String location,String date){
        mMagntude=magnitude;
        mLocation=location;
        mDate=date;
    }

    public String getMagntude() {
        return mMagntude;
    }

    public String getLocation() {
        return mLocation;
    }

    public String getDate() {
        return mDate;
    }
}




