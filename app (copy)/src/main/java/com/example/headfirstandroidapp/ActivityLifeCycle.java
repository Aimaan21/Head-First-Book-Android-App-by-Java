package com.example.headfirstandroidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityLifeCycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
    }

    public void onClickNext(View view) {
        Intent intent=new Intent(this,StopWatchAppAndAcitivityLifeCycle.class);
        startActivity(intent);
    }
}
