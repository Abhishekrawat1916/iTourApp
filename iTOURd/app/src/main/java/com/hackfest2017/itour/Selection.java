//package com.hackfest2017.itour;
//
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//
//public class Selection extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_selection);
//    }
//}
package com.hackfest2017.itour;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;

public class Selection extends AppCompatActivity {
    Button btncustom;
    Button btnmanual;

    private PopupWindow PopUp;
    private RelativeLayout positionOfPopUp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);

        btncustom = (Button) findViewById(R.id.btncustom);
        positionOfPopUp = (RelativeLayout) findViewById(R.id.popUp_position);
        btnmanual = (Button) findViewById(R.id.btnmanual);
        btncustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Selection.this,Ques1.class));
            }
        });
        btncustom.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                LayoutInflater Inflater = (LayoutInflater) getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
                View customView = Inflater.inflate(R.layout.popup_layout1, null);

                PopUp = new PopupWindow(
                        customView,
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT
                );
                ImageButton closepopup = (ImageButton) customView.findViewById(R.id.close1);

                closepopup.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        PopUp.dismiss();
                    }
                });
                PopUp.showAtLocation(positionOfPopUp, Gravity.CENTER, 0, 0);
                return false;
            }
        });
        btnmanual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Selection.this,MapsActivity.class));
            }
        });

        btnmanual.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                LayoutInflater Inflater = (LayoutInflater) getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
                View customView = Inflater.inflate(R.layout.popup_layout2, null);

                PopUp = new PopupWindow(
                        customView,
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT
                );
                ImageButton closepopup = (ImageButton) customView.findViewById(R.id.close2);

                closepopup.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        PopUp.dismiss();
                    }
                });
                PopUp.showAtLocation(positionOfPopUp, Gravity.CENTER, 0, 0);
                return false;
            }
        });
    }
}
