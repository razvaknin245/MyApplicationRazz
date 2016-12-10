package com.example.user.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity
{
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Login(View view,EditText mEdit,EditText sText,EditText senText) throws Exception
    {
        mEdit = (EditText)mEdit.findViewById(R.id.Username);
        sText = (EditText)sText.findViewById(R.id.password);
        //for send username and password to Db to check if exist
    }

}