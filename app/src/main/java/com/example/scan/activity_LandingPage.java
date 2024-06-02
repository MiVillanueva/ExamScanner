package com.example.scan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.scan.R;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class activity_LandingPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);

        Button setting = findViewById(R.id.button3);
        Button add = findViewById(R.id.button2);

        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the action for scanner button
                Intent intent = new Intent(activity_LandingPage.this, Scanner.class);
                startActivity(intent);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the action for scanner button
                Intent intent = new Intent(activity_LandingPage.this, activity_AddClass.class);
                startActivity(intent);
            }
        });

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.nav_notifications:
                    // Handle Notification item selection
                    return true;
                case R.id.nav_home:
                    // Handle home item selection
                    return true;
                case R.id.nav_scanner:
                    // Handle scanner item selection
                    return true;
                case R.id.nav_profile:
                    //Handle profile item selection
                    return true;
            }
            return false;
        });


    }
}