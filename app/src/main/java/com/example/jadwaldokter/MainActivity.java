package com.example.jadwaldokter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.jadwaldokter.Main2Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.rikihermawan);
        btn.setOnClickListener(new View.OnClickListener()
        {


            @Override
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(i);
            }
        });
        getSupportActionBar().setSubtitle("Nida Azizah Zahra / 311710637 / TI/17/B3");


    }
}