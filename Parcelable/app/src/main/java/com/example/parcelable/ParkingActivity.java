package com.example.parcelable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class ParkingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking);

        Intent intent = getIntent();
        Vehicle vehicle = intent.getParcelableExtra("VEHICLE_EXTRA");

        TextView Brand = (TextView) findViewById(R.id.tvBrand);
        Brand.setText( vehicle.getBrand());

        TextView Kilometers = (TextView) findViewById(R.id.tvKilometers);
        Kilometers.setText(String.valueOf(vehicle.getKilometers()));



    }
}
