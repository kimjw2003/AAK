package com.kjw.kimjongwoo.ui.spot.Jeju;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.kjw.kimjongwoo.R;

public class SungActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sung);
    }
    public void onClick(View v){
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:064-783-0959"));
        startActivity(myIntent);

    }
}
