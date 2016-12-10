package com.example.andry007.swapdrawer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;


public class Senin extends Fragment {
    View rootview;
    private ListView listView;
    private String[] list;
    private List_jadwal adapter;
    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        rootview = inflater.inflate(R.layout.fragment_senin, container, false);
        return rootview;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Senin");

        ArrayList<String> arrayList = new ArrayList<>();
        list= new String[]{
                "10.00 - 11.40 = Praktikum PBO",
                "13.00 - 15.00 = PAW",
                "15.00 - 17.00 = PBO",
                "17.00 - 18.30 = Etika Profesi"
        };
        Collections.addAll(arrayList,list);
        listView = (ListView) getActivity().findViewById(R.id.list_senin);
        adapter = new List_jadwal(getContext(), android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(adapter);
    }
}
