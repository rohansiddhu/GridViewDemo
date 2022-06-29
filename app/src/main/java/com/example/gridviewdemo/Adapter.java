package com.example.gridviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class Adapter extends ArrayAdapter<DataModel> {
    Context context;
    ArrayList<DataModel> list;

    public Adapter(Context context, ArrayList<DataModel> list) {
        super(context, R.layout.grid_item, list);
        this.list = list;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View current = convertView;

        if (current == null) {
            LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            current = inflater.inflate(R.layout.grid_item, parent, false);
        }

        TextView title = current.findViewById(R.id.grid_title);
        DataModel obj = list.get(position);
        title.setText(obj.getTitle());

        return current;
    }
}
