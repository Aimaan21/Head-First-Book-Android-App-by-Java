package com.example.headfirstandroidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ChapterNextIndex extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_next_index);
    }

    public void onClickChapter7(View view) {
        Intent ch7=new Intent(this,ChapterSeven.class);
        startActivity(ch7);
    }

    public void onClickChapter8(View view) {
        Intent ch8=new Intent(this,ChapterEight.class);
        startActivity(ch8);
    }
}
