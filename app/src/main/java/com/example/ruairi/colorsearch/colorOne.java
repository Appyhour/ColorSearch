package com.example.ruairi.colorsearch;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class colorOne extends ActionBarActivity {

    private TextView colorOneButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_one);

        Intent intent = getIntent();


        colorOneButton = (TextView) findViewById(R.id.colorOneButton);


        colorOneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMessageToColorOne();
            }
        });
    }

    public void sendMessageToColorOne() {
        Intent intent = new Intent(this, colorTwo.class);
        startActivity(intent);


    }
}
