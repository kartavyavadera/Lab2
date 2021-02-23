package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class q2_1 extends AppCompatActivity {
    EditText etStudentId,etStudentName,etStudentBranch,etStudentMobile,etStudentDOB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2_1);

        etStudentId=findViewById(R.id.etStudentId);
        etStudentName=findViewById(R.id.etStudentName);
        etStudentBranch=findViewById(R.id.etStudentBranch);
        etStudentMobile=findViewById(R.id.etStudentMobile);
        etStudentDOB=findViewById(R.id.etStudentDOB);
    }
    public void GoToActivity(View v)
    {
        Intent i=new Intent(getApplicationContext(),q2_2.class);
        i.putExtra("sid",etStudentId.getText().toString());
        i.putExtra("sname",etStudentName.getText().toString());
        i.putExtra("sbranch",etStudentBranch.getText().toString());
        i.putExtra("smobile",etStudentMobile.getText().toString());
        i.putExtra("sdob",etStudentDOB.getText().toString());
        startActivity(i);

    }
}