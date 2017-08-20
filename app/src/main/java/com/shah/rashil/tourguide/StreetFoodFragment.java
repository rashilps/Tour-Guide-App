package com.shah.rashil.tourguide;


import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class StreetFoodFragment extends Fragment {

    public StreetFoodFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Charni Road", "Say Cheese", R.drawable.saycheese));
        words.add(new Word("Haji Ali", "Heera Panna Pav Bhaji", R.drawable.heerapanna));
        words.add(new Word("Sarvi, Byculla", "Kheema and Seekh Parathas", R.drawable.sarvi));
        words.add(new Word("Ghatkoper", "Blossom", R.drawable.blossom));
        words.add(new Word("WTC", "WTC Pasta", R.drawable.wtc));
        words.add(new Word("Charni Road", "Tuck Box", R.drawable.tuckbox));
        words.add(new Word("Kems Corner", "Mucchad Pan", R.drawable.mucchad));
        words.add(new Word("Tardeo", "Mamaji's Sandwitch", R.drawable.mamaji));

        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_street_food);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;

    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
