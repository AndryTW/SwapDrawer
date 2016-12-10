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


public class Rabu extends Fragment {
    View rootview;
    private ListView listView;
    private String[] list;
    private List_jadwal adapter;;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        return inflater.inflate(R.layout.fragment_rabu, container, false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Rabu");

        ArrayList<String> arrayList = new ArrayList<>();
        list= new String[]{
                "07.30 - 10.00 = Otomata dan Bahasa Formal"
        };
        Collections.addAll(arrayList,list);
        listView = (ListView) getActivity().findViewById(R.id.list_rabu);
        adapter = new List_jadwal(getContext(), android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(adapter);
    }
}
