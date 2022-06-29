package com.example.gridviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    protected GridView grid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grid = findViewById(R.id.simple_grid);

        ArrayList<DataModel> gridList = new ArrayList<>();

        gridList.add(new DataModel("Image 1"));
        gridList.add(new DataModel("Image 2"));
        gridList.add(new DataModel("Image 3"));
        gridList.add(new DataModel("Image 4"));
        gridList.add(new DataModel("Image 5"));
        gridList.add(new DataModel("Image 6"));
        gridList.add(new DataModel("Image 7"));
        gridList.add(new DataModel("Image 8"));

        Adapter adapter = new Adapter(this, gridList);
        grid.setAdapter(adapter);
    }
}