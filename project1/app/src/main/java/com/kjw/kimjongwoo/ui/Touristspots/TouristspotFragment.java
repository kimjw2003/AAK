package com.kjw.kimjongwoo.ui.Touristspots;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.kjw.kimjongwoo.R;
import com.kjw.kimjongwoo.ui.spot.B2Activity;
import com.kjw.kimjongwoo.ui.spot.D2Activity;
import com.kjw.kimjongwoo.ui.spot.J2Activity;
import com.kjw.kimjongwoo.ui.spot.S2Activity;

public class TouristspotFragment extends Fragment {

    private TouristspotViewModel shareViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        shareViewModel =
                ViewModelProviders.of(this).get(TouristspotViewModel.class);
        View root = inflater.inflate(R.layout.fragment_touristspots, container, false);
        root.findViewById(R.id.button).setOnClickListener((view)->{
            Intent i = new Intent(getActivity(), S2Activity.class);
            startActivity(i);
        });
        root.findViewById(R.id.button2).setOnClickListener((view)->{
            Intent i = new Intent(getActivity(), B2Activity.class);
            startActivity(i);
        });
        root.findViewById(R.id.button3).setOnClickListener((view)->{
            Intent i = new Intent(getActivity(), D2Activity.class);
            startActivity(i);
        });
        root.findViewById(R.id.button4).setOnClickListener((view)->{
            Intent i = new Intent(getActivity(), J2Activity.class);
            startActivity(i);
        });

        return root;
    }
}