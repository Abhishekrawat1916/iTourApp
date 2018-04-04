package com.hackfest2017.itour;


import android.util.Log;

public class Database {
    private String _username;
    private String _fullname;
    private String _password;



    public Database(String text,String text1,String text2) {
        this._username = text;
        this._fullname = text1;
        this._password = text2;

    }

//        public void set_fullname (String _fullname){
//            this._fullname = _fullname;
//        }
//
//    public void set_id(int _id) {
//        this._id = _id;
//    }
//
//    public void set_password(String _password) {
//        this._password = _password;
//    }
//
//    public void set_username(String _username) {
//        this._username = _username;
//        Log.e("demo","After set username in database");
//    }

    public String get_fullname() {
        return _fullname;
    }


    public String get_password() {
        return _password;
    }

    public String get_username() {
        Log.e("demo","After getusername in database");
        return _username;

    }


}

