package com.example.headfirstandroidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ChapterThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_three);

    }

    public void onClickExplicitIntent(View view) {
        EditText editText=(EditText) findViewById(R.id.editTextMessage);

        String message=editText.getText().toString();
        ///here we are getting the typed text by ".getText()" and converting the text into string by ",toStrung()"

        Button buttonExplicitIntent=(Button) findViewById(R.id.buttonExplcitIntent);

        Intent explicitIntent=new Intent(this,ExplicitIntent.class);

        explicitIntent.putExtra(ExplicitIntent.getMessage,message);
        ///Here we are passing data from this activity to ExplicitIntent Activity
        /// ExplicitIntent.getMessage is the variable name which is in ExplicitIntent activity  and "message" is data we are passing into ExplicitIntent Activity

        explicitIntent.setType("text/plain");
        ///setting the datatype we are passing(optional)

        if(message.equals(""))
        {
            Toast.makeText(this, "Type Something", Toast.LENGTH_SHORT).show();
        }
        else
        {
            startActivity(explicitIntent);
        }
    }



    public void onClickImplicitIntent(View view) {

        ////Implicit Intent is like using activity of other app according to its directed Action.
        ////Like Action.Send use gmail,message,whatsapp etc
        //// Action.Web use google chrome

        EditText editText=(EditText) findViewById(R.id.editTextMessage);

        String message=editText.getText().toString();

        String title=getString(R.string.implicit_intent_title);
        ///this is one of the ways of getting string from resource which is values's string.xml

        Button buttonImplicitIntent=(Button) findViewById(R.id.buttonImplicitIntent);

        Intent implicitIntent=new Intent(Intent.ACTION_SEND);
        /// if we just use the above line and don't use the Intent.createChooserMethod() then the activity will ask for the
        ///permission "just once and always" and eventually if we select "always" then your created app will always use that
        ///particular app for the sending action and won't show other message sending type app option later

        ///////*********Code-> //
        Intent intent=Intent.createChooser(implicitIntent,title);//**********
        /// if we don't use the above line it will not show all the apps option every time
        ///every time it will show all yhe message sending app
        ///if we use the Intent.createChooser() method,you app in fact won't ask permisson for "just once and always"

        implicitIntent.putExtra(Intent.EXTRA_TEXT,message);

        implicitIntent.setType("text/plain");

        startActivity(intent);
        ///if we would use Intent.createChooser() method then startActivity() would be startActivity(intent) instead of startActivity(implicitIntent)


        ////****code that we will have to add in AndroidManifest.xml(only for implicit intent)*****
        ///<activity android:name=".ChapterThree" >
        ///    <intent-filter>
        ///        <action android:name="android.intent.action.SEND"/>
        ///        <category android:name="android.intent.category.DEFAULT"/>
        ///       <data android:mimeType="*/*"/>
        ///   </intent-filter>
        ///</activity>
    }


}
