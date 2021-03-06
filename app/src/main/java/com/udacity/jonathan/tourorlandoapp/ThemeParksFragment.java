package com.udacity.jonathan.tourorlandoapp;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ThemeParksFragment extends Fragment {

    public ThemeParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        // Create a list of attractions
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();

        attractions.add(new Attraction(R.string.magic_kingdom_title, R.string.magic_kingdom_description,
                R.drawable.disney2));
        attractions.add(new Attraction(R.string.animal_kingdom_title, R.string.animal_kingdom_description,
                R.drawable.crab));
        attractions.add(new Attraction(R.string.epcot_kingdom_title, R.string.epcot_description,
                R.drawable.diet));
        attractions.add(new Attraction(R.string.disney_studio_title, R.string.disney_studio_description,
                R.drawable.magic_wand));
        attractions.add(new Attraction(R.string.disney_typhoon_title, R.string.disney_typhoon_description,
                R.drawable.splash));

        // Create an {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_numbers);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // attraction_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link AttractionAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Attraction word = attractions.get(position);

            }
        });

        return rootView;

    }}


