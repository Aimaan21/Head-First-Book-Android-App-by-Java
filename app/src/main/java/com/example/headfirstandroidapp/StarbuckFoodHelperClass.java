package com.example.headfirstandroidapp;

public class StarbuckFoodHelperClass {
    private String foodName;
    private String foodDescription;
    private int foodImageID;

   public static final StarbuckFoodHelperClass[] foodList={new StarbuckFoodHelperClass("Sausage, Cheddar & Egg Sandwich","A savory sausage patty, fluffy eggs and aged Cheddar cheese are served on a perfectly toasty English muffin. An iconic breakfast sandwich that reminds you why you love breakfast",R.drawable.starbuck_food1),
            new StarbuckFoodHelperClass("Double-Smoked Bacon, Cheddar & Egg Sandwich","Bacon smoked for six hours over hickory wood chips is stacked with a fluffy egg patty topped with a creamy melted slice of sharp cheddar cheese on our signature croissant bun. It's double smoked delicious to fill you up",R.drawable.starbuck_food2),
            new StarbuckFoodHelperClass("Chicken & Fig Spread","Roasted herbed white meat chicken is layered with sweet fig spread, peppery arugula and Dijon aioli on a hearty Bavarian multigrain bread. Made with chicken that is raised without antibiotics",R.drawable.starbuck_food3),
            new StarbuckFoodHelperClass("Chipotle Chicken Wrap","Chipotle-seasoned white-meat chicken, veggie slaw, cucumber, cilantro, jalapeño cream cheese and avocado dressing in a chili tortilla",R.drawable.starbuck_food4)};

    StarbuckFoodHelperClass(String foodName,String foodDescription,int foodImageID)
    {
        this.foodName=foodName;
        this.foodDescription=foodDescription;
        this.foodImageID=foodImageID;
    }

    public int getFoodImageID() {
        return foodImageID;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public String getFoodName() {
        return foodName;
    }
    public String toString()
    {
        return this.foodName;
    }
}
