package com.example.headfirstandroidapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StarBuckFoodCategory extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_star_buck_food_category);

        ArrayAdapter<StarbuckFoodHelperClass> foodAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,StarbuckFoodHelperClass.foodList);
        ListView foodListView=(ListView) findViewById(R.id.listViewStarBuckFoodMenuOption);
        foodListView.setAdapter(foodAdapter);

        AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> foodListView, View itemView, int position, long id) {

                Intent intent=new Intent(StarBuckFoodCategory.this,StarbuckFood.class);
                intent.putExtra(StarbuckFood.Extra_ID,position);
                startActivity(intent);

            }
        };
       foodListView.setOnItemClickListener(itemClickListener);

    }
}
