package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void losowanie(View view) {
        int x = (int) (Math.random() * 100 + 1);
        TextView textView=(TextView)findViewById(R.id.numer);
        textView.setText(Integer.toString(x));
    }
}