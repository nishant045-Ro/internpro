package com.example.internpro;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home_page);

        TextView tvUserName = findViewById(R.id.tvUserName);

        String username = getIntent().getStringExtra("USERNAME");

        if (username != null) {
            tvUserName.setText("Hi, " + username);
        }
    }
}