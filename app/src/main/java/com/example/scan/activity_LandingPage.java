package com.example.scan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class activity_LandingPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button AddClass = findViewById(R.id.add);
        Button Scanner = findViewById(R.id.scan);




        AddClass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Define the action for SoftEng button
                Intent intent = new Intent(activity_LandingPage.this, activity_AddClass.class);
                startActivity(intent);
            }
        });
        Scanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Define the action for CS button
                Intent intent = new Intent(activity_LandingPage.this, Scanner.class);
                startActivity(intent);
            }
        });

    }
}