package com.example.digitalawc.profile;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AdminProfileViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AdminProfileViewModel() {

        mText = new MutableLiveData<>();
        mText.setValue("This is Admin Profile fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}