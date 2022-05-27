package com.example.mc_zakatcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button zakatbtn,fitranabtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zakatbtn=findViewById(R.id.zakatbutton);
        fitranabtn=findViewById(R.id.fitranabutton);
        zakatbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ZakatActivity.class);
                startActivity(intent);
            }
        });
        fitranabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,FitranaActivity.class);
                startActivity(intent);
            }
        });
    }
}