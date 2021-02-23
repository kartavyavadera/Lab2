package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class q5 extends AppCompatActivity {
    EditText etConvert;
    TextView tvConverted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q5);
    }
    public void ConvertValue(View v)
    {
        etConvert=findViewById(R.id.etStrValue);
        tvConverted=findViewById(R.id.tvConverted);

        tvConverted.setText(etConvert.getText().toString().toUpperCase());
    }
}