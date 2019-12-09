package com.example.digitalawc.myawc;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyAwcViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MyAwcViewModel() {

        mText = new MutableLiveData<>();
        mText.setValue("This is My AWC fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}