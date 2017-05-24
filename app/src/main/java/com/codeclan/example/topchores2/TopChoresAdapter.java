package com.codeclan.example.topchores2;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by richardedwards on 24/05/2017.
 */

public class TopChoresAdapter extends ArrayAdapter<String> {

    public TopChoresAdapter(Context context, ArrayList<String> chores) {
        super(context, 0, chores);
    }

    //position: used to iterate through the list. listItemView: old view for recycling. parent: ListView that View will be attached to.
    @Override
    public View getView(int position, View listItemView, ViewGroup parent){

        //magic Android!  This code recycles list items that are no longer needed.
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.chore_item, parent, false); //WTF is chore_item??
        }

        String currentString = getItem(position); //get item from where??
        Log.d("Value of currentString", currentString);

        //create a handle to the display field
        TextView choreText = (TextView) listItemView.findViewById(R.id.chore);
        choreText.setText(currentString);

        return listItemView; //why??
    }
}
