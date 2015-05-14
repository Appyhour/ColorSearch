package com.example.ruairi.colorsearch;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class colorTwo extends ActionBarActivity {


    private TextView colorTwoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_two);

        Intent intent = getIntent();

        colorTwoButton = (TextView) findViewById(R.id.colorTwoButton);


        colorTwoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMessageToColorOne();
            }
        });
    }

    public void sendMessageToColorOne() {
        Intent intent = new Intent(this, colorThree.class);
        startActivity(intent);

    }
}