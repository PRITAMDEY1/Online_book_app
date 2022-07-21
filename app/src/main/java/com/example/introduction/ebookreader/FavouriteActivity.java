package com.example.introduction.ebookreader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class FavouriteActivity extends AppCompatActivity {
    String id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite);
        id= getIntent().getStringExtra("BookID");
        Toast.makeText(this, id, Toast.LENGTH_SHORT).show();
    }
}