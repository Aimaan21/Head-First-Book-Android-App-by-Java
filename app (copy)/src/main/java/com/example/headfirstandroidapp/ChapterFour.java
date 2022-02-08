package com.example.headfirstandroidapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ChapterFour extends AppCompatActivity {
    private int seconds;
    private  boolean running;
    private boolean wasRunning;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_four);
        //When we rotate our mobile our current activity gets destroyed because of activity's physical configuration gets changed
        //So if we don't save our current data of our activity,we will lose it when we will rotate our device
        //Such as: if we start our stopwatch and after 5 seconds if we rotate our device it will not continue rather it will start from 0 despite not pressing the restart button
        //because earlier activity was destroyed and a new activity has been created
        //so we wil have to save data of that situation of the activity before rotating the device


        //There are two ways.
        //One is bypassing onCreate() and onStart() method by changing in manifest of that activity
        //******<activity android:name=".ChapterFour"
        //******android:configChanges="orientation|screenSize"></activity>

        //when the activity is not destroyed,onSaveInstantState() doesn't get called.so saveInstantstate is null
        //but when onSaveInstantState gets called,saveInstatntState(as it is Bundle type) hae the value of seconds,running,wasRunning
        if (savedInstanceState != null) {
            seconds=savedInstanceState.getInt("seconds");
            running= savedInstanceState.getBoolean("running");
            wasRunning=savedInstanceState.getBoolean("wasRunning");
        }

        runTimer();
    }

    //Another approach is onSaveInstantState() method.
    //onSaveInstantState() mehtod gets called right before onStop() and onDestroyed() method.
    // It takes one parametre which is Bundle type.
    //Bundle can take more than one variable's data and can bind them into Bundle.
    //Like saveInstantState is a Bundle type.And it putiing the values of seconds as "seconds",running,wasRunning.
    @Override
    public void onSaveInstanceState(Bundle saveInstanceState) {
        super.onSaveInstanceState(saveInstanceState);
        saveInstanceState.putInt("seconds", seconds);
        saveInstanceState.putBoolean("running", running);
        saveInstanceState.putBoolean("wasRunning", wasRunning);
    }

    //
    protected void onPause()
    {
        super.onPause();
        wasRunning=running;
        running=false;
    }

    @Override
    protected void onStop() {
        super.onStop();
        wasRunning=running;
        running=false;
    }


    protected void onResume() {

        super.onResume();
        if(wasRunning)
        {
            running=true;
        }
    }




    public void onClickStartStopWatch(View view) {
        running=true;
    }

    public void onClickStopStopWatch(View view) {
        running=false;
    }

    public void onClickRestartStopWatch(View view) {
        running=true;
        seconds=0;
    }
    public void onClickNext(View view) {
        Intent activityLifeCycle=new Intent(this,ActivityLifeCycle.class);
        startActivity(activityLifeCycle);
    }

    public void runTimer(){
        final TextView timeView=(TextView) findViewById(R.id.textStopWatch);

        final Handler handler=new Handler();

        handler.post(new Runnable() {

            public void run() {
                int hour=seconds/3600;
                int minute=(seconds%3600)/60;
                int sec=seconds%60;

                String time=String.format("%d:%02d:%02d",hour,minute,sec);

                timeView.setText(time);

                if(running)
                {
                    seconds++;
                }

                handler.postDelayed(this,1000);

            }
        });


    }


}
