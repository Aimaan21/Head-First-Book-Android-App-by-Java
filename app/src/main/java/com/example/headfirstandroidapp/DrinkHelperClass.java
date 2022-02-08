package com.example.headfirstandroidapp;

public class DrinkHelperClass {

        private String name;
        private String description;
        private int imageResourceId;


        //drinks is an array of four Drinks.
        public static final DrinkHelperClass[] drinks = {
                new DrinkHelperClass("Latte", "A couple of espresso shots with steamed milk",
                        R.drawable.latte),
                new DrinkHelperClass("Cappuccino", "Espresso, hot milk, and a steamed milk foam",
                R.drawable.cappuccino),
                new DrinkHelperClass("Espresso", "Highest quality beans roasted and brewed fresh",
                R.drawable.espresso),
                new DrinkHelperClass("Hot Coffee", "Espresso, hot milk,a steamed milk foam,highest quality beans roasted and brewed fresh",
                        R.drawable.hot_coffee)

        };

        //Each Drink has a name, description, and an image resource
        private DrinkHelperClass(String name, String description, int imageResourceId) {
            this.name = name;
            this.description = description;
            this.imageResourceId = imageResourceId;
        }
        public String getDescription() {
            return description;
        }
        public String getName() {
            return name;
        }

       public int getImageResourceId() {
        return imageResourceId;
       }

       public String toString() {
        return this.name;
        }
        ///this toString() method return the name of the drink which is called (Implicitly) by the ArrayAdapter<DrinkHelperClass> listAdapter in StarBuckDrinkCategory Activity.

}