package com.example.headfirstandroidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChapterIndex extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_index);
    }

    public void onClickChapter2(View view) {

        Button ch2=(Button) findViewById(R.id.buttonChapter2);
        Intent chapter2=new Intent(this,ChapterTwo.class);
        ///Explicit Intent(We will discuss about it in chapter 3)

        startActivity(chapter2);
        ///Starting the next activity which is ChapterTwo

    }

    public void onClickChapter3(View view) {
        Button ch3=(Button) findViewById(R.id.buttonChapter3);
        Intent chapter3=new Intent(this,ChapterThree.class);

        startActivity(chapter3);
        ///Starting the next activity which is ChapterThree

    }

    public void onClickChapter4(View view) {
        Button ch4=(Button) findViewById(R.id.buttonChapter4);
        Intent chapter4=new Intent(this,ChapterFour.class);

        startActivity(chapter4);
        ///Starting the next activity which is ChapterFour
    }

    public void onClickChapter5(View view) {
    }

    public void onClickChapter6(View view) {
        Intent chapter6=new Intent(this,ChapterSix.class);
        startActivity(chapter6);
    }

    public void onClickNext(View view) {
        Intent next=new Intent(this,ChapterNextIndex.class);
        startActivity(next);
    }
}
