package com.example.parcelable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.buttonGo);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText brand = findViewById(R.id.etBrand);
                EditText kilometers = findViewById(R.id.etKilometers);

                Vehicle vehicle = new Vehicle( brand.getText().toString(), Integer.parseInt( kilometers.getText().toString()));

                Intent intent = new Intent(MainActivity.this,ParkingActivity.class);

                intent.putExtra("VEHICLE_EXTRA",vehicle);
                startActivity(intent);
            }
        });



    }
}
