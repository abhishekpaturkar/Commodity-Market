package com.example.commoditymarket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Portfolio extends AppCompatActivity {

    private Button Button_Watchlist;
    private Button Button_Orders;
    private Button Button_Profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);

        Button_Watchlist = (Button) findViewById(R.id.Watchlist);
        Button_Watchlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        Button_Orders = (Button) findViewById(R.id.Orders);
        Button_Orders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Portfolio.this, Orders.class);
                finish();
                startActivity(intent);
            }
        });
        Button_Profile = (Button) findViewById(R.id.Profile);
        Button_Profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Portfolio.this, Profile.class);
                finish();
                startActivity(intent);
            }
        });
    }
}