package com.kjw.kimjongwoo.ui.Touristspots;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TouristspotViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TouristspotViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}