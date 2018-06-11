package com.example.james_000.campus_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import com.google.android.gms.location.places.GeoDataClient;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.location.places.PlaceDetectionClient;


public class MainActivity extends AppCompatActivity {

    private Button getLocation;
    protected GeoDataClient mGeoDataClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Construct a GeoDataClient.
        mGeoDataClient = Places.getGeoDataClient(this, null);

        // Construct a PlaceDetectionClient.
        mPlaceDetectionClient = Places.getPlaceDetectionClient(this, null);

        getLocation = (Button) findViewById(R.id.loc_button);
        getLocation.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                nextButton();
            }
        });
    }

    private void nextButton(){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }
}
