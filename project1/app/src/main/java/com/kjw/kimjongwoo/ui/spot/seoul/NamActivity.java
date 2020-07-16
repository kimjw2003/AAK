package com.kjw.kimjongwoo.ui.spot.seoul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.kjw.kimjongwoo.R;

public class NamActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nam);
    }
    public void onClick(View v){
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-3455-9277"));
        startActivity(myIntent);

    }
}
