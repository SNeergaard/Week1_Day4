package com.example.week1day4;

import android.os.Parcel;
import android.os.Parcelable;

public class Mailing_Info implements Parcelable{
    private String First_Name;
    private String Last_Name;
    private String Street_Address;
    private String City;
    private String State;
    private String Zip;



    public Mailing_Info(String first_Name, String last_Name, String street_Address, String city, String state, String zip) {
        First_Name = first_Name;
        Last_Name = last_Name;
        Street_Address = street_Address;
        City = city;
        State = state;
        Zip = zip;
    }

    protected Mailing_Info(Parcel in) {
        First_Name = in.readString();
        Last_Name = in.readString();
        Street_Address = in.readString();
        City = in.readString();
        State = in.readString();
        Zip = in.readString();
    }

    public static final Creator<Mailing_Info> CREATOR = new Creator<Mailing_Info>() {
        @Override
        public Mailing_Info createFromParcel(Parcel in) {
            return new Mailing_Info(in);
        }

        @Override
        public Mailing_Info[] newArray(int size) {
            return new Mailing_Info[size];
        }
    };

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

    public String getStreet_Address() {
        return Street_Address;
    }

    public void setStreet_Address(String street_Address) {
        Street_Address = street_Address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getZip() {
        return Zip;
    }

    public void setZip(String zip) {
        Zip = zip;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(First_Name);
        parcel.writeString(Last_Name);
        parcel.writeString(Street_Address);
        parcel.writeString(City);
        parcel.writeString(State);
        parcel.writeString(Zip);
    }
}
