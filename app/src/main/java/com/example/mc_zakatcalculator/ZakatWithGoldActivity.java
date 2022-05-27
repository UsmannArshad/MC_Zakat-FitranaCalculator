package com.example.mc_zakatcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ZakatWithGoldActivity extends AppCompatActivity {
    private Button calculatebtn;
    private EditText price,tolas;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zakat_with_gold);
        calculatebtn=findViewById(R.id.zakatgoldcalculate);
        price=findViewById(R.id.priceofgold);
        tolas=findViewById(R.id.gold_amount);
        textView=findViewById(R.id.textView2);
        calculatebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float pricepertola=Float.parseFloat(price.getText().toString());
                Float gold_amount=Float.parseFloat(tolas.getText().toString());
                if(gold_amount<7.5)
                {
                    textView.setText("Threshold not met");
                }
                else
                {
                    int result=(int)(pricepertola*gold_amount*0.025);
                    textView.setText(Integer.toString(result));
                }

            }
        });
    }
}