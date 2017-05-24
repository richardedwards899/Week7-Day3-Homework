package com.codeclan.example.topchores2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get our list of movies....
        TopChores topChores = new TopChores();
        ArrayList<String> listToDisplay = topChores.getList();

        //and feed it into the adapter that's going to display them
        TopChoresAdapter choresAdapter = new TopChoresAdapter(this, listToDisplay);

        //create a handle to our ListView on the layout
        ListView listView = (ListView) findViewById(R.id.list);

        //connect the ListView to the adapter
        listView.setAdapter(choresAdapter);
    }
}
