package com.kurlic.mapboxproj;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.mapbox.maps.MapView;

public abstract class MainActivity extends AppCompatActivity {
    MapView mapView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        try {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            //mapView = findViewById(R.id.mapView);

            //Plugin.Mapbox.getInstance(this, getString(R.string.mapbox_access_token));
            //mapView = findViewById(R.id.mapView);
            //mapView.getMapboxMap().
            //mapView.getMapboxMap().loadStyleUri(Style.MAPBOX_STREETS);


        }
        catch(Exception e)
        {
            Toast.makeText(this, e.toString(), Toast.LENGTH_LONG);
        }
    }


    @Override
    protected void onStart() {
        super.onStart();
        if(mapView != null)
        {
            mapView.onStart();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        if(mapView != null)
        {
            mapView.onStop();
        }
    }

    @Override
    public void onLowMemory() {
            super.onLowMemory();
            if(mapView != null)
            {
                mapView.onLowMemory();
            }
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mapView != null) {
            mapView.onDestroy();
        }
    }


}