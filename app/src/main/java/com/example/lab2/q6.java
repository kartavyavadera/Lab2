package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class q6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q6);

    }
    public void ActionCall(View v)
    {
        switch (v.getId())
        {
            case R.id.btnWebsite:
                startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://google.com")));
                break;
            case R.id.btnMakeCall:
                startActivity(new Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel:9724676797")));
                break;
            case R.id.btnShowMap:
                startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://maps.google.co.in/maps?q=")));
                break;
            case R.id.btnContact:
                startActivity(new Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel:")));
                break;
            default:
                Toast.makeText(getApplicationContext(),"An error occured!!",Toast.LENGTH_LONG).show();
        }
    }
}