package com.example.mc_zakatcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WheatActivity extends AppCompatActivity {

    private Button submitbtn;
    private EditText prices,member;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wheat);
        submitbtn=findViewById(R.id.wheatcalculate);
        prices=findViewById(R.id.price);
        member=findViewById(R.id.kishmishmember);
        textView=findViewById(R.id.textView1);
        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float pricee=Float.parseFloat(prices.getText().toString());
                int members=Integer.parseInt(member.getText().toString());
                float val=pricee*2*members;
                textView.setText(Float.toString(val));
            }
        });
    }
}