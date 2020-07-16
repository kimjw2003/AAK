package com.kjw.kimjongwoo.ui.spot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.kjw.kimjongwoo.R;
import com.kjw.kimjongwoo.ui.spot.seoul.GyeongActivity;
import com.kjw.kimjongwoo.ui.spot.seoul.LotteActivity;
import com.kjw.kimjongwoo.ui.spot.seoul.NamActivity;
import com.kjw.kimjongwoo.ui.spot.seoul.YeoActivity;

public class S2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s2);


    }
    public void move(View v) {
        Intent intent = new Intent(S2Activity.this, NamActivity.class);
        startActivity(intent);
    }
    public void move2(View v) {
        Intent intent = new Intent(S2Activity.this, GyeongActivity.class);
        startActivity(intent);
    }
    public void move3(View v) {
        Intent intent = new Intent(S2Activity.this, YeoActivity.class);
        startActivity(intent);
    }
    public void move4(View v) {
        Intent intent = new Intent(S2Activity.this, LotteActivity.class);
        startActivity(intent);
    }
}
