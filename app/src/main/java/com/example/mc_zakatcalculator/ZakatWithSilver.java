package com.example.mc_zakatcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ZakatWithSilver extends AppCompatActivity {
    private Button calculatebtn;
    private EditText price,tolas;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zakat_with_silver);
        calculatebtn=findViewById(R.id.zakatsilvercalculate);
        price=findViewById(R.id.priceofsilver);
        tolas=findViewById(R.id.silver_amount);
        textView=findViewById(R.id.textView3);
        calculatebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float pricepertola=Float.parseFloat(price.getText().toString());
                Float silver_amount=Float.parseFloat(tolas.getText().toString());
                if(silver_amount<52.5)
                {
                    textView.setText("Threshold not met");
                }
                else
                {
                    int result=(int)(pricepertola*silver_amount*0.025);
                    textView.setText(Integer.toString(result));
                }

            }
        });
    }
}