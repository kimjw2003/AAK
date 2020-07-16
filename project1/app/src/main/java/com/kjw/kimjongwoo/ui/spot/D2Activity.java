package com.kjw.kimjongwoo.ui.spot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.kjw.kimjongwoo.R;
import com.kjw.kimjongwoo.ui.spot.Daegu.ArActivity;
import com.kjw.kimjongwoo.ui.spot.Daegu.DongActivity;
import com.kjw.kimjongwoo.ui.spot.Daegu.EwActivity;
import com.kjw.kimjongwoo.ui.spot.Daegu.SmActivity;

public class D2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d2);
    }

    public void move(View v) {
        Intent intent = new Intent(D2Activity.this, SmActivity.class);
        startActivity(intent);
    }
    public void move2(View v) {
        Intent intent = new Intent(D2Activity.this, EwActivity.class);
        startActivity(intent);
    }
    public void move3(View v) {
        Intent intent = new Intent(D2Activity.this, ArActivity.class);
        startActivity(intent);
    }
    public void move4(View v) {
        Intent intent = new Intent(D2Activity.this, DongActivity.class);
        startActivity(intent);
    }
}
