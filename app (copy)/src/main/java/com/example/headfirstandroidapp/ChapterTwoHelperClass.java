package com.example.headfirstandroidapp;

import java.util.ArrayList;
import java.util.List;

public class ChapterTwoHelperClass {
    List<String> getBrand(String color){

        List<String> brands=new ArrayList<String>();

        if(color.equals("amber"))
        {
            brands.add("Jack Ambers");
            brands.add("Red Moose");
        }
        else
        {
            brands.add("Jale Pale Ale");
            brands.add("Gout Stout");
        }
        return brands;
    }

}
