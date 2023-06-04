package com.example.farmerscommoditymarketapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Orders extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders);

        Button button_Watchlist = (Button) findViewById(R.id.Watchlist);
        button_Watchlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        Button button_Portfolio = (Button) findViewById(R.id.Portfolio);
        button_Portfolio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Orders.this, Portfolio.class);
                finish();
                startActivity(intent);
            }
        });
        Button button_Profile = (Button) findViewById(R.id.Profile);
        button_Profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Orders.this, Profile.class);
                finish();
                startActivity(intent);
            }
        });
    }
}