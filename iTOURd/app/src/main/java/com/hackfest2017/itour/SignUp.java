package com.hackfest2017.itour;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;


public class SignUp extends AppCompatActivity {
    LinearLayout namelayout;
    LinearLayout usernamelayout;
    LinearLayout passwordlayout;
    LinearLayout genderlayout;
    EditText nametext;
    public static EditText usernametext;
    EditText password;
//    RadioButton rdomale;
//    RadioButton rdofemale;
    Button Signup_submit;
    RadioGroup rg;
    Record record;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        namelayout = (LinearLayout) findViewById(R.id.namelayout);
        usernamelayout = (LinearLayout) findViewById(R.id.usernamelayout);
        passwordlayout = (LinearLayout) findViewById(R.id.passwordlayout);
        genderlayout = (LinearLayout) findViewById(R.id.genderlayout);
        nametext = (EditText) findViewById(R.id.nametext);
        usernametext = (EditText) findViewById(R.id.usernametext);
        password = (EditText) findViewById(R.id.password);
        textView = (TextView) findViewById(R.id.textView);
        // rdomale = (RadioButton) findViewById(R.id.radiomale);
        //rdofemale = (RadioButton) findViewById(R.id.radiofemale);
        Signup_submit = (Button) findViewById(R.id.Signup_submit);
        rg = (RadioGroup) findViewById(R.id.RG);


        record = new Record(this,null,null,1);
         // printDatabase();
    }


        public void BtnClicked(View view) {
        Database database = new Database(usernametext.getText().toString(),nametext.getText().toString(),password.getText().toString());
            record.insert(database);
            record.insert1(database);
            record.insert2(database);

            Log.e("demo","before print db");
//        printDatabase();
            if(usernametext.getText().toString() != null) {
                startActivity(new Intent(SignUp.this, Selection.class));
            }
            else
                textView.setText("Fill all the fields");
    }

  /*public void printDatabase()
   {
     String dbstring =  record.DbToString();
     textView.setText(dbstring);
       Log.e("demo","print executed");

   }

    public void onSignUpButtonClick(){
        int id = rg.getCheckedRadioButtonId();
        RadioButton rb = (RadioButton) findViewById(id);
        String name = (String) rb.getText();
    }*/



}


