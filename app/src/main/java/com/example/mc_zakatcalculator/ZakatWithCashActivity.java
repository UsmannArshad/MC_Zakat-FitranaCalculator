package com.example.mc_zakatcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ZakatWithCashActivity extends AppCompatActivity {
    private Button calculatebtn;
    private EditText price,cash;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zakat_with_cash);
        calculatebtn=findViewById(R.id.zakatcashcalculate);
        price=findViewById(R.id.goldprice);
        cash=findViewById(R.id.cash);
        textView=findViewById(R.id.textView4);
        calculatebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float pricepertola=Float.parseFloat(price.getText().toString());
                Float cashh=Float.parseFloat(cash.getText().toString());
                int req_price=(int)(pricepertola*7.5);
                if(cashh<req_price)
                {
                    textView.setText("Threshold not met");
                }
                else
                {
                    float total=cashh/pricepertola;
                    int ans=(int)(total*pricepertola*0.025);
                    textView.setText(Integer.toString(ans));
                }

            }
        });
    }
}