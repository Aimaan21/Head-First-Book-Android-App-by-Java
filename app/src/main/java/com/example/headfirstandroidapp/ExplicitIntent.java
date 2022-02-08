package com.example.headfirstandroidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ExplicitIntent extends AppCompatActivity {

    public static final String getMessage="message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);

        Intent intent=getIntent();
        String message=intent.getStringExtra(getMessage);

        TextView showMessage=(TextView) findViewById(R.id.receivedMessage);

        showMessage.setText(message);

    }
}
