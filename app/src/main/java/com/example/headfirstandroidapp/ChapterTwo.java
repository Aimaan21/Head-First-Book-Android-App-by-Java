package com.example.headfirstandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class ChapterTwo extends AppCompatActivity {

    private ChapterTwoHelperClass brandlist=new ChapterTwoHelperClass();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_two);
    }

    public void onClickFindBeer(View view) {
        TextView brandName=(TextView) findViewById(R.id.textBeerBrand);
        ///This textview will show the brand name when user will press FIND BEER button

        Spinner beerColor=(Spinner) findViewById(R.id.spinner);
        ///Here we are creating object for Spinner and calling entities [amber,brown,dark brown,ligth] from chapter_two_xml by R.id.spinner

        String color=String.valueOf(beerColor.getSelectedItem());
        ///getting the values from beerColor object by String.valueOf(Object type) method and putting them in 'color' string

        Button findBeer=(Button) findViewById(R.id.buttonFindBeer);

        List<String> listOfBrand=brandlist.getBrand(color);
        /// String listOfBrand is holding the brands of beer

        StringBuilder brandNameFormation=new StringBuilder();
        /// For listing orientation

        for(String brand:listOfBrand)///here getting one brand name from listOfBrand(Array List type) at each iteration of the for each loop and putting it in String brand
        {
            brandNameFormation.append(brand).append('\n');///brandNameFormation is just orienting the brand name in listing order

        }


        brandName.setText(brandNameFormation);///finally setting the text


        ////**** there is a helper class ChapterTwoHelperclass which actually returns the brand name
        ////**** Spinner Item are added through array(beer_colors) in Values(strings.xml) which are included in activity_chapter_two.xml by "android:entries="@array/beer_colors" in <Spinner> </Spinner> block
    }
}
