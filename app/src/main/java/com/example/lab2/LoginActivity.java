package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText etUsername,etPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void Login(View v)
    {
        etUsername=findViewById(R.id.etUsername);
        etPassword=findViewById(R.id.etPassword);
        if(etUsername.getText().toString().equals("Test")&& etPassword.getText().toString().equals("TestUser"))
        {
            Intent i=new Intent(getApplicationContext(),DashboardActivity.class);
            i.putExtra("Username",etUsername.getText().toString());

            startActivity(i);
        }
        else
        {
            Toast.makeText(getApplicationContext(),"An Error Occured",Toast.LENGTH_LONG).show();
        }
    }
}