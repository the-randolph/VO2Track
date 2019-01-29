package com.qubitsystems.qubit_vo2_track;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ProfileActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.qubitsystems.qubit_vo2_track.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        Profile base = intent.getParcelableExtra("Profile");

        TextView textView = findViewById(R.id.textView6);
        textView.setText(message);

        TextView textNameFirst = findViewById(R.id.textFirstName);
        TextView textNameLast = findViewById(R.id.textLastName);
        TextView textUserName = findViewById(R.id.textUserName);
        TextView textAge = findViewById(R.id.textAge);
        TextView textGender = findViewById(R.id.textGender);
        TextView textHeight = findViewById(R.id.textHeight);
        TextView textWeight = findViewById(R.id.textWeight);

        textNameFirst.setText(base.getFirstName());
        textNameLast.setText(base.getLastName());
        textUserName.setText(base.getUserName());
        textAge.setText(Integer.toString(base.getUserAge()));
        textGender.setText(base.getUserGender());
        textHeight.setText(Double.toString(base.getUserHeight()));
        textWeight.setText(Double.toString(base.getUserWeight()));
    }

    public void startActiveSession(View view) {
        Intent intent = new Intent(this, ConnectDeviceActivity.class);
        String message = "CONNECT DEVICE TEST";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
