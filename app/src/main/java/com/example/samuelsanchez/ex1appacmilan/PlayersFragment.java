package com.example.samuelsanchez.ex1appacmilan;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PlayersFragment extends Fragment {


    public PlayersFragment() {
        // Required empty public constructor
    }

    public static PlayersFragment newInstance(){
        return new PlayersFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_players, container, false);
    }


}
