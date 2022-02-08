package com.example.headfirstandroidapp;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

////As this fragment will hold a list of workout the fragment has to be listfragment so that we dont
///need to use the chapter 7 old lengthy method using adapter,using listener
///so that is why we extended ListFragment instead of fragment
///And while creating ListFragment,first -> new -> fragment(blank) -> uncheck all the option ->finish
public class ChapterEightFragmentWorkoutList extends ListFragment {

    static interface Listener {
        void itemClicked(long id);
    };

    private Listener listener;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] names = new String[ChapterEightWorkOutHelperClass.workouts.length];
        for (int i = 0; i < names.length; i++) {
            names[i] = ChapterEightWorkOutHelperClass.workouts[i].getName();
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                inflater.getContext(), android.R.layout.simple_list_item_1,
                names);
        setListAdapter(adapter);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        this.listener = (Listener)context;
    }


    @Override
    public void onListItemClick(ListView listView, View itemView, int position, long id) {

        if (listener != null) {

        listener.itemClicked(id);

        }

    }


}
