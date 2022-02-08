package com.example.headfirstandroidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class StarbuckFood extends AppCompatActivity {


    public static final String Extra_ID ="Food ID" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starbuck_food);

        Integer foodID=getIntent().getExtras().getInt(Extra_ID);
        StarbuckFoodHelperClass food=StarbuckFoodHelperClass.foodList[foodID];

        TextView foodName=(TextView)findViewById(R.id.textViewStarBuckFoodName);
        TextView foodDescription=(TextView)findViewById(R.id.textViewStarBuckFoodDescription);
        ImageView foodPhoto=(ImageView)findViewById(R.id.imageViewStarBuckFoodPhoto);

        foodName.setText(food.getFoodName());
        foodDescription.setText(food.getFoodDescription());
        foodPhoto.setImageResource(food.getFoodImageID());

    }
}
