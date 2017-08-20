package com.shah.rashil.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsFragments extends Fragment {

    public RestaurantsFragments() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);



        final ArrayList<Word> words = new ArrayList<Word>();
            words.add(new Word("Kalbadevi", "Shree Thaker Bhojanalay", R.drawable.shree));
        words.add(new Word("Matunga", "Cafe Madras", R.drawable.cafen));
        words.add(new Word("Bandra", "Global Fusion ", R.drawable.globaln));
        words.add(new Word("Byculla", "Persian Darbar", R.drawable.pnersian));
        words.add(new Word("Girgaum Chowpaty", "Govinda's Restaurant", R.drawable.govindasn));
        words.add(new Word("Juhu", "Mahesh Lunch Home", R.drawable.maheshn));
        words.add(new Word("Pydhoni", "Bhagat Tarachand", R.drawable.bhagatn));
        words.add(new Word("Girgaum Chowpaty", "Suksagar", R.drawable.suksagarn));

        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_restaurants);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;

    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
