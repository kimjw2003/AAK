package com.kjw.kimjongwoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);
    }

    public void move(View v){
        Intent intent = new Intent(DActivity.this, JejuActivity.class);
        startActivity(intent);
    }
}
