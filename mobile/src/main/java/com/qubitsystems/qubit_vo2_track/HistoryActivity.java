package com.qubitsystems.qubit_vo2_track;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HistoryActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.qubitsystems.qubit_vo2_track.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView textView = findViewById(R.id.textView);
        textView.setText(message);

    }

    public void viewSession(View view) {
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText("Session");
        Intent intent = new Intent(this, HistoricalSessionActivity.class);
        String message = "SETTINGS";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
