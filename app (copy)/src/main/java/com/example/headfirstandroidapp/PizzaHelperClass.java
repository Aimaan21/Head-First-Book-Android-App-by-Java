package com.example.headfirstandroidapp;

//import android.R;

public class PizzaHelperClass {
    private String name;
    private int imageResourceId;

    public static final PizzaHelperClass[] pizzas= new PizzaHelperClass[]{

            new PizzaHelperClass("Four Cheese Pizza", R.drawable.fourcheese_pizza),
            new PizzaHelperClass("Pizza Alfredo", R.drawable.alfredo_pizza),
            new PizzaHelperClass("Pizza Bolognus", R.drawable.bolognus_pizza),
            new PizzaHelperClass("Beef Pizza", R.drawable.beef_pizza),
            new PizzaHelperClass("Pizza SMG", R.drawable.pizza_smg),
            new PizzaHelperClass("Pizza Thi Pie", R.drawable.pizza_thi_pie),
            new PizzaHelperClass("Beef Paperonia", R.drawable.pizza_paperonia)
    };


    private PizzaHelperClass(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }


    public String getName() {
        return name;
    }



    public int getImageResourceId() {
        return imageResourceId;
    }


}
