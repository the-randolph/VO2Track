package com.qubitsystems.qubit_vo2_track;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActiveSessionLandingActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.qubitsystems.qubit_vo2_track.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_active_session_landing);

        Intent intent = getIntent();
        String message = "Running, jogging, walking?\nTrack your performance";

        TextView textView = findViewById(R.id.textView2);
        textView.setText(message);
    }

    public void startActiveSession(View view) {
        Intent intent = new Intent(this, ConnectDeviceActivity.class);
        String message = "CONNECT DEVICE TEST";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
