package com.kjw.kimjongwoo.ui.home;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.kjw.kimjongwoo.R;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;


    long now = System.currentTimeMillis();
    Date date = new Date(now);
    SimpleDateFormat sdfNow = new SimpleDateFormat("MM/dd HH:mm");
    String formatDate = sdfNow.format(date);

    TextView dateNow;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        dateNow = (TextView) root.findViewById(R.id.dateNow);
        Handler h = new Handler();
        new Thread(()->{ //이러면 시간 업데이트 될꺼임
            while(true){
                formatDate = sdfNow.format(new Date(System.currentTimeMillis()));
                h.post(()->{dateNow.setText(formatDate);});   // TextView 에 현재 시간 문자열 할당
                try{
                    Thread.sleep(1000);
                }catch(Exception e){
                    Log.d("error", e.getMessage());
                }
            }
        }).start();



        return root;
    }
}