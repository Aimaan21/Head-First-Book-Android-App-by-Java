package com.example.headfirstandroidapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import static android.os.Build.ID;

public class StarBuckDrinkCategory extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_star_buck_drink_category);
        //There’s one key difference between the list view we’re creating
        //here, and the one we created in activity_star_buck_menu.xml: there’s no
        //android:entries attribute here. But why?
        //In activity_star_buck_menu.xml, we used the android:entries
        //attribute to bind data to the list view. This worked because the data
        //was held as a static String array resource. The array was described
        //in strings.xml, so we could easily refer to it using:
        //android:entries="@array/starbuck_options_list"
        //where options is the name of the String array.
        //        Using android:entries works fine if the data is a static array
        //in strings.xml. But what if it isn’t? What if the data is held in an
        //array you’ve programmatically created in Java code, or held in a
        //database? In that case, the android:entries attribute won’t
        //work.
        //        If you need to bind your list view to data held in something other
        //than a String array resource, you need to take a different approach;
        //you need to write activity code to bind the data. In our case, we
        //need to bind our list view to the drinks array in the DrinkHelperClass class.

        ArrayAdapter<DrinkHelperClass> listAdapter = new ArrayAdapter<>(this,  android.R.layout.simple_list_item_1,  DrinkHelperClass.drinks);
        //ArrayAdapter takes three parametre.They are:   referance of this class  ,      This is a built-in layout,               the array
                                                                                       //resource. It tells the array
                                                                                       //adapter to display each item in
                                                                                       //the array in a single text view.

              //Basically behind the scene the array adapter takes the value of toString() method in the DrinkHelperClass and convert them to string and put each of
              // them as textview and then show every textview as a single row.
              //here in DrinkHelperClass's toString() method we have put the Drink name

        //If you need to display data in a list view that comes from a source
        //other than strings.xml (such as a Java array or database), you need
        //to use an adapter. An adapter acts as a bridge between the data
        //source and the list view
        //There are several different types of adapter. For now, we’re
        //going to focus on array adapters.
        //An array adapter is a type of adapter that’s used to bind
        //arrays to views. You can use it with any subclass of the
        //AdapterView class, which means you can use it with both list
        //views and spinners.
        //        In our case, we’re going to use an array adapter to display data
        //from the Drink.drinks array in the list view.

        ListView listDrinks = (ListView) findViewById(R.id.listViewStarBuckDrinMenuOption);
        listDrinks.setAdapter(listAdapter);
        //listAdapter has drink name.By setAdapter we are setting the adapter and getting the list view through listDrink.


             //Create a listener to listen for clicks.
             //Create the listener
                AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener()
                {

                    public void onItemClick(AdapterView<?> listDrinks, View itemView,int position, long id)
                    {
                         //Pass the drink the user clicks on to DrinkActivity
                        //When the user clicks
                        Intent intent = new Intent(StarBuckDrinkCategory.this, StarBuckDrink.class);
                        intent.putExtra(StarBuckDrink.EXTRA_DRINKPOSITION,position);
                        startActivity(intent);

                    }
                };


                listDrinks.setOnItemClickListener(itemClickListener);
    }
}
