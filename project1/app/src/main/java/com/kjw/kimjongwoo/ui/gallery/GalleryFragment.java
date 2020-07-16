package com.kjw.kimjongwoo.ui.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.kjw.kimjongwoo.BusanActivity;
import com.kjw.kimjongwoo.DActivity;
import com.kjw.kimjongwoo.JejuActivity;
import com.kjw.kimjongwoo.R;
import com.kjw.kimjongwoo.SActivity;

public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        root.findViewById(R.id.button).setOnClickListener((view)->{
            Intent i = new Intent(getActivity(), SActivity.class);
            startActivity(i);
        });
        root.findViewById(R.id.button2).setOnClickListener((view)->{
            Intent i = new Intent(getActivity(), BusanActivity.class);
            startActivity(i);
        });
        root.findViewById(R.id.button3).setOnClickListener((view)->{
            Intent i = new Intent(getActivity(), DActivity.class);
            startActivity(i);
        });
        root.findViewById(R.id.button4).setOnClickListener((view)->{
            Intent i = new Intent(getActivity(), JejuActivity.class);
            startActivity(i);
        });



        return root;
    }
}