package com.example.commoditymarket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Profile extends AppCompatActivity {

    private Button Button_Watchlist;
    private Button Button_Portfolio;
    private Button Button_Orders;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Button_Watchlist = (Button) findViewById(R.id.Watchlist);
        Button_Watchlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        Button_Portfolio = (Button) findViewById(R.id.Portfolio);
        Button_Portfolio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Profile.this, Portfolio.class);
                finish();
                startActivity(intent);
            }
        });
        Button_Orders = (Button) findViewById(R.id.Orders);
        Button_Orders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Profile.this, Orders.class);
                finish();
                startActivity(intent);
            }
        });
    }
}