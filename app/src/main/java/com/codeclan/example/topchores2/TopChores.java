package com.codeclan.example.topchores2;

import java.util.ArrayList;

/**
 * Created by richardedwards on 24/05/2017.
 */

public class TopChores {

    private ArrayList<String> listOfChores;

    public TopChores(){
        listOfChores = new ArrayList<>();
        listOfChores.add("Make bed");
        listOfChores.add("Tidy toys away");
        listOfChores.add("Get dressed");
        listOfChores.add("Lay table");
        listOfChores.add("Clear table");
        listOfChores.add("Eat nicely");
        listOfChores.add("Be helpful");
        listOfChores.add("Be polite");
        listOfChores.add("Get washed");
        listOfChores.add("No fighting");
    }

    public ArrayList<String> getList() {
        return new ArrayList<String>(listOfChores);
    }
}
