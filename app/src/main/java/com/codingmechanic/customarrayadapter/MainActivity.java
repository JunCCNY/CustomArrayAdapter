package com.codingmechanic.customarrayadapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<Event> events = new ArrayList<>();

        events.add(new Event("Apple", "001 Heaven Ave", "apple", "9-11-2016", 100));
        events.add(new Event("MicroSoft", "002 Heaven Ave", "Rice", "9-11-2016", 100));
        events.add(new Event("Google", "000 Heaven Ave", "Dessert", "9-11-2016", 100));
        events.add(new Event("Apple", "001 Heaven Ave", "apple", "9-11-2016", 100));
        events.add(new Event("MicroSoft", "002 Heaven Ave", "Rice", "9-11-2016", 100));
        events.add(new Event("Google", "000 Heaven Ave", "Dessert", "9-11-2016", 100));
        events.add(new Event("Apple", "001 Heaven Ave", "apple", "9-11-2016", 100));
        events.add(new Event("MicroSoft", "002 Heaven Ave", "Rice", "9-11-2016", 100));
        events.add(new Event("Google", "000 Heaven Ave", "Dessert", "9-11-2016", 100));
        events.add(new Event("Apple", "001 Heaven Ave", "apple", "9-11-2016", 100));
        events.add(new Event("MicroSoft", "002 Heaven Ave", "Rice", "9-11-2016", 100));
        events.add(new Event("Google", "000 Heaven Ave", "Dessert", "9-11-2016", 100));
        events.add(new Event("Apple", "001 Heaven Ave", "apple", "9-11-2016", 100));
        events.add(new Event("MicroSoft", "002 Heaven Ave", "Rice", "9-11-2016", 100));
        events.add(new Event("Google", "000 Heaven Ave", "Dessert", "9-11-2016", 100));
        events.add(new Event("Apple", "001 Heaven Ave", "apple", "9-11-2016", 100));
        events.add(new Event("MicroSoft", "002 Heaven Ave", "Rice", "9-11-2016", 100));
        events.add(new Event("Google", "000 Heaven Ave", "Dessert", "9-11-2016", 100));


        EventAdapter arrayAdapter = new EventAdapter(this, events);

        ListView listView = (ListView) findViewById(R.id.list_item);
        listView.setAdapter(arrayAdapter);


    }
}
