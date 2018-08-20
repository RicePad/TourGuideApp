package com.udacity.jonathan.tourorlandoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Find the View that shows the  category
        TextView themeParks = findViewById(R.id.theme_park_list);
        TextView restaurantList = findViewById(R.id.restaurant_list);
        TextView hotelList = findViewById(R.id.hotel_list);
        TextView nightClubList = findViewById(R.id.night_clubs_list);



        // Set a click listener on the desire View
        themeParks.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent themeParksIntent = new Intent(MainActivity.this, ThemeParksActivity.class);

                // Start the new activity
                startActivity(themeParksIntent);
            }
        });

        // Set a click listener on the desire View
        restaurantList.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent restaurantListIntent = new Intent(MainActivity.this, RestaurantActivity.class);

                // Start the new activity
                startActivity(restaurantListIntent);
            }
        });

        // Set a click listener on the desire View
        hotelList.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent hotelListIntent = new Intent(MainActivity.this, HotelActivity.class);

                // Start the new activity
                startActivity(hotelListIntent);
            }
        });

        // Set a click listener on the desire View
        nightClubList.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent nightClubListIntent = new Intent(MainActivity.this, NightClubActivity.class);

                // Start the new activity
                startActivity(nightClubListIntent);
            }
        });


    }
}
