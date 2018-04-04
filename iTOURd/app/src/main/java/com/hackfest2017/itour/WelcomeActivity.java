package com.hackfest2017.itour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent sign_in_intent = new Intent(WelcomeActivity.this,SignIn.class);
                startActivity(sign_in_intent);
            }
        });

        Button button1 = (Button)findViewById(R.id.button1);//button created
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent sign_up_intent = new Intent(WelcomeActivity.this,SignUp.class);
                startActivity(sign_up_intent);
            }
        });
    }







}
