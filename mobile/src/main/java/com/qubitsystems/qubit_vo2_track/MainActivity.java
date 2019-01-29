package com.qubitsystems.qubit_vo2_track;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.qubitsystems.qubit_vo2_track.MESSAGE";
    private Profile base = new Profile("Randy", "Trinh", "trinhrandy", 22, "MALE", 165.0, 56);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button buttonHome = findViewById(R.id.buttonHome);
        buttonHome.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.textView);
                tv.setText("Home");
            }
        });

        int heartRate;
        int vo2;

    }

    public void viewHistory(View view) {
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText("History");
        Intent intent = new Intent(this, HistoryActivity.class);
        String message = "HISTORY TEST";
        intent.putExtra(EXTRA_MESSAGE, message);
        //intent.putExtra();
        startActivity(intent);
    }

    public void viewActiveSessionLanding(View view) {
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText("Active Session");
        Intent intent = new Intent(this, ActiveSessionLandingActivity.class);
        String message = "ACTIVE SESSION LANDING TEST";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void viewProfile(View view) {
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText("Profile");
        Intent intent = new Intent(this, ProfileActivity.class);
        String message = "PROFILE";
        intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtra("Profile", getProfile());
        startActivityForResult(intent, 1);
    }

    public void viewSettings(View view) {
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText("Settings");
        Intent intent = new Intent(this, SettingActivity.class);
        String message = "SETTINGS";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public Profile getProfile() {
        return base;
    }
}
