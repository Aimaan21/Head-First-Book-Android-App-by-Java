package com.example.headfirstandroidapp;

import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ShareActionProvider;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class CheezOrder extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheez_order);
        Toolbar toolbar=findViewById(R.id.cheezOrderToolBar);
        setSupportActionBar(toolbar);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);///This enables the back(up) button which parent is defined in the menifest


    }


    /////Here onClickDone is for the FAB(Floating Action Button)
    ////When someone has to order a place,this will save it
    ////And a Snackbar(Toast) will appear with a message that "Your order has been done"
    ///But Snackbar is a featured toast with "Action".here undo is a action
    public void onClickDone(View view) {
        CharSequence text="Your order has been done";
        int duration= Snackbar.LENGTH_SHORT;
        Snackbar snackbar=Snackbar.make(findViewById(R.id.cheezOrder),text,duration);
        snackbar.setAction("Undo", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(CheezOrder.this, "Undone!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        snackbar.show();
    }
}
