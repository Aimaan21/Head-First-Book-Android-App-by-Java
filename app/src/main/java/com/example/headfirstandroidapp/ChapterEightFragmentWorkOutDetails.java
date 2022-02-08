package com.example.headfirstandroidapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ChapterEightFragmentWorkOutDetails extends Fragment {


    private long workoutId;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chapter_eight_fragment_work_out_details, container, false);
    }

    public void onStart() {

        super.onStart();

        View view = getView();

        if (view != null) {
            TextView title = (TextView) view.findViewById(R.id.textTitleWorkOut);
            ChapterEightWorkOutHelperClass workout = ChapterEightWorkOutHelperClass.workouts[(int) workoutId];
            title.setText(workout.getName());
            TextView description = (TextView) view.findViewById(R.id.textDescriptionWorkOut);
            description.setText(workout.getDescription());
        }

    }

    public void setWorkout(long id){
        this.workoutId = id;
    }

}