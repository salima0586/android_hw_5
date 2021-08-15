package com.example.android_hw_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public
class MainActivity extends AppCompatActivity {

    @Override
    protected
    void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        getSupportFragmentManager().beginTransaction().add( R.id.fr_container,new FirstFragment() ).commit();
    }
}