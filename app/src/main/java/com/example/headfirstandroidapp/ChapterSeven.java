package com.example.headfirstandroidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



//////Basically in chapter seven we will work with
///// 1.how to add toolbar
///// 2.Add button
///// 3.Up button(not back button.Back button get us back to the previous activity.But up button get us back to the parent activity
/////    for that we have to set an activity as parent activity in the app menifest)
///// 4.Share content button



/////this AppCompatActivity is a subclass of Activity class.It also maintain all the activity lifecycle but it gives extra
/////facilities to work with updated theme(app bar) under "v7 appCompat library (support librayry)"
/////The Support Libraries mean that you can give users on older devices the
//////same experience as users on newer devices even if they’re using different versions of Android.

//////Some Support Libraries are ;
//////v4 support Library = Includes the largest set of features, such as support for application components and user interface features.
//////v7 AppCompat Library = Includes support for app bars
//////v7 Cardview Library = Adds support for the CardView widget, allowing you to show information inside cards.
//////Constraint Layout Library = Allows you to create constraint layouts. You used features from this library in Chapter 6
//////v7 RecyclerView Library = Adds support for the RecyclerView widget.
//////Design Support Library = Adds support for extra components such as tabs and navigation drawers.

////////We’re going to use one of the themes from the v7 AppCompat Library,
///////so we need to add the library to our project as a dependency. Doing so
///////means that the library gets included in your app, and downloaded to
///////the user’s device.


//////*********Your activity needs to extend the AppCompatActivity class
//////instead of the Activity class whenever you want an app bar that
//////provides backward compatibility with older versions of Android.********



/////Actionbar vs Toolbar
/////Whenn we add a simple appbar by including theme(<style name="AppTheme" parent="Theme.AppCompat.Light.NoActionBar">)
/////we use Actionbar class.But when we want use the latest featured app bar we need to use Toolbar class from AppCompat
///// support library


/////How to add Toolbar
/////We’re going to change our activity so that it uses a toolbar from
/////the Support Library for its app bar. Whenever you want to use the
/////Toolbar class from the Support Library, there are a number of

/////steps you need to perform:

/////STEP 1 : Add the v7 AppCompat Support Library as a dependency.
/////This is necessary because the Toolbar class lives in this library.

/////How to check either my project is add to any libraries or not:
/////search:project structure -> app modules ->dependencies(in dependencies there will be a name of support library if it is by default in my project)

/////If the AppCompat Library hasn’t been added for you, you will need to
/////add it yourself. Click on the “+” button at the bottom or right side of
/////the Project Structure screen. Choose the Library Dependency option,
/////select the appcompat-v7 library, then click on the OK button. Click on
/////OK again to save your changes and close the Project Structure window.


/////STEP 2 ; Make sure your activity extends the AppCompatActivity class.
/////Your activity must extend AppCompatActivity (or one of its subclasses)
/////in order to use the Support Library toolbar.

/////STEP 3 : Remove the existing app bar.
/////You do this by changing the theme to one that doesn’t include an app bar.

/////STEP 4 : Add a toolbar to the layout.
/////The toolbar is a type of view, so you can position it where you want and
/////control its appearance.

/////STEP 5 : Update the activity to set the toolbar as the activity’s app bar.
/////This allows the activity to respond to the toolbar.


////Now we need a menu resource file to perform action through our app bar.
////An action provider is an action that defines its own appearance and behavior
////In Menu resource file there is <item> and each <item> performs different actions.
////The action includes a number of other attributes that determine how
////the action appears on the app bar


////We’re going to create a new menu resource file called menu_main.xml in the
////folder app/src/main/res/menu. All menu resource files go in this folder.
////To create the menu resource file, select the app/src/main/res folder, go to
////the File menu, and choose New. Then choose the option to create a new
////Android resource file. You’ll be prompted for the name of the resource
////file and the type of resource. Give it a name of “menu_main” and a
////resource type of “Menu”, and make sure that the directory name is menu.
///When you click on OK, Android Studio will create the file for you , and
///add it to the app/src/main/res/menu folder.



/////******Item Attribute*********(this are applied in menu resource file example: menu.xml)

////android:icon="@drawable/ic_add_white_24dp"(action icon),

////android:orderInCategory="1"(Actions with a lower number will appear before actions with a higher number)

////app:showAsAction="ifRoom"
////(ifRoom=Place the item in the app bar if there’s space. If there’s not space, put it in the overflow)
////(withText=Include the item’s title text////never=Put the item in the overflow area, and never in the main app bar)
////(always=Always place the item in the main area of the app bar. This value should be used sparingly; if you apply this to many items, they may overlap each other)

public class ChapterSeven extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_seven);
    }

    public void onClickLaunch(View view) {
        Intent cheezLaunch=new Intent(this,CheezMenu.class);
        startActivity(cheezLaunch);
    }
}
