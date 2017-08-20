package com.shah.rashil.tourguide;


import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class ShoppingFragments extends Fragment {

    public ShoppingFragments() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Kalbadevi", "Zaveri Bazaar", R.drawable.zaveri));
        words.add(new Word("Fort", "Crowfort Market", R.drawable.crowfort));
        words.add(new Word("Marine Lines", "Fashion Street", R.drawable.fashion));
        words.add(new Word("Lower Parel", "High Street Phoenix", R.drawable.high));
        words.add(new Word("Kurla", "Phoenix Market City", R.drawable.phoenix));
        words.add(new Word("Colaba", "Colaba Causeway Market", R.drawable.causeway));
        words.add(new Word("Kalbadevi", "Mangaldas Market", R.drawable.mangaldas));
        words.add(new Word("white", "Gandhi Market", R.drawable.gandhi));

        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_shopping);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;

    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
