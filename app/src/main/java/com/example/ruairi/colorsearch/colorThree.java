package com.example.ruairi.colorsearch;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class colorThree extends ActionBarActivity {

    private TextView colorThreeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_three);

        Intent intent = getIntent();


        colorThreeButton = (TextView)findViewById(R.id.colorThreeButton);


        colorThreeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMessageToColorOne();
            }
        });}

    public void sendMessageToColorOne() {
        Intent intent = new Intent(this, end.class);
        startActivity(intent);



    }



}