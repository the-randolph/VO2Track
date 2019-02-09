package com.qubitsystems.qubit_vo2_track;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ActiveSessionActivity extends AppCompatActivity {

    int heartBPM = 120;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_active_session);

        Button testButton = findViewById(R.id.buttonTest1);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView textView = findViewById(R.id.textView4);
        textView.setText(message);

        updateHeartView();

    }

    public void updateHeartBPM(View view) {
        heartBPM = heartBPM + 30;
        System.out.println("UPDATED VAL " + heartBPM);
        updateHeartView();
    }

    public void updateHeartView() {
        ImageView heart = findViewById(R.id.imageView);
        if (heartBPM >= 152) {
            heart.setColorFilter(getResources().getColor(R.color.heartMaximum));
        }
        else if (heartBPM >= 133) {
            heart.setColorFilter(getResources().getColor(R.color.heartHard));
        }

        else if (heartBPM >= 114) {
            heart.setColorFilter(getResources().getColor(R.color.heartModerate));
        }
        else {
            heart.setColorFilter(getResources().getColor(R.color.heartMaximum));
        }

        TextView sampleText = findViewById(R.id.textBPM);
        sampleText.setText(Integer.toString(heartBPM) + " BPM");
        System.out.println("TESTING VAL " + heartBPM);

        if (heartBPM > 180) {
            heartBPM = 100;
        }
    }
}
