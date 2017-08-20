package com.shah.rashil.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StreetFoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new StreetFoodFragment())
                .commit();
    }
}
