package com.example.parcelable;

import android.os.Parcel;
import android.os.Parcelable;

public class Vehicle implements Parcelable {

    int Kilometers;
    String Brand;

    protected Vehicle(Parcel in) {
        Kilometers = in.readInt();
        Brand = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(Kilometers);
        dest.writeString(Brand);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Vehicle> CREATOR = new Creator<Vehicle>() {
        @Override
        public Vehicle createFromParcel(Parcel in) {
            return new Vehicle(in);
        }

        @Override
        public Vehicle[] newArray(int size) {
            return new Vehicle[size];
        }
    };

    public int getKilometers() {
        return Kilometers;
    }

    public void setKilometers(int kilometers) {
        Kilometers = kilometers;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public Vehicle(String Brand, int Kilometers){
        this.Brand = Brand;
        this.Kilometers = Kilometers;
    }
}
