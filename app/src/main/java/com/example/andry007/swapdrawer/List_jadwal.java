package com.example.andry007.swapdrawer;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by andry007 on 09/12/2016.
 */

public class List_jadwal extends ArrayAdapter<String> {
    Context context;
    int textViewResourceId;
    HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

    public List_jadwal(Context context, int resource, List<String> objects) {
        super(context, resource, objects);
        this.context = context;
        this.textViewResourceId = textViewResourceId;
        for (int i = 0; i < objects.size(); ++i) {
            hashMap.put(objects.get(i), i);
        }
    }
    @Override
    public long getItemId(int position) {
        String item = getItem(position);
        return hashMap.get(item);
    }
    @Override
    public boolean hasStableIds() {
        return true;
    }
    @Override
    public void add(String object) {
        hashMap.put(object, hashMap.size());
        this.notifyDataSetChanged();
    }

}
