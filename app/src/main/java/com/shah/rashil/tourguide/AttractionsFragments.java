package com.shah.rashil.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ListView;

import java.util.ArrayList;

public class AttractionsFragments extends Fragment {


    public AttractionsFragments() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Churchgate", "Gateway of India", R.drawable.mumbai));
        words.add(new Word("Gharapuri", "Elephanta Caves", R.drawable.elephanta));
        words.add(new Word("Haji Ali", "Haji Ali Dargah", R.drawable.hajiali));
        words.add(new Word("Chairni Road", "Girgaum Chowpatty", R.drawable.chowpaty));
        words.add(new Word("Prabhadevi", "Siddhivinayak Temple", R.drawable.siddiwinayak));
        words.add(new Word("Marine Drive", "Taraporewala Aquarium", R.drawable.taraporewalan));
        words.add(new Word("Worli", "Nehru Science Centre", R.drawable.nehrun));
        words.add(new Word("Borivali", "Sanjay Gandi Nationa Park", R.drawable.sanjayn));

        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_attractions);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;

    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
