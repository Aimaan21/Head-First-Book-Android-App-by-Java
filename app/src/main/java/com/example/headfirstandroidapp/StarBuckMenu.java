package com.example.headfirstandroidapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class StarBuckMenu extends Activity
////Make sure your app extends Activiy class
{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_star_buck_menu);
        //ListView is a SubClass of AdapterView Class.
        //List View is a view where items are shown in listing manner
        //ListView and Spinner kind a same but in spinner when you click a dropdown list comes with the items on the screen
        //but List View by defaultly show the item


        //You make the items in a list view respond to clicks by
        //implementing an event listener.
        //An event listener allows you to listen for events that take
        //place in your app, such as when views get clicked, when
        //they receive or lose the focus, or when the user presses a
        //hardware key on their device. By implementing an event
        //listener, you can tell when your user performs a particular
        //action—such as clicking on an item in a list view—and
        //respond to it.

        //OnItemClickListenr is a event(also a nested class) under AdapterView Class.In OnItemClickListner even there is a method name onItemClick()
        //This method has four parametre.
        //first parametre:the view type that was clicked(In this case List View)
        //the rest three parametres are representing the item
        //Like itemView representing the item that was clicked which is a textView
        //postion(start at 0 postion) representing the postion of the item in ListView
        //id represting the row Id of the clicked Item
        ListView menuList=(ListView) findViewById(R.id.listViewStarBuckMenuOption);

        AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {

             if(position==0)
             {
                 Intent intent=new Intent(StarBuckMenu.this,StarBuckDrinkCategory.class);
                 startActivity(intent);
             }
             else if(position==1)
             {
                 Intent intent=new Intent(StarBuckMenu.this,StarBuckFoodCategory.class);
                 startActivity(intent);
             }

            }
        };
        menuList.setOnItemClickListener(itemClickListener);
        //Here we are adding Listner to the ListView

        /////Make sure your activity extends Acitivity class which has been done above


    }
}
