package com.example.headfirstandroidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ChapterEightWorkOutList extends AppCompatActivity implements ChapterEightFragmentWorkoutList.Listener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_eight_work_out_list);
        ChapterEightFragmentWorkOutDetails frag = (ChapterEightFragmentWorkOutDetails) getSupportFragmentManager().findFragmentById(R.id.workout_list_frag);

    }
    public void itemClicked(long id) {
        Intent intent = new Intent(this, ChapterEightWorkOutDetails.class);
        intent.putExtra(ChapterEightWorkOutDetails.EXTRA_WORKOUT_ID, (int)id);
        startActivity(intent);
    }


}

