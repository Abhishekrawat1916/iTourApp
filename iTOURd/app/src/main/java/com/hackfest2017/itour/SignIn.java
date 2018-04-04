package com.hackfest2017.itour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SignIn extends AppCompatActivity {
    Record record;
    public static EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        //MANOJhsagbkjh

    }
    public void btnSignIn(View view)
    {
        editText = (EditText) findViewById(R.id.etUserName);
        textView = (TextView) findViewById(R.id.tvSignIn);
        record= new Record(this,null,null,1);
        String dbstring =  record.DbToString();
        if( editText.getText().toString() == dbstring)
        {
            textView.setText("Invalid user");
        }
        else
        {
            Log.e("demo","In btnSignIn");
            startActivity(new Intent(SignIn.this,Selection.class));

        }
    }
}
