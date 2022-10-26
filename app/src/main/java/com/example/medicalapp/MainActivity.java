package com.example.medicalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initLayout();
    }

   void initLayout()
   {
       button = findViewById(R.id.buttonStart);

       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startIntent();
           }
       });
   }


    private  void startIntent()
    {
        Intent i = new Intent(MainActivity.this, StartActivity.class);
        startActivity(i);
    }
}