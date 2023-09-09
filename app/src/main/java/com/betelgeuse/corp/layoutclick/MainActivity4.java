package com.betelgeuse.corp.layoutclick;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void startLayout1(View View){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void startLayout2(View View){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
    public void startLayout3(View View){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}