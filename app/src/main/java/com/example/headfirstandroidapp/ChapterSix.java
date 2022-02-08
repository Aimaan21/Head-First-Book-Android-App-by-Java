package com.example.headfirstandroidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ChapterSix extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_six);
    }

    public void onClickLaunch(View view) {
        Intent starBuckLaunch=new Intent(this,StarBuckMenu.class);
        startActivity(starBuckLaunch);
    }
}
