package com.example.headfirstandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ChapterEightWorkOutDetails extends AppCompatActivity {

    public static final String EXTRA_WORKOUT_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_eight_work_out_details);

        ChapterEightFragmentWorkOutDetails frag = (ChapterEightFragmentWorkOutDetails) getSupportFragmentManager().findFragmentById(R.id.workout_details_frag);

        int workoutId = (int) getIntent().getExtras().get(EXTRA_WORKOUT_ID);

        frag.setWorkout(workoutId);
    }
}
