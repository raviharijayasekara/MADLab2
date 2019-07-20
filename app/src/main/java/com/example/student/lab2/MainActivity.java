package com.example.student.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text2 = findViewById(R.id.text1);
        text2.setText(R.string.Msg1);

        Log.i("Lifecycle","Inside onCreate method");


    }

    @Override
    protected void onResumeFragments() {
        super.onResumeFragments();
        Log.i("Lifecycle","Inside onResume method");


    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Lifecycle","Inside onRestart method");



    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Lifecycle","Inside onPause method");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Lifecycle","Inside onStop method");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Lifecycle","Inside onDestroy method");
    }
}
