package com.example.andry007.swapdrawer;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;


public class Kamis extends Fragment {
    View rootView;
    private ListView listView;
    private String[] list;
    private List_jadwal adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_kamis, container, false);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Kamis");
                ArrayList<String> arrayList = new ArrayList<>();
                list= new String[]{
                        "08.00 - 10.00 = Praktikum Pengantar Multimedia",
                        "10.00 - 11.40 = PAM",
                        "15.00 - 17.00 = IMK"
                };
                Collections.addAll(arrayList,list);
                listView = (ListView) getActivity().findViewById(R.id.list_kamis);
                adapter = new List_jadwal(getContext(), android.R.layout.simple_list_item_1,arrayList);
                listView.setAdapter(adapter);
            }
}
