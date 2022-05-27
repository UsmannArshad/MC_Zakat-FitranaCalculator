package com.example.mc_zakatcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class FitranaActivity extends AppCompatActivity {
private Button wheatbtn,kishmishbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitrana);
        wheatbtn=findViewById(R.id.wheatbutton);
        kishmishbtn=findViewById(R.id.kishmishbutton);
        wheatbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(FitranaActivity.this,WheatActivity.class);
                startActivity(intent);
            }
        });
        kishmishbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(FitranaActivity.this,KishmishActivity.class);
                startActivity(intent);
            }
        });
    }
}