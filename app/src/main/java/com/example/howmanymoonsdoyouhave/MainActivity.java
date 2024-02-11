package com.example.howmanymoonsdoyouhave;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    ArrayList<Planet> planetsArrayList;

    private static MyCustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);


        planetsArrayList = new ArrayList<>();


        Planet planet1 = new Planet("Earth", "1", R.drawable.earth);
        Planet planet2 = new Planet("Mars", "2", R.drawable.marss);
        Planet planet3 = new Planet("Jupiter", "95", R.drawable.jupiter);
        Planet planet4 = new Planet("Mercury", "0", R.drawable.mercury);
        Planet planet5 = new Planet("Neptune", "14", R.drawable.neptune);
        Planet planet6 = new Planet("Saturn", "146", R.drawable.saturn);
        Planet planet7 = new Planet("Uranus", "27", R.drawable.uranus);
        Planet planet8 = new Planet("Venus", "0", R.drawable.venus);


        planetsArrayList.add(planet1);
        planetsArrayList.add(planet2);
        planetsArrayList.add(planet3);
        planetsArrayList.add(planet4);
        planetsArrayList.add(planet5);
        planetsArrayList.add(planet6);
        planetsArrayList.add(planet7);
        planetsArrayList.add(planet8);


        adapter = new MyCustomAdapter(planetsArrayList, getApplicationContext());
        listView.setAdapter(adapter);



    }
}