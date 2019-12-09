package com.example.digitalawc.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.MenuView;
import androidx.fragment.app.Fragment;

import com.example.digitalawc.R;

public class UserProfilefragment extends Fragment {
    //View listView = getActivity().findViewById(R.id.nav_myawc);
    MenuView.ItemView itemView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user_profile, container, false);
        itemView=view.findViewById(R.id.nav_myprofile);
        return view;
    }
}

