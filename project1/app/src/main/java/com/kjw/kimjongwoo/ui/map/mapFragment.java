package com.kjw.kimjongwoo.ui.map;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.kjw.kimjongwoo.MapActivity;
import com.kjw.kimjongwoo.R;

public class mapFragment extends Fragment{

    private mapViewModel sendViewModel;
    Button MapButton;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        sendViewModel =
                ViewModelProviders.of(this).get(mapViewModel.class);
        View root = inflater.inflate(R.layout.fragment_map, container, false);
        root.findViewById(R.id.map_button).setOnClickListener((view)->{
            Intent i = new Intent(getActivity(), MapActivity.class);
            startActivity(i);
        });


        return root;
    }


    public void move(View view){
        startActivity(new Intent(getActivity(), MapActivity.class));

    }
}