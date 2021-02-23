package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAdd,btnMul,btnSub,btnDiv;
        TextView tvAns;
        EditText etNo1,etNo2;
        btnAdd=findViewById(R.id.btnAdd);
        btnMul=findViewById(R.id.btnMul);
        btnSub=findViewById(R.id.btnSub);
        btnDiv=findViewById(R.id.btnDiv);

        tvAns=findViewById(R.id.tvAns);
        etNo1= findViewById(R.id.etNo1);
        etNo2=findViewById(R.id.etNo2);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1=Integer.parseInt(etNo1.getText().toString());
                int n2=Integer.parseInt(etNo2.getText().toString());
                int ans= n1+n2;
                tvAns.setText(ans+"");
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1=Integer.parseInt(etNo1.getText().toString());
                int n2=Integer.parseInt(etNo2.getText().toString());
                int ans= n1-n2;
                tvAns.setText(ans+"");
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1=Integer.parseInt(etNo1.getText().toString());
                int n2=Integer.parseInt(etNo2.getText().toString());
                int ans= n1*n2;
                tvAns.setText(ans+"");
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1=Integer.parseInt(etNo1.getText().toString());
                int n2=Integer.parseInt(etNo2.getText().toString());
                int ans= n1/n2;
                tvAns.setText(ans+"");
            }
        });





    }
}