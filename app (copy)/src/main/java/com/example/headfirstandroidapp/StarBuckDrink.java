package com.example.headfirstandroidapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class StarBuckDrink extends Activity {


    public static final String EXTRA_DRINKPOSITION ="position" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_star_buck_drink);

        //Get the drink from the intent

        int position=getIntent().getExtras().getInt(EXTRA_DRINKPOSITION);

        DrinkHelperClass drink = DrinkHelperClass.drinks[position];
        //Populate the drink name
        //Use the drinkId to get details of
        //the drink the user chose.
        TextView name = (TextView)findViewById(R.id.textViewStarBuckCoffeeName);
        name.setText(drink.getName());
        //Populate
        //the views
        //with the
        //drink data.
        //Populate the drink description
        TextView description = (TextView)findViewById(R.id.textViewStarBuckCoffeeDescription);
        description.setText(drink.getDescription());
        //Populate the drink image
        ImageView photo = (ImageView)findViewById(R.id.imageViewStarBuckCoffeePhoto);
        photo.setImageResource(drink.getImageResourceId());
        photo.setContentDescription(drink.getName());
    }
}
