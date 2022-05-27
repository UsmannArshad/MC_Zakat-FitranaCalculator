package com.example.mc_zakatcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class ZakatActivity extends AppCompatActivity {
    private  Button cash,gold,silver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zakat);
        cash=findViewById(R.id.cashbt);
        gold=findViewById(R.id.goldbtn);
        silver=findViewById(R.id.silverbtn);
        cash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(ZakatActivity.this,ZakatWithCashActivity.class);
                startActivity(intent);

            }
        });
        gold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(ZakatActivity.this,ZakatWithGoldActivity.class);
                startActivity(intent);
            }
        });
        silver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(ZakatActivity.this,ZakatWithSilver.class);
                startActivity(intent);
            }
        });
    }
}