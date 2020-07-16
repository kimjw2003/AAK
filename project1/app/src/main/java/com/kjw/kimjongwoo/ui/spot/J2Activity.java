package com.kjw.kimjongwoo.ui.spot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.kjw.kimjongwoo.R;
import com.kjw.kimjongwoo.ui.spot.Jeju.HanActivity;
import com.kjw.kimjongwoo.ui.spot.Jeju.ManActivity;
import com.kjw.kimjongwoo.ui.spot.Jeju.SungActivity;
import com.kjw.kimjongwoo.ui.spot.Jeju.UActivity;

public class J2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_j2);
    }
    public void move(View v) {
        Intent intent = new Intent(J2Activity.this, HanActivity.class);
        startActivity(intent);
    }
    public void move2(View v) {
        Intent intent = new Intent(J2Activity.this, ManActivity.class);
        startActivity(intent);
    }
    public void move3(View v) {
        Intent intent = new Intent(J2Activity.this, UActivity.class);
        startActivity(intent);
    }
    public void move4(View v) {
        Intent intent = new Intent(J2Activity.this, SungActivity.class);
        startActivity(intent);
    }
}
