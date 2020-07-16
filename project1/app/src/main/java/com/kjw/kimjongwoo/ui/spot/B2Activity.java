package com.kjw.kimjongwoo.ui.spot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.kjw.kimjongwoo.R;
import com.kjw.kimjongwoo.ui.spot.Busan.GwActivity;
import com.kjw.kimjongwoo.ui.spot.Busan.HaeActivity;
import com.kjw.kimjongwoo.ui.spot.Busan.JaActivity;
import com.kjw.kimjongwoo.ui.spot.Busan.SeoActivity;

public class B2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b2);
    }
    public void move(View v) {
        Intent intent = new Intent(B2Activity.this, GwActivity.class);
        startActivity(intent);
    }
    public void move2(View v) {
        Intent intent = new Intent(B2Activity.this, SeoActivity.class);
        startActivity(intent);
    }
    public void move3(View v) {
        Intent intent = new Intent(B2Activity.this, HaeActivity.class);
        startActivity(intent);
    }
    public void move4(View v) {
        Intent intent = new Intent(B2Activity.this, JaActivity.class);
        startActivity(intent);
    }
}
