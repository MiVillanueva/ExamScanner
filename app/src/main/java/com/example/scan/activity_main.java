package com.example.scan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class activity_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button SoftEng = findViewById(R.id.SE);
        Button CS = findViewById(R.id.CyberSec);
        Button Methods = findViewById(R.id.MoR);
        Button Quanti = findViewById(R.id.QM);
        Button PhyEd = findViewById(R.id.PhysicalEdu);
        Button ComProg = findViewById(R.id.ComProg);



        SoftEng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Define the action for SoftEng button
                Intent intent = new Intent(activity_main.this, SoftEngSection.class);
                startActivity(intent);
            }
        });
        CS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Define the action for CS button
                Intent intent = new Intent(activity_main.this, CyberSecSection.class);
                startActivity(intent);
            }
        });
        Methods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Define the action for Methods button
                Intent intent = new Intent(activity_main.this, StudentNames.class);
                startActivity(intent);
            }
        });
        Quanti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Define the action for Quanti button
                Intent intent = new Intent(activity_main.this, StudentNames.class);
                startActivity(intent);
            }
        });

        PhyEd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Define the action for PhyEd button
                Intent intent = new Intent(activity_main.this, StudentNames.class);
                startActivity(intent);
            }
        });

        ComProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Define the action for ComProg button
                Intent intent = new Intent(activity_main.this, StudentNames.class);
                startActivity(intent);
            }
        });
    }
}