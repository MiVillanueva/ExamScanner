package com.example.scan;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
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
                // Define the action for settings button
                Intent intent = new Intent(activity_LandingPage.this, Scanner.class);
                startActivity(intent);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the action for add button
                Intent intent = new Intent(activity_LandingPage.this, activity_AddClass.class);
                startActivity(intent);
            }
        });

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.nav_notifications) {
                        // Handle notifications item selection
                        // For example, navigate to notifications activity
                        Intent notificationsIntent = new Intent(activity_LandingPage.this, activity_notifications.class);
                        startActivity(notificationsIntent);
                        return true;
                    // Add cases for other menu items if needed
                }
                return false;
            }
        });
    }
}
