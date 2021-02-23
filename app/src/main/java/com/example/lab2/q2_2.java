package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class q2_2 extends AppCompatActivity {
    TextView tvStudentId,tvStudentName,tvStudentBranch,tvStudentMobile,tvStudentDOB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2_2);
        getSupportActionBar().setDisplayShowCustomEnabled(true);

        tvStudentId=findViewById(R.id.tvStudentId);
        tvStudentName=findViewById(R.id.tvStudentName);
        tvStudentBranch=findViewById(R.id.tvStudentBranch);
        tvStudentMobile=findViewById(R.id.tvStudentMobile);
        tvStudentDOB=findViewById(R.id.tvStudentDOB);

        Intent in=getIntent();
        tvStudentId.setText("Student Id"+in.getStringExtra("sid"));
        tvStudentName.setText("Student Name "+in.getStringExtra("sname"));
        tvStudentBranch.setText("Student Branch "+in.getStringExtra("sbranch"));
        tvStudentMobile.setText("Student Mobile "+in.getStringExtra("smobile"));
        tvStudentDOB.setText("Student DOB "+in.getStringExtra("sdob"));
    }
}