package com.example.ruairi.colorsearch;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class intro extends ActionBarActivity {

    private TextView introButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        introButton = (TextView)findViewById(R.id.introButton);


        introButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMessageToColorOne();
            }
        });}

    public void sendMessageToColorOne() {
        Intent intent = new Intent(this, colorOne.class);
        startActivity(intent);



    }



}
