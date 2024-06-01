package com.example.scan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.scan.R;

public class activity_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonBack = findViewById(R.id.button_back);
        Button buttonNext = findViewById(R.id.button_next);
        Button SoftEng = findViewById(R.id.SE);
        Button CS = findViewById(R.id.CyberSec);
        Button Methods = findViewById(R.id.MoR);
        Button Quanti = findViewById(R.id.QM);
        Button PhyEd = findViewById(R.id.PhysicalEdu);
        Button ComProg = findViewById(R.id.ComProg);

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Define the action for Back button
                Intent intent = new Intent(activity_main.this, LoginPage.class);
                startActivity(intent);
            }
        });

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Define the action for Next button
                Intent intent = new Intent(activity_main.this, Scanner.class);
                startActivity(intent);
            }
        });


    }
}